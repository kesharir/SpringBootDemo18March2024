package com.in28minutes.rest.webservices.restfulwebservices.db.jdbc.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String INSERT_QUERY =
            """
                insert into course (id, name, author)
                values (1, 'Learn AWS', 'in28minutes');
            """;

    private static String INSERT_DYNAMIC_QUERY =
            """
                insert into course (id, name, author)
                values (?, ?, ?);   
            """;

    private static String DELETE_DYNAMIC_QUERY =
            """
                    delete from course
                    where id = ?
            """;

    private static String SELECT_DYNAMIC_QUERY =
            """
                    select * from course where id = ?;
            """;

    public void insert() {
        springJdbcTemplate.update(INSERT_QUERY);
    }

    public void insert(Course course) {
        springJdbcTemplate.update(INSERT_DYNAMIC_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id) {
        springJdbcTemplate.update(DELETE_DYNAMIC_QUERY, id);
    }

    public Course findById(long id) {
        return springJdbcTemplate.queryForObject(SELECT_DYNAMIC_QUERY,
                new BeanPropertyRowMapper<>(Course.class),
                id);
        // ResultSet --> Bean => Row Mapper
    }
}
