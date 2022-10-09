import Vervoermiddelen.IVervoermiddel;

public class Karakter {
    private String naam;
    private int energie;
    private Vakje vakje;
    private IVervoermiddel vervoermiddel;
    public Karakter(String naam, String vervoermiddel) {
        this.naam = naam;
        this.energie = 1000;
        this.vervoermiddel = Garage.verkrijgNieuwVervoermiddel(vervoermiddel);
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

    public void ruilVervoermiddel(Karakter k2) {
        int vakjeAfstand = k2.getVakje().berekenVakjeAfstand(this.getVakje().getVaknr());

        if(vakjeAfstand >= -1 && vakjeAfstand <= 1) {
            IVervoermiddel tussenVervoermiddel = this.getVervoermiddel();
            this.setVervoermiddel(k2.getVervoermiddel());
            k2.setVervoermiddel(tussenVervoermiddel);
        }
        else {
            System.out.println("Karakters staan niet naast elkaar");
        }
    }

    public int getEnergie() {
        return energie;
    }

    public void setEnergie(int energie) {
        this.energie = energie;
    }

    public IVervoermiddel getVervoermiddel() {
        return vervoermiddel;
    }

    public void setVervoermiddel(IVervoermiddel vervoermiddel) {
        this.vervoermiddel = vervoermiddel;
    }
}