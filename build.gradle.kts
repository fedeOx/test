plugins {
	scala
	application
}
repositories {
	mavenCentral()
}
dependencies {
	implementation("org.scala-lang:scala-library:2.11.12")
}
application {
	mainClassName = "HelloWorld"
}