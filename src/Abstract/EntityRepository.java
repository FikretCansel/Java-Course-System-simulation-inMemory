package Abstract;
import Results.DataResult;
import Results.IResult;

import java.util.List;

public interface EntityRepository<Entity> {
    IResult add(Entity entity);
    DataResult<List<Entity>> getAll();
    IResult delete(Entity entity);
    IResult update(Entity entity);
}
