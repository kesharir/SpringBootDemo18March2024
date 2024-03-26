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

### JDBC to Spring JDBC: 

- Write a lot lesser number of lines of code

#### JDBC:

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

```
public void deleteTodo(int id) {
  jdbcTemplate.update("delete from todo where id=?", id);
}
```