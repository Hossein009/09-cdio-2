package dasuki;
import dasuki.*;
public class Spiller {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    private Account account;

    public Spiller(String name) {
        this.name = name;
        this.account = new Account();
    }
}
