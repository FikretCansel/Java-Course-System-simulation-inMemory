package Concrete.Game.Concrete;

import Concrete.EntityRepositoryBase;
import Entity.Gamer;
import Validation.GamerValidation;

public class GamerManager extends EntityRepositoryBase<Gamer> {


    public GamerManager(GamerValidation validationBase) {
        super(validationBase);
    }




}
