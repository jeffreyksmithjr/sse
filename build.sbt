name := "sse"

version := "1.0"


libraryDependencies ++= Seq(
  "junit" % "junit" % "4.11" % "test",
  "org.apache.spark" %% "spark-core" % "2.0.0-preview",
  "org.apache.spark" %% "spark-mllib" % "2.0.0-preview",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)