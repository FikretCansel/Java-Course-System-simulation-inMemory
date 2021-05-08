package Concrete.Course;

import Abstract.Services.CompanyService;
import Abstract.Validation.IValidationBase;
import Entity.Company;

public class CompanyManager extends UserManager<Company> implements CompanyService {

    public CompanyManager(IValidationBase validation) {
        super(validation);
    }
}
