package dasuki;
import java.util.Random;
public class Terninger {
    public int terning1;
    public int terning2;
    public int sumTerning = 0;

    public Terninger() {

    }

    public void roll() {
        terning1 = (int) (Math.random() * 6) + 1;
        terning2 = (int) (Math.random() * 6) + 1;
        sumTerning = terning1 + terning2;
        System.out.println(sumTerning);
    }
}
