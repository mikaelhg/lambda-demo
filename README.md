Demonstrating a very common filter + sort functionality with:

* Java 8 stream/lambda functionality
* Google Guava FluentIterable and Predicates
* Kotlin, Groovy and Scala
* by hand

Also a bonus:

* An enterprise Guava demonstration of how to package filters and comparators with domain classes

To play with the code, install:

* Java 8 b121 or newer from http://jdk8.java.net/
* IntelliJ IDEA 13 Community
* Configure IDEA to use JDK8 to compile and run the project code
  (File -> Project Structure -> Project SDK and Language Level)

To run the demos manually:

    export JAVA_HOME=~/Downloads/jdk1.8.0
    export MAVEN=~/local/apache-maven-3.0.5/bin/mvn

    # Build
    $MAVEN clean install

    # Java 8
    $MAVEN exec:java -Dexec.mainClass=lambda.LambdaDemo

    # Google Guava
    $MAVEN exec:java -Dexec.mainClass=lambda.GuavaDemo

    # Kotlin
    $MAVEN exec:java -Dexec.mainClass=lambda.kotlin.KotlinPackage

    # Groovy
    $MAVEN exec:java -Dexec.mainClass=lambda.groovy.GroovyDemo

    # Scala
    $MAVEN exec:java -Dexec.mainClass=lambda.scala.ScalaDemo

    # Enterprise Guava
    $MAVEN exec:java -Dexec.mainClass=lambda.EnterpriseGuavaDemo

Known issues:

IntelliJ IDEA 12.1.4 ships with the "external" Scala compiler on by default.
Unfortunately this stops IDEA from compiling the Kotlin part of the project.

To work around this, turn off
File -> Settings -> Project Settings -> Compiler -> "Use external build" and,
if necessary, also disable
File -> Settings -> Project Settings -> Compiler -> Annotation processors -> lambda-demo -> "Enable annotation processing".
