package Log.Database;

public class OracleManager extends  BaseDatabase{

    @Override
    public void save() {
        System.out.println("oracle kaydedildi");
    }

    @Override
    public void delete() {
        System.out.println("silindi");
    }

    @Override
    public void Update() {

    }
}
