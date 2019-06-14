# Lab 11, 12: Spring for Full-Stack Web Apps

## Description
- Create a new Spring application. Select Spring Web Starter and Spring Dev Tools as dependencies. This project is designed to create routes and test that functionality of those routes. 
- connect a database to the web application
- add information to the database
- display information from the database
- create routes for the album display
- create routes for the add album form
- create routes to handle songs
- create routes to add songs
- create route to view a single album

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
- ```/albums```
  - should show to the user all the albums and album information in the database
- ```/albums/new```
  - should allow the user to add an album to the database, and then redirect the user to the ```/albums``` page.
- ```/songs```
  - should show all songs from the database
- ```/songs/new```
  - allows user to be able to add songs
- ```/albums/{id}```
  - allows user to be able to view a single album, passed by album id


## Directions
- from IntelliJ
  - open application
  - run the App.java
- from Command Line
  - test
    - ```./gradlew test```
  - Start Server
    - ```./gradlew bootRun```
    - proceeed in broswer to following routes
      - ```localhost:8080/hello```
      - ```localhost:8080/capitalize/<anyword you want>```
      - ```localhost:8080/reverse?sentence=<put sentence here>```
      - ```localhost:8080/reverseER?sentence=<put sentence here>```
      - ```localhost:8080/albums```
      - ```localhost:8080/albums/new```
      - ```loclalhost:8080/songs```
      - ```localhost:8080/songs/new```
      - ```localhost:8080/albums/{id}```