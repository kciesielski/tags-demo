import sbt._
import Keys._

object Plugins extends Build {
  lazy val plugins = Project(
    "plugins",
    file("."),
    settings = Defaults.defaultSettings ++ Seq(
      addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.1")))
}

