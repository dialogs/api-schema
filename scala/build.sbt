import im.dlg.DialogHouseRules

organization := "im.dlg"

name := "dialog-platform-services"

version := "0.2.0.54"

scalaVersion := "2.11.11"

libraryDependencies ++= DialogHouseRules.scalapbGrpcDeps ++ DialogHouseRules.scalapbDeps

PB.protoSources in Compile += baseDirectory.value / ".." / "include"
PB.protoSources in Compile += baseDirectory.value / ".." / "proto"

PB.targets in Compile := Seq(
  scalapb.gen(singleLineToString = true) → (sourceManaged in Compile).value
)

licenses += ("Apache-2.0", url(
  "https://www.apache.org/licenses/LICENSE-2.0.html"))

publishMavenStyle := true

bintrayOrganization := Some("dialog")

bintrayRepository := "dialog"

bintrayOmitLicense := true

DialogHouseRules.defaultDialogSettings
