package Concrete.Course;


import Abstract.Services.StudentService;
import Entity.Student;

public class StudentManager extends UserManager<Student> implements StudentService {

    public StudentManager() {
        super();
    }

    public void writeFirstName() {
        for(Student student:getAll().getData()){
            System.out.print(student.getFirstName()+"-");
        }
    }
    public void writeLastName() {
        for(Student student:getAll().getData()){
            System.out.print(student.getLastName()+"-");
        }
    }

}
