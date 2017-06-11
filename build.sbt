
name := """buletracer"""
organization := "com.ebiz"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.8"

libraryDependencies += filters
libraryDependencies += jdbc
libraryDependencies += evolutions
libraryDependencies += "com.graphql-java" % "graphql-java" % "2.3.0"
libraryDependencies += "com.fasterxml.jackson.core" % "jackson-core" % "2.9.0.pr1"


libraryDependencies += "org.yaml" % "snakeyaml" % "1.18"
// https://mvnrepository.com/artifact/com.google.inject/guice
libraryDependencies += "com.google.inject" % "guice" % "4.0"

/* Postgresql driver */
libraryDependencies += "org.postgresql" % "postgresql" % "9.4.1212"