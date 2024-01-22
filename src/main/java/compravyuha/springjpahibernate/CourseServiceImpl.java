package compravyuha.springjpahibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    public CourseServiceImpl(CourseJdbcRepository courseJdbcRepository){
        this.courseJdbcRepository = courseJdbcRepository;
    }

    @Override
    public Course createCourse(Course course) {
        return courseJdbcRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        Optional<Course> optCourse = courseJdbcRepository.findById(course.getId());
        if(optCourse.isPresent()){
            Course oldCourse = optCourse.get();
            oldCourse.setId(course.getId());
            oldCourse.setName(course.getName());
            oldCourse.setAuthor(course.getAuthor());
            return courseJdbcRepository.save(oldCourse);
        }
        return null;
    }

    @Override
    public List<Course> getAllCourse() {
        return courseJdbcRepository.findAll();
    }

    @Override
    public Course getCourseById(int courseId) {
        Optional<Course> course = courseJdbcRepository.findById(courseId);
        return course.orElse(null);
    }

    @Override
    public void deleteCourse(int id) {
         courseJdbcRepository.deleteById(id);
    }
}
