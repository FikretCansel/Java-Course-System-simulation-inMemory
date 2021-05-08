package Concrete.Course;


import Abstract.Services.UserService;
import Abstract.Validation.IValidationBase;
import Concrete.EntityRepositoryBase;

public class UserManager<User> extends EntityRepositoryBase<User> implements UserService {


    public UserManager(IValidationBase validation) {
        super(validation);
    }

    public UserManager() {
        super();
    }
}
