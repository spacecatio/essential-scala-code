# Code for Spacecat's Essential Scala

Copyright 2022 [Spacecat Ltd][spacecat].

This repository contains exercises and solutions for
[Spacecat's Essential Scala][course] training course.

If you want to discuss the content or exercises with the authors,
contact using the [contact details][contact] on our web site.

## Using the Source Code

This repository contains two branches:
one for `exercises` and one for `solutions`.
The directory structure is the same in each branch.

You will need to have Git and Java
and an internet connection to run the exercises.
Other dependencies are either included with the repository
or downloaded on demand during compilation.

Each exercise is in its own [SBT sub-project][sbt-multi-project]
so it can be compiled and run separately from the rest of the code.
You can see a list of projects by typing `projects` at the SBT prompt:

```bash
sbt:exercises> projects
[info] In file:/.../essential-scala-code/
[info] 	   exercise1
[info] 	   exercise2
[info] 	   exercise3
[info] 	   etc...
```

The projects are as follows:

- `helloworld` is used to verify the setup instructions below;
- `sandbox` is your area to test things out;
- each numbered `exercise` is one of the exercises in the course;
- `exercises` is an "aggregate" project that comprises all of the above.

### Useful Commands

You can run a command on a specific project by typing `projectName/command`,
where `projectName` is one of the names above:

- `projectName/compile` -- compile an exercise;
- `projectName/run` -- run an exercise (recompiles if necessary);
- `projectName/test` -- run the tests for an exercise (recompiles if necessary).

Additionally, the following commands apply to _all_ projects in the buid:

- to compile all the sub-projects at once, type `compile`;
- to run all the unit tests, type `test`.

### Running Commands in Watch Mode

Prefix any of the commands with a tilde (`~`) to run it in watch mode.
The command will run once immediately
then wait for you to save a file before running again.
You can cancel watch mode with `Ctrl+C`.

## Editors and IDEs

If you don't have a preference for a Scala editor or IDE,
we recommend using [Visual Studio Code][vscode] and a Linux or OS X terminal.
See the instructions below to get started.

If you want to use [IntelliJ IDEA][intellij] with the [IntelliJ Scala Plugin][intellij-scala],
follow the instructions for [opening a project][intellij-setup]
in their online documentation.

### Getting started on Linux or macOS

1. To run these exercises, you need a Java 8 compatible JDK.
   If you don't have this already, you can download and install one from
   [Oracle Java SE Development Kit 8+][oraclejdk] or
   [OpenJDK 8+][openjdk].

2. Clone this repository to a directory on your hard drive,
   e.g. `~/essential-scala-code`:

   ```bash
   git clone https://github.com/underscoreio/essential-scala-code.git
   ```

3. Change to the root directory in the repository:

   ```bash
   cd essential-scala-code
   ```

4. Run the `sbt.sh` script.
   You may have to wait while SBT downloads various dependencies:

   ```bash
   ./sbt.sh
   # Lots of output here...
   # The first run will take a while...

   sbt:exercises>
   ```

5. Type `helloworld/run` at the SBT prompt.
   You may have to wait while SBT downloads various dependencies.
   If you see the message `"Hello world!"`, you're ready to go!

   ```bash
   sbt:exercises> helloworld/run
   [info] compiling 1 Scala source ...
   [info] running HelloWorld

   Hello World!

   [success] Total time: 3 s

   ```

### Getting Started on Windows

You will need to have installed Git and Java (we recommend Oracle's Java 8 SDK).
Complete the following steps outlined in Chapter 1 in the section entitled
"Setting up SBT for This Book":

1. To run these exercises, you need a Java 8 compatible JDK on your machine.
   If you don't have this already, you can download and install one from
   [Oracle Java SE Development Kit 8+][oraclejdk] or
   [OpenJDK 8+][openjdk].

2. Clone this repository to a directory on your hard drive,
   e.g. `C:\essential-scala-code`:

   ```windows
   git clone https://github.com/underscoreio/essential-scala-code.git C:\essential-scala-code
   ```

3. Change to the root directory in the repository:

   ```windows
   cd\essential-scala-code
   ```

4. Run the `sbt.bat` script.
   You may have to wait while SBT downloads various dependencies:

   ```windows
   sbt.bat
   # Lots of output here...
   # The first run will take a while...

   sbt:exercises>
   ```

5. Type `helloworld/run` at the SBT prompt.
   You may have to wait while SBT downloads various dependencies.
   If you see the message `"Hello world!"`, you're ready to go!

   ```bash
   sbt:exercises> helloworld/run
   [info] compiling 1 Scala source ...
   [info] running HelloWorld

   Hello World!

   [success] Total time: 3 s

   ```

[spacecat]: https://spacecat.io
[course]: https://spacecat.io/training/essential-scala/
[contact]: https://spacecat.io/about/
[vscode]: https://code.visualstudio.com/
[intellij]: https://www.jetbrains.com/idea
[intellij-scala]: https://www.jetbrains.com/help/idea/discover-intellij-idea-for-scala.html
[intellij-setup]: https://www.jetbrains.com/help/idea/import-project-or-module-wizard.html
[oraclejdk]: http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
[openjdk]: http://openjdk.java.net/install/
[sbt-multi-project]: https://www.scala-sbt.org/1.x/docs/Multi-Project.html
