package dasuki;
import java.util.Random;

public class Terninger {
    public static int terning1;
    public static int terning2;

    public Terninger() {
        roll();
    }
    public void roll(){
        terning1=(int)(Math.random()*6)+1;
        terning2=(int)(Math.random()*6)+1;
    }
    public int getTerning1(){
        return terning1;
    }
    public int getTerning2(){
        return terning2;
    }
    public static int getTotal(){
        return terning1 + terning2;
    }
}
