ThisBuild / scalaVersion := "3.3.3"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "net.deadblackclover"
ThisBuild / organizationName := "deadblackclover"
ThisBuild / organizationHomepage := Some(url("https://deadblackclover.net/"))
ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision
ThisBuild / licenses ++= Seq(
  "GPL-3.0" -> url("https://www.gnu.org/licenses/gpl-3.0.html")
)
ThisBuild / developers ++= List(
  Developer("deadblackclover", "DEADBLACKCLOVER", "deadblackclover@protonmail.com", url("https://deadblackclover.net/"))
)

lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "example",
    // Warn if an import selector is not referenced.
    scalacOptions += "-Wunused:imports",
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "2.8.1"
    )
  )

// Run scalafmt on compile.
scalafmtOnCompile := true

// Run scalafix on compile.
scalafixOnCompile := true

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
