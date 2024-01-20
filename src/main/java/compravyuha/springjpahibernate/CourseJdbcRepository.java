package compravyuha.springjpahibernate;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    private JdbcTemplate springJdbcTemplate;
    private static String INSERT_QUERY = "";


}
