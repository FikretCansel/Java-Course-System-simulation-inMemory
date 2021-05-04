package Concrete;


import Abstract.StudentService;
import Entity.Student;

public class StudentManager extends UserManager<Student> implements StudentService {

    public StudentManager() {

    }

    public void writeFirstName() {
        for(Student student:getAll()){
            System.out.print(student.getFirstName()+"-");
        }
    }

}
