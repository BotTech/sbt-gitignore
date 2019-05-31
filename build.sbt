name := "sbt-gitignore"
description := """An sbt plugin that generates .gitignore files from gitignore.io."""
organization := "nz.co.bottech"
organizationName := "BotTech"
homepage := Some(url("https://github.com/BotTech/sbt-gitignore"))
licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

scalaVersion := "2.12.7"

sbtPlugin := true

libraryDependencies += "com.lihaoyi" %% "utest" % "0.6.6" % Test
testFrameworks += new TestFramework("utest.runner.Framework")

enablePlugins(ScriptedPlugin)
scriptedLaunchOpts ++= Seq(
  "-Xmx1024M",
  "-Dplugin.version=" + version.value
)

publishMavenStyle := false

bintrayOrganization := Some("bottech")
bintrayPackageLabels := Seq("sbt", "plugin")

ghreleaseRepoOrg := organizationName.value

publishLocal / gpgSignArtifacts := false
gpgPassphrase := Option(System.getenv("PGP_PASS"))
gpgKeyFile := file("travis") / "key.asc"
gpgKeyFingerprint := "TODO!"
