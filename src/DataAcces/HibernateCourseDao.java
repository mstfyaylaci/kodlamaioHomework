package DataAcces;

import Entities.Category;
import Entities.Course;

public class HibernateCourseDao implements ICourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına eklendi"+course.getCourseName());
    }
}
