import sbt._
import sbt.Keys._

object Common {
  def dependencies: Seq[ModuleID] =
    Seq(
      "org.typelevel" %% "cats-core" % "2.2.0",
      // "org.scalactic" %% "scalactic" % "3.1.1" % Test,
      // "org.scalatest" %% "scalatest" % "3.1.1" % Test,
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )

  /** Modify the default linter settings from sbt-tpolecat to follow the
    * guidelines set out here:
    *
    * https://alexn.org/blog/2020/05/26/scala-fatal-warnings.html
    */
  def linterConfig(options: Seq[String]): Seq[String] = {
    val linterLevelConfig: String =
      List(
        "-Wconf:",
        "cat=deprecation:warning-verbose,", // warn on deprecations
        "cat=unused-imports:warning-verbose,", // warn on unused imports (so scalafix can remove them)
        "cat=unused-pat-vars:silent,", // ignore unused pattern variables
        "cat=w-flag-numeric-widen:info-summary,", // report the number of numeric widen errors as an info message
        "any:error" // anything else is an error
      ).mkString

    // Add a few extra compiler flags to those from sbt-tpolecat:
    val toAdd: Seq[String] =
      Seq(
        "-Yrangepos", // required by SemanticDB compiler plugin
        linterLevelConfig // set up linter warning/error levels
      )

    // Disable a few defaults from sbt-tpolecat:
    val toRemove: Set[String] =
      Set(
        "-Xfatal-warnings", // don't turn *all* linter warnings into errors. use `linterLevelConfig` above instead
        "-language:existentials", // don't automatically enable existential types
        "-language:implicitConversions", // don't automatically enable implicit conversions
        "-language:experimental.macros" // don't automatically enable macros
      )

    options.filterNot(toRemove) ++ toAdd
  }

  def projectSettings: Seq[Setting[_]] =
    Seq(
      libraryDependencies ++= dependencies,
      scalacOptions ~= linterConfig
    )

  def aggregateSettings: Seq[Setting[_]] =
    Seq(
      // add settings here...
    )
}
