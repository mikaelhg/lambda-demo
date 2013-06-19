Demonstrating a very common filter + sort functionality with:

* Java 8 lambda functionality
* Google Guava FluentIterable and Predicates
* LambdaJ proxies
* by hand

Also a bonus:

* An enterprise Guava demonstration of how to package filters and comparators with domain classes

To play with the code, install:

* Java 8 b93 from http://jdk8.java.net/ (now you can use the normal main tree JDK8 now, don't need to use the lambda preview anymore)
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

    # Enterprise Guava
    $MAVEN exec:java -Dexec.mainClass=lambda.EnterpriseGuavaDemo

    # LambdaJ
    $MAVEN exec:java -Dexec.mainClass=lambda.LambdaJDemo
