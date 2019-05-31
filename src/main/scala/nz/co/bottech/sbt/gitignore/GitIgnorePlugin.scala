package nz.co.bottech.sbt.gitignore

import nz.co.bottech.sbt.gitignore.GitIgnoreSettings._
import sbt._
import sbt.plugins.JvmPlugin

object GitIgnorePlugin extends AutoPlugin {

  override def trigger = allRequirements

  override def requires = JvmPlugin

  object autoImport extends GitIgnoreKeys

  override lazy val projectSettings: Seq[Def.Setting[_]] = {
    inConfig(Compile)(rawSettings)
  }
}
