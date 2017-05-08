name := """play-java"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.11"

libraryDependencies += filters
libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  javaJdbc,
  "mysql" % "mysql-connector-java" % "5.1.28"
)

lazy val myProject = (project in file(".")).enablePlugins(PlayJava, PlayEbean)


