package compravyuha.springjpahibernate;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseJdbcRepository extends JpaRepository<Course,Integer> {

}
