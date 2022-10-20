package DataAcces;

import Entities.Course;

public class JdbsCourseDao implements ICourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Jdbs ile veri tabanına eklendi"+course.getCourseName());
    }
}
