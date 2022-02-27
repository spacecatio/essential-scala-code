scalaVersion := "2.13.7"

Global / useSuperShell := false
Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val filmdata = project
  .in(file("filmdata"))
  .settings(Common.projectSettings)

lazy val helloworld = project
  .in(file("helloworld"))
  .settings(Common.projectSettings)

lazy val sandbox = project
  .in(file("sandbox"))
  .settings(Common.projectSettings)

lazy val exercise1 = project
  .in(file("exercise1"))
  .settings(Common.projectSettings)

lazy val exercise2 = project
  .in(file("exercise2"))
  .settings(Common.projectSettings)

lazy val exercise3 = project
  .in(file("exercise3"))
  .settings(Common.projectSettings)

lazy val exercise4 = project
  .in(file("exercise4"))
  .dependsOn(filmdata)
  .settings(Common.projectSettings)

lazy val exercise5 = project
  .in(file("exercise5"))
  .settings(Common.projectSettings)

lazy val exercise6 = project
  .in(file("exercise6"))
  .settings(Common.projectSettings)

lazy val exercise7 = project
  .in(file("exercise7"))
  .settings(Common.projectSettings)

lazy val exercise8 = project
  .in(file("exercise8"))
  .dependsOn(filmdata)
  .settings(Common.projectSettings)

lazy val exercises = project
  .in(file("."))
  .settings(Common.aggregateSettings)
  .aggregate(
    helloworld,
    sandbox,
    exercise1,
    exercise2,
    exercise3,
    exercise4,
    exercise5,
    exercise6,
    exercise7,
    exercise8
  )
