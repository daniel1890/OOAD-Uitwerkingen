public class Lottomachine {
    private Glazenbol bol;
    private Scorebord bord;

    public Lottomachine() {
        this.bol = new Glazenbol(45);
        this.bord = new Scorebord();
    }

    public void voerTrekkingUit() {
        bol.verzamelAlleBallen();
        bord.maakLeeg();

        for (int i = 0; i < 6; i++) {
            Lottobal bal = bol.schepBal();
            bord.plaatsBal(bal);
        }

        Lottobal bonusbal = bol.schepBal();
        bord.plaatsBonusBal(bonusbal);

        bord.sorteerBallen();
    }
}
