package Model.chancecard;
import Model.Account;

import static Model.Account.deposit;
import static Model.Account.pay;

public class Balance {
    GUI gui;

    public Account account;

    /* Det her er kategorien for de kort der tager fra banken og ligger til ham der har trukket kortet */
    String[] cards = {
            "Betal for vognvask og smøring kr 300",
            "Betal kr 200 for levering af 2 kasser øl",
            "Betal 3000 for reparation af deres vogn",
            "Betal 3000 for reparation af deres vogn",
            "De har købt 4 nye dæk til Deres vogn, betal kr 1000",
            "De har fået en parkeringsbøde, betal kr 200 i bøde",
            "Betal deres bilforsikring, kr 1000",
            "De har været udenlands og købt for mange smøger, betal kr 200 i told.",
            "Tandlægeregning, betal kr 2000.",
            "De har vundet i klasselotteriet. Modtag 500 kr.",
            "De har vundet i klasselotteriet. Modtag 500 kr.",
            "De modtager Deres aktieudbytte. Modtag kr 1000 af banken",
            "De modtager Deres aktieudbytte. Modtag kr 1000 af banken",
            "De modtager Deres aktieudbytte. Modtag kr 1000 af banken",
            "Kommunen har eftergivet et kvartals skat. Hæv i banken 3000 kr.",
            "De have en række med elleve rigtige i tipning, modtag kl 1000",
            "Grundet dyrtiden har De fået gageforhøjelse, modtag kr 1000.",
            "Deres præmieobligation er udtrykket. De modtager 1000 kr af banken.",
            "Deres præmieobligation er udtrykket. De modtager 1000 kr af banken.",
            "De har solg nogle gamle møbler på auktion. Modtag 1000 kr af banken.",
            "Værdien af egen avl fra nyttehaven udgør 200 som de modtager af banken",
            "De modtager “Matador-legatet” på kr 40.000, men kun hvis værdier ikke overstiger 15.000 kr",
            "Det er deres fødselsdag. Modtag af hver medspiller 200 kr.",
            "De har lagt penge ud til et sammenskudsgilde. Mærkværdigvis betaler alle straks. Modtag fra hver medspiller 500 kr.",
            "De skal holde familiefest og får et tilskud fra hver medspiller på 500 kr."};


    /* Det her er kategorien for de kort der tager fra banken og ligger til ham der har trukket kortet */
    int[] cardsPrice = {
            -300,
            -200,
            -3000,
            -3000,
            -1000,
            -200,
            -1000,
            -200,
            -2000,
            500,
            500,
            1000,
            1000,
            1000,
            3000,
            1000,
            1000,
            1000,
            1000,
            1000,
            200,
            40000,
            200,
            500,
            500
    };

    /* Det her er kategorien for de kort der tager fra hver medspiller og ligger til ham der har trukket kortet */

    String[] cardsPlayer = {
            "Det er deres fødselsdag. Modtag af hver medspiller 200 kr.",
            "De har lagt penge ud til et sammenskudsgilde. Mærkværdigvis betaler alle straks. Modtag fra hver medspiller 500 kr.",
            "De skal holde familiefest og får et tilskud fra hver medspiller på 500 kr."
    };


    /* Det her er kategorien for de kort der tager fra hver medspiller og ligger til ham der har trukket kortet */
    int[] cardsPlayerPrice = {
            200,
            500,
            500
    };

    /* Her bruger vi deposit metoden fra account som gør at vi plusser account med anden parameter*/
    /*Vores gui message viser så hvilket felt man er landet på*/
    public void ChanceBalance(Account account, int index){
        gui.showmesege(cards[index]);
        deposit(account, cardsPrice[index]);
    }

    /* Her skal vi få den til at tage penge fra alle spillere undtagen ham der trækker kortet.*/
    public void ChanceBalancePlayer(Account account, int index){
        gui.showmessage(cards[index]);
        pay(account, account, cardsPlayerPrice[index]);
    }
}