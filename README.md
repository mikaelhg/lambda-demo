Demonstrating a very common filter + sort functionality with:

* Java 8 stream/lambda functionality
* Google Guava FluentIterable and Predicates
* Kotlin, Groovy and Scala
* by hand

Also a bonus:

* An enterprise Guava demonstration of how to package filters and comparators with domain classes

To play with the code, install:

* mise-en-place
* Java 21
* IntelliJ IDEA Community

To run the demos manually:

    mise use java@zulu-21
 
    # Build
    mvn clean install

    # Java 8
    mvn exec:java -Dexec.mainClass=lambda.LambdaDemo

    # Google Guava
    mvn exec:java -Dexec.mainClass=lambda.GuavaDemo

    # Kotlin
    mvn exec:java -Dexec.mainClass=lambda.kotlin.KotlinDemoKt

    # Groovy
    mvn exec:java -Dexec.mainClass=lambda.groovy.GroovyDemo

    # Scala
    mvn exec:java -Dexec.mainClass=lambda.scala.ScalaDemo

    # Enterprise Guava
    mvn exec:java -Dexec.mainClass=lambda.EnterpriseGuavaDemo
