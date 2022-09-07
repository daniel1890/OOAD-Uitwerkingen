import java.util.ArrayList;
import java.util.Random;

public class Glazenbol {
    private int capaciteit;
    private ArrayList<Lottobal> lottoballen;

    public Glazenbol(int capaciteit) {
        this.capaciteit = capaciteit;
        this.lottoballen = new ArrayList<>();
    }

    public void verzamelAlleBallen() {
        for (int i = 1; i <= capaciteit; i++) {
            Lottobal bal = new Lottobal(i);
            lottoballen.add(bal);
        }
    }

    public Lottobal schepBal() {
        Random ran = new Random();
        int x = ran.nextInt(lottoballen.size());

        Lottobal randomBal = lottoballen.get(x);
        lottoballen.remove(randomBal);

        return randomBal;
    }
}
