package nz.co.bottech.sbt

import java.net.URL

import nz.co.bottech.sbt.GitIgnoreKeys._
import sbt.io.IO
import sbt.{Def, Task}

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
