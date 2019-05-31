package nz.co.bottech.sbt.gitignore

import nz.co.bottech.sbt.gitignore.GitIgnoreKeys._
import sbt._

object GitIgnoreTasks {

  def gitIgnoreListTask: Def.Initialize[Task[Seq[String]]] = Def.task {
    val listURL = gitIgnoreUrl("/list").value
    IO.readLinesURL(listURL).flatMap(_.split(','))
  }

  def gitIgnoreUrl(path: String): Def.Initialize[Task[URL]] = Def.task {
    val baseURL = gitIgnoreBaseURL.value
    new URL(baseURL.toString + path)
  }
}
