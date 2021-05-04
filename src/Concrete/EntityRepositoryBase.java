package Concrete;
import Abstract.EntityRepository;

import java.util.ArrayList;
import java.util.List;

public class EntityRepositoryBase<Entity> implements EntityRepository<Entity> {

    private List<Entity> entities;

    public EntityRepositoryBase() {
        this.entities = new ArrayList<>();
    }

    @Override
    public void add(Entity entity) {
        entities.add(entity);
        System.out.println("Ekleme Başarılı");
    }

    @Override
    public List<Entity> getAll() {
        return entities;
    }

    @Override
    public void delete(Entity entity) {
        entities.remove(entity);
        System.out.println("Kaldırıldı");
    }

    @Override
    public void update(Entity entity) {
        System.out.println("Güncüllendi");
    }
}
