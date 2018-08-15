name := """sbt-gitignore"""
organization := "nz.co.bottech"
organizationName := "BotTech"
version := "1.0-SNAPSHOT"

sbtPlugin := true

libraryDependencies += "com.lihaoyi" %% "utest" % "0.6.4" % Test
testFrameworks += new TestFramework("utest.runner.Framework")

bintrayPackageLabels := Seq("sbt", "plugin")
bintrayVcsUrl := Some("""git@github.com:BotTech/sbt-gitignore.git""")

initialCommands in console := """import nz.co.bottech.sbt._"""

enablePlugins(ScriptedPlugin)
// set up 'scripted; sbt plugin for testing sbt plugins
scriptedLaunchOpts ++=
  Seq("-Xmx1024M", "-Dplugin.version=" + version.value)
