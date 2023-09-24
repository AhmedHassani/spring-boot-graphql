# graphql-java-spring-boot
This is a simple Spring Boot application that demonstrates how to implement GraphQL with Spring Boot.
## Getting Started
You'll need Java 11 or 17.

Clone this repo and execute mvnw spring-boot:run. Or inside an IDE, execute the class com.example.DemoGraphQL.DemoGraphQlApplication.

To access the database, you can go to http://localhost:8080/h2-console/login.jsp and enter the following information:

JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password:

Or go to http://localhost:8080/graphiql to start executing queries. For example:


```bash
{
  findAllBooks {
    id
    isbn
    title
    pageCount
    author {
      firstName
      lastName
    }
  }
}
```
Or
```bash
mutation {
  newBook(
    title: "Java: The Complete Reference, Tenth Edition", 
    isbn: "1259589331", 
    author: 1) {
      id title
  }
}
```

## Extras

This build demos some UIs hosted at graphql-java-kickstart.

- Launch with mvn spring-boot:run
- Open a browser to view UIs at the following links:
   - GraphiQL
   - Altair
   - Playground
   - Voyager
