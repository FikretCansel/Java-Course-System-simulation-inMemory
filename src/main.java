import Concrete.CourseManager;
import Concrete.InstructorManger;
import Concrete.StudentManager;
import Entity.Instructor;
import Entity.Student;


public class main {
    public static void main(String[] args) {

        StudentManager studentManager=new StudentManager();
        Student eyup=new Student("Eyup","Duran",1,"eyup@gmail.com","123");
        studentManager.add(eyup);
        var studens=studentManager.getAll();

        studentManager.writeFirstName();

        System.out.println("-----------");

        Student fikret=new Student("Fikret","Cansel",100,"fikret@gmail.com","123");
        studentManager.add(fikret);

        studentManager.writeFirstName();

        System.out.println("-----------");

        studentManager.delete(eyup);

        studentManager.writeFirstName();

        System.out.println("-----------");

        InstructorManger instructorManger=new InstructorManger();

        Instructor engin=new Instructor("Engin","Demiroğ",1,"engin@gmail.com","123");

        instructorManger.add(engin);

        //instructorManger.writeFirstName();

        fikret.setFirstName("eyup");

        studentManager.update(fikret);

        studentManager.writeFirstName();


    }
}
