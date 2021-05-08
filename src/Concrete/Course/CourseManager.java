package Concrete.Course;

import Abstract.Validation.IValidationBase;
import Concrete.EntityRepositoryBase;
import Entity.Course;
import Abstract.Services.CourseService;

public class CourseManager extends EntityRepositoryBase<Course> implements CourseService {

    public CourseManager(IValidationBase validation) {
        super(validation);
    }
}
