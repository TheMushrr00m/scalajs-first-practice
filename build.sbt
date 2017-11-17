enablePlugins(ScalaJSPlugin)

name := "scalajs_test"

version := "0.1"

scalaVersion := "2.12.3"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.1"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true
