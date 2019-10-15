resolvers += Resolver.url(
  "bintray-dialog-sbt-plugins",
  url("http://dl.bintray.com/dialog/sbt-plugins"))(
  Resolver.ivyStylePatterns)

addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.23")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.0")

libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.9.0"
