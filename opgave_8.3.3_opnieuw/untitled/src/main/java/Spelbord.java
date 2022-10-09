import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class Spelbord {
    private ArrayList<Vakje> vakjes = new ArrayList<Vakje>();
    public Spelbord() {
        maakVakjes();
    }

    private void maakVakjes() {
        for (int i = 0; i < 100; i++) {
            Vakje v = new Vakje();
            v.setVaknr(i);
            vakjes.add(v);
        }
    }

    public ArrayList<Vakje> getVakjes() {
        return vakjes;
    }
    public void plaatsOpVrijVakje(Karakter k) {
        Vakje v = kiesVrijVakje();
        k.setVakje(v);
    }
    private Vakje kiesVrijVakje() {
        Random r = new Random();
        Optional<Vakje> randomVakje = vakjes.stream().filter(vakje -> vakje.getKarakter() == null).skip(r.nextInt(vakjes.size())).findFirst();

        return randomVakje.orElse(null);
    }
}