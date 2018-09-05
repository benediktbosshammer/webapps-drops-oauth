name := """webapps-drops-oauth"""

version := "1.0.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers += Resolver.sonatypeRepo("snapshots")

scalaVersion := "2.12.6"

crossScalaVersions := Seq("2.11.12", "2.12.6")

libraryDependencies += ehcache
libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test
libraryDependencies += "com.h2database" % "h2" % "1.4.197"

resolvers += "Sonatype OSS Releases" at "https://oss.sonatype.org/service/local/staging/deploy/maven2"

libraryDependencies += "org.vivaconagua" %% "play2-oauth-client" % "0.4.1"

// exposing the play ports
dockerExposedPorts := Seq(9000, 9443)

dockerRepository := Some("vivaconagua")
version in Docker := version.value

