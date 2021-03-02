package service.Student;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService{
   static List<Student> students = new ArrayList<>();
    static {
        students.add(new Student(0,12,"Đan Linh","Nam Định"));
        students.add(new Student(1,11,"Đan Phương","Nam Định"));
        students.add(new Student(2,13,"Đan Nam","Nam Định"));
        students.add(new Student(3,14,"Đan Hoài","Nam Định"));
    }
    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public boolean save(Student student) {
        students.add(student);
        return true;
    }

    @Override
    public boolean edit(int id, Student student) {
        students.set(id,student);
        return true;
    }

    @Override
    public boolean delete(int id) {
        students.remove(id);
        return false;
    }

    @Override
    public Student findById(int id) {
       return students.get(id);
    }
}
