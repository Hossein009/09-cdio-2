package dasuki;
import dasuki.Spiller.*;
import java.util.ArrayList;
public class Felter {
    int MIN = 0;

    public void minBalance() {
        if (Balance < MIN)
            Balance = 0;
    }

int[] felter = {0, 250,  -100,  100,  -20,  180,  0,  -70, 60,  -80, -50,  650};

String[][] felterString = {{"Tower", "Godt gået! Du har modtaget 250 point"},
        {"Crater, Desværre! du har mistet 100 point"},
        {"palaceGates, Tillykke! du har modtaget 100 point"},
        {"coldDesert, Åh nej! du har mistet 20 point"},
        {"walledCity, Sådan! du har mogtaget 180"},
        {"Monastery, wow! du har hverken modtaget eller mistet point"},
        {"blackCave, Wwa Wa Wa! du har mistet 70 point"},
        {"hutsInTheMountain, Success! du har modtaget 60 point"} ,
        {"theWerewall, Du har mistet 80 point"},
        {"thePit, Du har mistet 50 point"},
        {"Goldmine, Tillykke du har modtaget 650 point"}};

public int getSquare(int sumTerning){
    System.out.println(felterString[sumTerning-1][1]);
    return felter[sumTerning];

}

  public int getTower(){
    return balance + felter[0];
  }
    public int getCrater() {
        return Balance + felter[1];
    }
    public int getPalaceGates() {
        return Balance + felter[2];
}
    public int getColdDesert() {
        return Balance + felter[3];
}
    public int getWalledCity() {
        return Balance + felter[4];
}
    public int getMonastery() {
        return Balance + felter[5];
}
    public int getBlackCave() {
        return Balance + felter[6];
}
    public int getHutsInTheMountain() {
        return Balance + felter[7];
}
    public int getTheWerewall() {
        return Balance + felter[8];
}
    public int getThePit() {
        return Balance + felter[9];
}
    public int getGoldmine() {
        return Balance + felter[10];
}



    public String toString() {
        return Integer.toString(Balance);
    }
}
