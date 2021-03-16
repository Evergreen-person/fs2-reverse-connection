import sbt._

object Dependencies {

  object V {
    val cats = "2.1.1"
    val catsEffect = "2.1.1"
    val fs2 = "2.5.0"
  }

  val cats = "org.typelevel" %% "cats-core" % V.cats
  val catsEffect = "org.typelevel" %% "cats-effect" % V.catsEffect
  val fs2Core = "co.fs2" %% "fs2-core" % V.fs2
  val fs2IO = "co.fs2" %% "fs2-core" % V.fs2

}
