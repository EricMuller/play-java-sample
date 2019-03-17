name := """play-java-sample"""
organization := "com.emu.apps"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.8"

// libraryDependencies += "io.swagger" %% "swagger-play2" % "1.5.3"
// libraryDependencies += "commonio.swagger" %% "swagger-play2" % "1.5.3"

libraryDependencies ++= Seq(
  guice,
  jdbc,
  evolutions
)

//libraryDependencies += "com.typesafe.play" % "play" % "2.7.0"
libraryDependencies += "com.typesafe.play" % "play-enhancer" % "1.2.2"



libraryDependencies += "org.postgresql" % "postgresql" % "9.3-1102-jdbc4"

libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.8.1"

//libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test
//libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.mockito" % "mockito-core" % "2.10.0" % Test

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.12" % Test,
  "com.novocode" % "junit-interface" % "0.11" % Test exclude("junit", "junit-dep")
)


lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

//javaOptions in Test ++= Seq(
//  "-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=51459",
//  "-Xms128M",
//  "-Xmx256M",
//  "-Xss1M",
//  //"-XX:MaxPermSize=384M"
//)

//javaOptions in Test ++= Seq("-Xdebug", "-Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5005")
