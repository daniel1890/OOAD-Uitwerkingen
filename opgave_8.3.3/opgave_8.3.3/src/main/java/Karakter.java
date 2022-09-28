import java.io.PrintStream;

public class Karakter {
    private String naam;
    private int energie;
    private Vakje vakje;
    private Vervoermiddel vervoermiddel;
    public Karakter(String naam, Vervoermiddel vervoermiddel) {
        this.naam = naam;
        this.energie = 1000;
        this.vervoermiddel = vervoermiddel;
    }
    public Vakje getVakje () {
        return vakje;
    }
    public String getNaam () {
        return naam;
    }
    public void setVakje(Vakje v) {
        this.vakje = v;
        v.setKarakter(this);
    }

    public void teleporteer(Vakje doelVakje) {
        vakje.verwijderKarakter();
        setVakje(doelVakje);
    }

    public void wisselVakje(Vakje doelVakje)  throws NullPointerException{
        try {
            Karakter k2 = doelVakje.getKarakter();

            if(this.energie >= 20) {
                doelVakje.verwijderKarakter();
                Vakje oudVakje = this.vakje;
                this.vakje.verwijderKarakter();
                k2.setVakje(oudVakje);
                this.setVakje(doelVakje);
                this.setEnergie(this.energie - 20);
            }
        }catch (NullPointerException e) {
            System.out.println("Geen karakter op doelvak");
        }
    }

    public int getEnergie() {
        return energie;
    }

    public void setEnergie(int energie) {
        this.energie = energie;
    }
}