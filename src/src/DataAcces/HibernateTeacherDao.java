package DataAcces;

import Entities.Teacher;

public class HibernateTeacherDao implements ITeacherDao{
    @Override
    public void add(Teacher teacher) {
        System.out.println("Hibernate ile veritabanına eklendi"+teacher.getFirsName()+teacher.getLastName());
    }
}
