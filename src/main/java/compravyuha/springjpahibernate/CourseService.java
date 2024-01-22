package compravyuha.springjpahibernate;

import java.util.List;

public interface CourseService {
     Course createCourse(Course course);
     Course updateCourse(Course course);
     List<Course> getAllCourse();
     Course getCourseById(int courseId);
     void deleteCourse(int id);
}
