# MicroService-converter
A REST interface created with Spring Boot.

##Libs used in this project:##
Apache POI(for reading xslx files)
Json(in order to create Json objects)
Spring(rest , service)

##Requirements:##
Maven 3.x
JRE 7

##Build and Run:##

In the project directory open a terminal and type:

~$ mvn package
~$ java -jar target/convertisseur-0.1.0.jar

##Testing:##

You can test the API with Advanced Rest Client.


##Configuration:##

Tomcat is configured to run on port 7000 , you can change this configuration in resources/application.properties file .
