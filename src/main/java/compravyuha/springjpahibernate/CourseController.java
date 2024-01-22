package compravyuha.springjpahibernate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping(path = "/courses")
    public List<Course> getAllCourses(){
        return courseService.getAllCourse();
    }

    @PostMapping(path = "/courses")
    public Course insertCourse(@RequestBody Course course){
        return courseService.createCourse(course);
    }


    @PutMapping(path = "/courses")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping(path = "/courses/{id}")
    public void deleteCourse(@PathVariable int id){
        courseService.deleteCourse(id);
    }
}
