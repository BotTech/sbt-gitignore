package nz.co.bottech.sbt

import sbt._

object GitIgnoreKeys {

  val gitIgnoreBaseURL = settingKey[URL]("The base URL for the gitignore.io API.")
  val gitIgnoreList = taskKey[Seq[String]]("Lists all of the currently supported templates on gitignore.io.")
}
