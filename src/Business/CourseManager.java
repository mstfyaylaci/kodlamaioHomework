package Business;

import DataAcces.ICourseDao;
import Entities.Course;
import Core.Logging.ILogger;

import java.util.ArrayList;

public class CourseManager {
    private ICourseDao courseDao;
    private ILogger[] loggers;
    private ArrayList<Course> courses=new ArrayList<>();

    public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    public void add(Course course) throws  Exception{

        for (Course currentCourses:courses) {
            if (course.getUnitPrice()<0.0){
                throw new Exception("Kurs fiyatı 0 dan küçük olamaz");

            }
            if (course.getCourseName().equals(currentCourses.getCourseName())){
                throw  new Exception("Aynı kurs tekrar edemez");
            }
        }


        courseDao.add(course);

        for (ILogger logger:loggers) {
            logger.log(course.getCourseName());
        }
    }
}
