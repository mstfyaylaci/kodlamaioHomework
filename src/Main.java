import Business.CategoryManager;
import Business.CourseManager;
import Business.TeacherManager;
import Core.Logging.DatabaseLogger;
import Core.Logging.FileLogger;
import Core.Logging.ILogger;
import DataAcces.HibernateCourseDao;
import DataAcces.JdbsCategoryDao;
import DataAcces.JdbsTeacherDao;
import Entities.Category;
import Entities.Course;
import Entities.Teacher;

public class Main {
    public static void main(String[] args) throws Exception {
//        Teacher teacher1=new Teacher(1,"Engin","Demirog");
//        ILogger[] loggers={new DatabaseLogger(), new FileLogger()};
//        TeacherManager teacherManager=new TeacherManager(new JdbsTeacherDao(),loggers);
//        teacherManager.add(teacher1);

        Course course1=new Course(1,"Java","Engin","Başlangıc",50.8);
        ILogger[] loggers={new DatabaseLogger(), new FileLogger()};
        CourseManager courseManager=new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(course1);

//        Category category=new Category(1,"programlama");
//        ILogger[] loggers={new DatabaseLogger(), new FileLogger()};
//        CategoryManager categoryManager=new CategoryManager(new JdbsCategoryDao(),loggers);
//        categoryManager.add(category);

    }
}