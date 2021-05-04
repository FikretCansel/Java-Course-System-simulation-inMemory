package Concrete;

import Abstract.InstructoService;
import Entity.Instructor;

public class InstructorManger extends UserManager<Instructor> implements InstructoService {

    public void writeFirstName() {
        for(Instructor instructor:getAll()){
            System.out.print(instructor.getFirstName()+"-");
        }
    }

}
