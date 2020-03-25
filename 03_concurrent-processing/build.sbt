name := "scala-concurrent"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.6.4",
  "com.typesafe.akka" %% "akka-testkit" % "2.6.4" % Test
)
