lazy val root = (project in file(".")).
  settings(
    name := "project-euler-scala",
    scalaVersion := "2.11.4",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "2.2.1" % "test"
    )
  )
