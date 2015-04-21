lazy val root = (project in file(".")).
  settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "2.2.1" % "test"
    )
  )
