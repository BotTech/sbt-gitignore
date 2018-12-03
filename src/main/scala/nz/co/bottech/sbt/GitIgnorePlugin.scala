package nz.co.bottech.sbt

import nz.co.bottech.sbt.GitIgnoreTasks._
import sbt._

object GitIgnorePlugin extends AutoPlugin {

  override def trigger = allRequirements

  override def requires = empty

  val autoImport: GitIgnoreKeys.type = GitIgnoreKeys

  import autoImport._

  override lazy val globalSettings = Seq(
    gitIgnoreBaseURL := new URL("https://www.gitignore.io/api/"),
    gitIgnoreList := gitIgnoreListTask.value
  )
}
