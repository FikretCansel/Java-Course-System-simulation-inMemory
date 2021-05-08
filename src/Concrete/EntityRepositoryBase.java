package Concrete;
import Abstract.EntityRepository;
import Abstract.Validation.IValidationBase;
import Results.DataResult;
import Results.Result;
import java.util.ArrayList;
import java.util.List;

public class EntityRepositoryBase<Entity> implements EntityRepository<Entity> {

    private List<Entity> entities;
    private IValidationBase validation;


    public EntityRepositoryBase(IValidationBase validation) {
        this.validation=validation;
        this.entities = new ArrayList<>();
    }

    public EntityRepositoryBase() {
        this.entities = new ArrayList<>();
    }


    public Result add(Entity entity) {
        if(validation!=null){
            if(!validation.checkAdd(entity)){
                return new Result("Ekleme Başarısız",false);
            }
        }
        entities.add(entity);
        return new Result("Başarı ile Eklendi",true);
    }

    public DataResult<List<Entity>> getAll() {
        return new DataResult<List<Entity>>(entities,true,"Listelendi");
    }

    public Result delete(Entity entity) {
        entities.remove(entity);
        return new Result("Başarı ile Silindi",true);
    }

    public Result update(Entity entity) {

        if(validation!=null){
            if(!validation.checkUpdate(entity)){
                return new Result("",false);
            }
        }

        int index=entities.indexOf(entity);
        entities.set(index,entity);

        return new Result("Başarı ile Silindi",true);
    }
}
