
# springboot-crud-api

Spring Boot CRUD api is demonstrating how to create a simple CRUD API operations with a 
`User` entity.



## What's inside

This project used these packages.

- Maven
- Spring Web
- Spring MVC(Tomcat)
- Hibernate and MySQL





## Installation
The project was generated in `https://start.spring.io/`
Go to this link and input the parameters based on your needs.
Then import it to your favorite IDE and build the project to resolve the dependencies. 

## Database configuration
Create a MySQL database with the schema name `SAMPLECRUDDB` and add the credentials in `resources/application.properties`

```
spring.datasource.url=jdbc:mysql://localhost:3306/SAMPLECRUDDB?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```

## Usage
Run the project in IDE and go to `http://localhost:8080`

For alternative, run this command in the command line.

```mvn spring-boot:run``` 

## For testing, these are the api path.

```
GET - localhost:8080/users
```

```
POST - localhost:8080/save

{
  "firstName": "Francis",
  "lastName": "Taguiam",
  "age": 22,
  "occupation": "Java Dev"

}
```

```
PUT - localhost:8080/update/1

{
  "firstName": "Francis",
  "lastName": "Taguiam",
  "age": 21,
  "occupation": "Software Engineer"
}
```

```
DELETE - localhost:8080/delete/1
```

