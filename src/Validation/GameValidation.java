package Validation;

import Abstract.Validation.IGameValidation;
import Entity.Game;

public class GameValidation implements IGameValidation {

    @Override
    public boolean checkAdd(Game game) {

        if(game.getUnitPrice()<0){
            System.out.println("unitPrice 0 dan küçük olamaz");
            return false;
        }
        return true;
    }

    @Override
    public boolean checkUpdate(Game game) {
        return false;
    }
}
