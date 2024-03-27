### Getting Started with JPA & Hibernate

- Build a simple JPA App using Modern Spring Boot Approach
- Get Hands on with JPA, Hibernate & SpringBoot. 
  - World before JPA - JDBC, Spring JDBC
  - Why JPA? Why Hibernate? (JPA vs Hibernate)
  - Why Spring Boot and Spring Boot Data JPA?

### Learning JPA and Hibernate - Approach

- 01: Create a Spring Boot Project with H2
- 02: Create COURSE table
- 03: Use Spring JDBC to play with COURSE table
- 04: Use JPA and Hibernate to play with COURSE table
- 05: Use Spring Data JPA to play with COURSE table

### Practical: 

- h2 console url : http://localhost:8080/h2-console 
- Dynamically generated IRL h2 console : http://localhost:8080/h2-console/login.jsp?jsessionid=ba72cae66f474359b9af3f92126b6ca8
- You can run below sql queries from h2 console: 
```
insert into course (id, name, author)
values(1, 'Learn AWS', 'in28minutes');

select * from course;

delete from course where id=1;
```

### JDBC to Spring JDBC to JPA to Spring Data JPA: 

- Write a lot lesser number of lines of code

#### JDBC:

- Write a lot of SQL queries! (delete from todo where id=?)
- And write a lot of java code
```
public void deleteTodo(int id) {
  PreparedStatement st = null;
  try {
    st = db.conn.prepareStatement("delete from todo where id=?");
    st.setInt(1, id);
    st.execute();
  } catch (SQLException e) {
    logger.fatal("Query failed : ", e);
  } finally {
    if (st != null) {
      try {st.close();}
      catch (SQLException e) {}
    }
  }
}
```

#### Spring JDBC: 
- Write a lot of SQS queries (delete from todo where id=?)
- But lesser java code

```
public void deleteTodo(int id) {
  jdbcTemplate.update("delete from todo where id=?", id);
}
```

#### JPA:

- DO NOT worry about queries 
- Just Map Entities to Tables!

#### Spring Data JPA: 

- Let's make JPA even more simpel!
- I will take care of everything!

### Hiberate vs JPA:

- As of know we have only made use of Jakarta Persistence APIs. 
  Example: Jakarta.persistence.EntityManager, jakarta.persistence.PersistenceContext
- JAR : jakarta.persistence-api-x.x.x..jar
- Also there are hibernate jars in package dependencies : hibernate-core-jakarta-x.x.x.Final.jar, 
  hibernate-commons-annotations.x.x.x.Final.jar
- Dependency Tree : spring-boot-starter-data-jpa --> hibernate-core-jakarta --> hibernate-commons-annotations

- JPA defines the specification. It is an API
  - How do you define entities ?
  - How do you map attributes ?
  - Who manages the entities ? 
  - Hibernate is one of the popular implementations of JPA. 
    JPA Defines the API and hibernate provides the implements of interfaces in JPA.
  - Using Hibernate directly would result in a lock in to Hibernate. 
    - There are other JPA implementations (Toplink, for example)

Example: 
Entity class comes from two places:
jakarta.persistence.Entity
&
org.hibernate.annotations.Entity

