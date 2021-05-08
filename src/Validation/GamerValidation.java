package Validation;

import Abstract.Validation.IGamerValidation;
import Entity.Gamer;

public class GamerValidation implements IGamerValidation {

    public GamerValidation() {
    }


    @Override
    public boolean checkAdd(Gamer gamer) {
        if(gamer.getNationalIdentity().length()!=11)
            return false;
        if(gamer.getFirstName().length()<3)
            return false;
        if(gamer.getLastName().length()<3)
            return false;
        if(gamer.getBirthDay()>2000){
            System.out.println("Yaşınız küçük oldugu için kaydolamazsınız!");
            return false;
        }
        return true;
    }

    @Override
    public boolean checkUpdate(Gamer gamer) {

        if(gamer.getFirstName().length()<2){
            return false;
        }

        return true;
    }


}
