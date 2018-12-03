scalaVersion := "2.12.6"

TaskKey[Unit]("check") := {
  val list = gitIgnoreList.value
  if (!list.contains("sbt")) {
    sys.error("gitIgnoreList did not contain sbt")
  }
}
