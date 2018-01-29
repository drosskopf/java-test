# java-test
Starter Framework for Java Testers with vscode

## Prerequisites
you need to download and install the following to run this Java project
* https://code.visualstudio.com/docs/java/java-tutorial
* Java JDK 8 http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
    * set JAVA_HOME environment variable.  
* Apache Maven https://maven.apache.org/download.cgi
    * Install Instructions https://maven.apache.org/install
* Install Java extensions for vs code
    * Java Extension Pack
    * Java Test Runner
* Download chrome driver, and location put in PATH Environmen Variable for windows 10

## Install
1. In the command line run mvn install (may need to run a couple times before passing)
2. Open the project in vs code. Click on the /src/main/java/app/test/DaveTest.java, Under the @test attribute click run test.  This should run the test. 

## Troubleshooting 
1. If you get an error, click on the X next to the run test, under the @test attribute.  This will give you details of the error so you can trouble shoot.  
2. Check if mvn can be run from command line type mvn -version
3. Check if java can be run from command line type java -version
4. Check that chromedriver.exe is accessed on the command line type chromedriver.exe see if it starts up then ctrl+c to exit chrome driver. 
