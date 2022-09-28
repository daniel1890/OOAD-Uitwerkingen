import java.util.ArrayList;

public class Spel {
    private ArrayList<Karakter> karakters;
    private Spelbord bord;

    private Garage garage;

    public Spel() {
        this.karakters = new ArrayList<>();
        this.bord = new Spelbord();
        this.garage = new Garage();
    }
    public void meldAan (String naamKarakter) {
        Karakter k = new Karakter(naamKarakter, garage.verkrijgNieuwVervoermiddel());
        voegKarakterToe(k);
        bord.plaatsOpVrijVakje(k);
    }
    public Karakter getKarakter (String naam) {
        for (Karakter k : karakters) {
            if (naam.equals (k.getNaam())) {
                return k;
            }
        };
        return null;
    }

    public void voegKarakterToe(Karakter k) {
        this.karakters.add(k);
    }

    public void teleporteer(String naam, int i) {
        Karakter k = getKarakter(naam);
        Vakje doelVakje = bord.getVakjes().get(i);

        k.teleporteer(doelVakje);
    }

    public void wisselVakje(String naam, int i) {
        Karakter k = getKarakter(naam);
        Vakje doelVakje = bord.getVakjes().get(i);

        k.wisselVakje(doelVakje);
    }
}