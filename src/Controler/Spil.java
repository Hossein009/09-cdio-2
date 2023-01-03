package Controler;

import Model.Dice;
import Model.Felter;
import Model.Fields.Owneble;
import Model.Spiller;

public class Spil {

    public void play() {

        Dice dice1 = new Dice(6,1);
        Dice dice2 = new Dice(6,1);


        System.out.println(dice1.roll() + dice2.roll());

    }

}