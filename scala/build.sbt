organization := "im.dlg"

name := "dialog-api-schema"

scalaVersion := "2.13.0"

crossScalaVersions := List("2.11.11", "2.12.8", "2.13.0")

libraryDependencies ++= Seq(
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf",
  "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapb.compiler.Version.scalapbVersion,
  "io.grpc" % "grpc-netty" % scalapb.compiler.Version.grpcJavaVersion
)

PB.protoSources in Compile += baseDirectory.value / ".." / "include"
PB.protoSources in Compile += baseDirectory.value / ".." / "proto"

PB.targets in Compile := Seq(
  scalapb.gen(singleLineToProtoString = true) → (sourceManaged in Compile).value
)

licenses += ("Apache-2.0", url("https://github.com/dialogs/api-schema/blob/master/LICENSE"))

publishMavenStyle := true

bintrayOrganization := Some("dialog")

enablePlugins(GitVersioning)
