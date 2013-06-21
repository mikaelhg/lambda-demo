Demonstrating a very common filter + sort functionality with:

* Java 8 lambda functionality
* Kotlin, Groovy and Scala
* Google Guava FluentIterable and Predicates
* LambdaJ proxies
* by hand

Also a bonus:

* An enterprise Guava demonstration of how to package filters and comparators with domain classes

To play with the code, install:

* Java 8 b93 from http://jdk8.java.net/ (we don't need to use the lambda preview anymore)
* IntelliJ IDEA 12.1 Community
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

    # LambdaJ
    $MAVEN exec:java -Dexec.mainClass=lambda.LambdaJDemo

Problems:

IntelliJ IDEA 12.1.4 ships with the "external" Scala compiler on by default.
Unfortunately this stops IDEA from compiling the Kotlin part of the project.

To work around this, turn off
File -> Settings -> Project Settings -> Compiler -> "Use external build" and,
if necessary, also disable
File -> Settings -> Project Settings -> Compiler -> Annotation processors -> lambda-demo -> "Enable annotation processing".
