name := """buletracer"""
organization := "com.ebiz"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.8"

libraryDependencies += filters
libraryDependencies += "com.graphql-java" % "graphql-java" % "2.3.0"
libraryDependencies += "com.fasterxml.jackson.core" % "jackson-core" % "2.9.0.pr1"


