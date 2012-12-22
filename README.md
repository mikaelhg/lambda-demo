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

    JAVA_HOME=~/Downloads/lambda-8-b67-linux-x64-03_dec_2012 ~/local/apache-maven-3.0.3/bin/mvn clean install

    # Java 8
    JAVA_HOME=~/Downloads/lambda-8-b67-linux-x64-03_dec_2012 ~/local/apache-maven-3.0.3/bin/mvn exec:java -Dexec.mainClass=lambda.LambdaDemo

    # Google Guava
    JAVA_HOME=~/Downloads/lambda-8-b67-linux-x64-03_dec_2012 ~/local/apache-maven-3.0.3/bin/mvn exec:java -Dexec.mainClass=lambda.GuavaDemo

    # Kotlin
    JAVA_HOME=~/Downloads/lambda-8-b67-linux-x64-03_dec_2012 ~/local/apache-maven-3.0.3/bin/mvn exec:java -Dexec.mainClass=lambda.namespace

    # Groovy
    JAVA_HOME=~/Downloads/lambda-8-b67-linux-x64-03_dec_2012 ~/local/apache-maven-3.0.3/bin/mvn exec:java -Dexec.mainClass=lambda.GroovyDemo

    # Enterprise Guava
    JAVA_HOME=~/Downloads/lambda-8-b67-linux-x64-03_dec_2012 ~/local/apache-maven-3.0.3/bin/mvn exec:java -Dexec.mainClass=lambda.EnterpriseGuavaDemo

    # LambdaJ
    JAVA_HOME=~/Downloads/lambda-8-b67-linux-x64-03_dec_2012 ~/local/apache-maven-3.0.3/bin/mvn exec:java -Dexec.mainClass=lambda.LambdaJDemo
