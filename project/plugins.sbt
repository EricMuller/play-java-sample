resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += "Public SBT repo" at "https://dl.bintray.com/sbt/sbt-plugin-releases/"



// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.7.0")

// Defines scaffolding (found under .g8 folder)
// http://www.foundweekends.org/giter8/scaffolding.html
// sbt "g8Scaffold form"
addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" % "0.11.0")

//generates getters and setters for Java properties
//If you are running in IDEA or Eclipse check that the enhancement plugin is installed. See https://ebean.io/docs/trouble-shooting#not-enhanced
addSbtPlugin("com.typesafe.sbt" % "sbt-play-enhancer" % "1.2.2")
addSbtPlugin("com.typesafe.sbt" % "sbt-play-ebean" % "5.0.1")
