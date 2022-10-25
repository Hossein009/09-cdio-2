package dasuki;

import java.util.Random;

public class Dice {
    public int Dice1;
    public int Dice2;

    public Dice(int Dice1, int Dice2) {
        this.Dice1 = Dice1;
        this.Dice2 = Dice2;
        roll();
    }
    public int roll() {
        Random ran = new Random();
        Dice1 = ran.nextInt(6)+1;
        Dice2 = ran.nextInt(6)+1;
        return getSum();
    }
    public int getSum() {
        return Dice1 + Dice2;
    }

    public int getDice1() {
        return Dice1;
    }

    public int getDice2() {
        return Dice2;
    }

}

