package dasuki;

public class Spil {

    public void Play() {

        int round = 1;

        //Vi definerer to spillere
        Spiller Player1 = new Spiller("Player1");
        Spiller Player2 = new Spiller("Player2");

        Felter felter = new Felter();

        //Vi definerer em terning
        Terninger Terning = new Terninger();

        System.out.println("Spillet er nu begyndt");

        while (Player1.account.getAccount() < 3000 || Player2.account.getAccount() < 3000) {

            int num = round;
            if (num % 2 == 1) {
                if (Player1.account.getAccount() < 3000)
                Player1.setPosition(Player1.getPosition() + Terning.roll(2));
                System.out.println(felter.getTower(Player1.getPosition()));


            System.out.println("Player1 du er landet på plads: " + Player1.getPosition());

            if (Player1.account.getAccount() > 3000) Player1.account.setAccount(3000);

                break;
        }
        }











    }

}