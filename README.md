# BOOKSTORE MANAGER API PROJECT

The objective of this Bookstore Manager API is delivered a simple API REST to study some concepts and tools around API subject.
The intent is register books of a library through an API REST.

Project deployed on [Heroku](https://bookstore-manager-raquel.herokuapp.com/)

## Initialized with Spring Initializer with the following dependencies:
![](SpringInitializerDependencies.png)

## DB Model
![](EntityRelationshipModelDB.png)

## Endpoints Test - Insomnia

### POST - Create new book

- Local Request

![](PostSaveBook.png)

- Request to https://bookstore-manager-raquel.herokuapp.com/api/v1/books

### GET - Find Book By ID

- Local Request

![](Find1.png)

- Heroku Request

![](.png)


## Unit Tests - Not implemented yet

- Flux 1 -> book created successfully
- Flux 2 -> invalid isbn


## RUN Instructions

To run the project on terminal, type the following command: 

```shell script
mvn spring-boot:run 
```

Later, open this in order to visualize the project running:

```
http://localhost:8080/api/v1/books
```


Mininum requirement to run the project:

* Java 8 (without tests) or 14 or higher (to visualize tests).
* Maven 3.6.3 or higher.
* SDKMan! to manager multiple versions of Java, Maven e Spring Boot.
* Intellj IDEA Community Edition or your favorite IDE.


