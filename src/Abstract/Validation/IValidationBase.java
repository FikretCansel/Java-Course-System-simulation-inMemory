package Abstract.Validation;



public interface IValidationBase<Entity> {
     boolean checkAdd(Entity entity);

     boolean checkUpdate(Entity entity);
}
