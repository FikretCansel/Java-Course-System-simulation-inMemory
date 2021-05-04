package Entity;

public class Company extends User{
    String companyName;

    public Company(String companyName,int id,String email,String password) {
        super(id,email,password);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
