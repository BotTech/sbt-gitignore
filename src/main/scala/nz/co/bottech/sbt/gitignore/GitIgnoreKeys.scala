package nz.co.bottech.sbt.gitignore

import sbt._

trait GitIgnoreKeys {

  val gitIgnoreBaseURL = settingKey[URL]("The base URL for the gitignore.io API.")
  val gitIgnoreList = taskKey[Seq[String]]("Lists all of the currently supported templates on gitignore.io.")
}

object GitIgnoreKeys extends GitIgnoreKeys
