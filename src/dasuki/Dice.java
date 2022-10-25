package dasuki;

import java.util.Random;

public class Dice {
    public int Dice1;
    public int Dice2;

    public int getSum() {
        return Dice1 + Dice2;
    }

    public int roll() {
        Random ran = new Random();
        Dice1 = ran.nextInt(6)+1;
        Dice2 = ran.nextInt(6)+1;
        return getSum();
    }
}

