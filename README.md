# SimpleJavaGame
A simple Java game for Vel and Blue, by Vel and Blue :)

Goal:
-----
1. Simple Snake? Game
2. Build Rules
3. Build Algorithms
4. Build unit tests


Stack
-------
* Java :: jdk-11.0.1_windows-x64_bin [https://download.oracle.com/otn-pub/java/jdk/11.0.1+13/90cf5d8f270a4347a95050320eef3fb7/jdk-11.0.1_windows-x64_bin.zip]
* Maven :: apache-maven-3.6.0 [http://apache.claz.org/maven/maven-3/3.6.0/binaries/apache-maven-3.6.0-bin.zip]
* Build :: Jenkins [https://jenkins.io/doc/book/installing/#windows]
.. * add windows environment variables for git paths, C:\Program Files\Git\cmd;C:\Program Files\Git\usr\bin;
* Unit test: JUnit
* IDE: IntelliJ community [done]
* Bug tracking: GitHub

Things to do:
-------------
:: (Create a todo list and convert this to a task)
1. Java reading blue and vel (pluralsight).
2. Decide on Game libraries
3. setup local computer for compile + build
 .. * vel and blue's laptop
4. setup local computer for unit tests
 .. * vel and blue's laptop
5. setup QA environment
 .. * Azure Cloud
6. Identify Java architecture.


Setup Java and maven on windows:
1. download JDK (zip) and add java_home to windows environment variables
2. download maven (zip) and add maven_home to windows environment variables

Run Java program
----------------
1. mvn clean
2. mvn compile -e
3. java com.velsoft.Main

Packaging:
---------
1. mvn package

MarkDown CheatSheet - https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet

CRON time : https://crontab.guru/
