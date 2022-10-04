package dasuki;
import java.util.ArrayList;
public class Felter {


private int balance = 1000;

public void setBalance(int balance){
    this.balance = balance;
}

public int getBalance(){
    return balance;
}

int[] felter = {250,  100,  100,  20,  180,  0,  70,60,  80, 50,  650};

String[][] felterString = {{"Tower", "Godt gået! Du har modtaget 250 point"}, {"Crater, Desværre! du har mistet 100 point"}, {"palaceGates, Tillykke! du har modtaget 100 point"}, {"coldDesert, Åh nej! du har mistet 20 point"}, {"walledCity, Sådan! du har mogtaget 180"}, {"Monastery, wow! du har hverken modtaget eller mistet point"}, {"blackCave, Wwa Wa Wa! du har mistet 70 point"}, {"hutsInTheMountain, Success! du har modtaget 60 point"} , {"theWerewall, Du har mistet 80 point"}, {"thePit, Du har mistet 50 point"}, {"Goldmine, Tillykke du har modtaget 650 point"};

public int getSquare(int sumTerning){
    System.out.println(felterString[sumTerning-2][1]);
    return felter[sumTerning];

}

public Felter(){
       Balance  1000;
  }
  public int getTower(){
    return Balance + Tower;
  }
    public int getCrater() {
        return Balance - Crater;
    }
    public int getPalaceGates(){return Balance + palaceGates;}
    public int getColdDesert(){return Balance - coldDesert;}
    public int getWalledCity(){return Balance + walledCity;}
    public int getMonastery(){return Balance - Monastery;}
    public int getBlackCave(){return Balance - blackCave;}
    public int getHutsInTheMountain(){return Balance + hutsInTheMountain;}
    public int getTheWerewall(){return Balance - theWerewall;}
    public int getThePit(){return Balance - thePit;}
    public int getGoldmine(){return Balance + Goldmine;}


    public void setBalance(int point) {
    Balance = point;
    minBalance();
    }
    public int getBalance() {
        return Balance;
    }
    int MIN = 0;

    public void minBalance() {
        if (Balance < MIN)
            Balance = 0;
    }


    public String toString() {
        return Integer.toString(Balance);
    }
}
