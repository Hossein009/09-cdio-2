package dasuki;
import dasuki.*;
public class Spiller {
    private String name;
    public Account account;
    public int position = 0;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Spiller(String name) {
        this.name = name;
        this.account = new Account();
        this.position = 0;
    }

    public void setPosition(int Pos){
        this.position = Pos;
    }

    public int getPosition(){
        return position;
    }



}
