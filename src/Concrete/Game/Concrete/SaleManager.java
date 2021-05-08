package Concrete.Game.Concrete;

import Abstract.Validation.IValidationBase;
import Entity.Campaign;
import Entity.Game;

public class SaleManager {

    public SaleManager(){

    }


    public SaleManager(IValidationBase validationBase){

    }
    void calculateSalePrice(){

    }

    double sale(Campaign campane, Game game){
        double price=(100-campane.getDiscountRate())*game.getUnitPrice()/100;
        return price;
    }


}
