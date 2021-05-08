package Concrete.Game;

import Concrete.Game.Concrete.GameManager;
import Concrete.Game.Concrete.GamerManager;
import Entity.Game;
import Entity.Gamer;
import Results.Result;
import Validation.GameValidation;
import Validation.GamerValidation;

public class mainGame {
    public static void main(String[] args) {
        GamerManager gamerManager=new GamerManager(new GamerValidation());
        Gamer fikret = new Gamer(1,"fikret","cansel","12345678910",1995);
        String addResult=gamerManager.add(fikret).getMessage();
        System.out.println(addResult);
        //Game minecraft=new Game(1,"minecraft",25);
        //GameManager gameManager=new GameManager();
        //System.out.println(gameManager.add(minecraft).getMessage());

    }
}
