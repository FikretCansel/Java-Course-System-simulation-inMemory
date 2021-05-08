package Concrete.Game.Concrete;

import Abstract.Validation.IValidationBase;
import Concrete.EntityRepositoryBase;
import Entity.Game;

public class GameManager extends EntityRepositoryBase<Game> {

    public GameManager() {

    }

    public GameManager(IValidationBase validationBase) {
        super(validationBase);
    }
}
