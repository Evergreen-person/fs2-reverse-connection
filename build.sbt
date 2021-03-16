inThisBuild(
  List(
    semanticdbEnabled := true,
    semanticdbVersion := scalafixSemanticdb.revision,
    coverageEnabled := true,
    homepage := Some(url("https://github.com/Evergreen-person/fs2-reverse-connection")),
    licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT")),
    developers :=
      List(Developer("1", "Golubev Gleb", "evergreen9624@yandex.ru", url("https://github.com/Evergreen-person")))
  )
)

onChangedBuildSource in Global := ReloadOnSourceChanges

val fs2ReverseConnection = project
  .in(file("."))
  .enablePlugins(ScalafixPlugin)
  .settings(
    List(
      name := "fs2-reverse-connection",
      version := "0.0.1",
      scalaVersion := "2.13.5",
      coverageHighlighting := true,
      coverageMinimum := 80
    )
  )
  .settings(scalacOptions ++= Seq("-Xlint:unused"))
  .settings(
    libraryDependencies ++= Seq(
      Dependencies.fs2Core,
      Dependencies.fs2IO
    )
  )
