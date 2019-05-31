import org.scalactic.Requirements._
import org.scalactic.TripleEquals._

scalaVersion := "2.12.7"

TaskKey[Unit]("check") := {
  val log = state.value.log
  log.info("checking example setting")
  val example = (Compile / gitignoreExampleTask).value
  require(example === "computed from example setting: just an example")
}
