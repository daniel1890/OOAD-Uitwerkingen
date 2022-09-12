import java.util.ArrayList;

public class Spel {
    private ArrayList<Karakter> karakters = new ArrayList<Karakter>();
    private Spelbord bord = new Spelbord();
    public void meldAan (String naamKarakter) {
        Karakter k = new Karakter(naamKarakter);
        karakters.add(k);
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

    public void teleporteer(String naam, int i) {
        Karakter k = getKarakter(naam);
        Vakje v = bord.getVakjes().get(i);
        Vakje oudVakje = k.getVakje();
        oudVakje.verwijderKarakter();
        k.setVakje(v);
    }

    public void wisselVakje(String naam, int i) {
        Karakter k1 = getKarakter(naam);
        Vakje oudVakje = k1.getVakje();
        Vakje nieuwVakje = bord.getVakjes().get(i);
        Karakter k2 = nieuwVakje.getKarakter();

        if(k1.getEnergie() >= 20) {
            nieuwVakje.verwijderKarakter();
            k1.setVakje(nieuwVakje);
            oudVakje.verwijderKarakter();
            k2.setVakje(oudVakje);
            k1.setEnergie(k1.getEnergie() - 20);
        }
    }
}