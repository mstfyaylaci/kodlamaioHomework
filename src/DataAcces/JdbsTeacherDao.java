package DataAcces;

import Entities.Teacher;

public class JdbsTeacherDao implements ITeacherDao{
    @Override
    public void add(Teacher teacher) {
        System.out.println("Jdbs ile veri tabanına eklendi : "+teacher.getFirsName()+teacher.getLastName());
    }
}
