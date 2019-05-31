package nz.co.bottech.sbt.gitignore

import nz.co.bottech.sbt.gitignore.GitIgnoreKeys._
import nz.co.bottech.sbt.gitignore.GitIgnoreTasks._
import sbt._

object GitIgnoreSettings {

  val rawSettings: Seq[Setting[_]] = Seq(
    gitIgnoreBaseURL := new URL("https://www.gitignore.io/api/"),
    gitIgnoreList := gitIgnoreListTask.value
  )

  def exampleSetting = Def.setting {
    "just an example"
  }
}
