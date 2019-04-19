resolvers += Resolver.url(
  "bintray-dialog-sbt-plugins",
  url("http://dl.bintray.com/dialog/sbt-plugins"))(
  Resolver.ivyStylePatterns)

addSbtPlugin("im.dlg" % "sbt-dialog-houserules" % "0.1.39")
