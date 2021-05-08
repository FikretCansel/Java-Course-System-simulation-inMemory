package Concrete.Course;

import Abstract.Services.InstructoService;
import Entity.Instructor;

public class InstructorManger extends UserManager<Instructor> implements InstructoService {

    public void writeFirstName() {
        for(Instructor instructor:getAll().getData()){
            System.out.print(instructor.getFirstName()+"-");
        }
    }

}
