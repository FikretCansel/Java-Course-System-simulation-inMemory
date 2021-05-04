package Abstract;
import java.util.List;

public interface EntityRepository<Entity> {
    void add(Entity entity);
    List<Entity> getAll();
    void delete(Entity entity);
    void update(Entity entity);
}
