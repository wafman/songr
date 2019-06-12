# Lab 11: Spring for Full-Stack Web Apps

## Description
- Create a new Spring application. Select Spring Web Starter and Spring Dev Tools as dependencies. This project is designed to create routes and test that functionality of those routes. 

## API
- ```@GetMapping("/hello")```
  - will print a hello message to the page
- ```@GetMapping("/capitalize/{parameter}")```
  - will capitalize whatever word you pass into the parameter
- ```@GetMapping("/reverse")```
  - will reverse the words in the sentence
  - in order to see this functionality, you must type ```localhost:8080/reverse?sentence=<put sentence here```>
- ```@GetMapping("/reverseER")```
  - will reverse everything in the sentence. letters of the word included.
  - in order to see this functionality, you must type ```localhost:8080/reverse?sentence=<put sentence here```>


## Directions
- from IntelliJ
  - open application
  - run the App.java
- from Command Line
  - test
    - ```./gradlew test```
  - run
    - ```./gradlew bootRun```
    - proceeed in broswer to following routes
      - ```localhost:8080/hello```
      - ```localhost:8080/capitalize/<anyword you want>```
      - ```localhost:8080/reverse?sentence=<put sentence here>```
      - ```localhost:8080/reverseER?sentence=<put sentence here>```