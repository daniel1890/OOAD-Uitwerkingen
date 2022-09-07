import java.util.ArrayList;

public class Scorebord {
    private ArrayList<Lottobal> lottoballen;
    private Lottobal bonusbal;

    public Scorebord() {
        this.lottoballen = new ArrayList<>();
    }

    public void plaatsBal(Lottobal bal) {
        this.lottoballen.add(bal);
    }

    public void plaatsBonusBal(Lottobal bal) {
        this.bonusbal = bal;
    }

    public void maakLeeg() {
        lottoballen.clear();
    }

    public void sorteerBallen(){
        for (int i = lottoballen.size(); i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                if (lottoballen.get(j).getBalnummer() > (lottoballen.get(j+1).getBalnummer())) {
                    Lottobal bal = lottoballen.get(j);
                    lottoballen.set(j, lottoballen.get(j + 1));
                    lottoballen.set(j + 1, bal);
                }
            }
        }
    }
}
