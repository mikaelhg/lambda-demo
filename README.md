Demonstrating a very common filter + sort functionality with:

* Java 8 lambda functionality
* Google Guava FluentIterable and Predicates
* LambdaJ proxies
* by hand

Also a bonus:

* An enterprise Guava demonstration of how to package filters and comparators with domain classes

To play with the code, install:

* http://jdk8.java.net/lambda/
* IntelliJ IDEA 12 Community
* Configure IDEA to use the Lambda preview JDK to compile and run the project code
  (File -> Project Structure -> Project SDK and Language Level)

To run the demos manually:

    export JAVA_HOME=~/Downloads/lambda-8-b75-linux-x64-28_jan_2013
    export MAVEN=~/local/apache-maven-3.0.3/bin/mvn

    # Build
    $MAVEN clean install

    # Java 8
    $MAVEN exec:java -Dexec.mainClass=lambda.LambdaDemo

    # Google Guava
    $MAVEN exec:java -Dexec.mainClass=lambda.GuavaDemo

    # Kotlin
    $MAVEN exec:java -Dexec.mainClass=lambda.KotlinPackage.namespace

    # Groovy
    $MAVEN exec:java -Dexec.mainClass=lambda.groovy.GroovyDemo

    # Enterprise Guava
    $MAVEN exec:java -Dexec.mainClass=lambda.EnterpriseGuavaDemo

    # LambdaJ
    $MAVEN exec:java -Dexec.mainClass=lambda.LambdaJDemo
