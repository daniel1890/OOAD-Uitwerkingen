public class Karakter {
    private String naam;
    private int energie;
    private Vakje vakje;
    private Vervoermiddel vervoermiddel;
    public Karakter(String naam) {
        this.naam = naam;
        this.energie = 1000;
        vervoermiddel = new Vervoermiddel();
    }
    public Vakje getVakje () {
        return vakje;
    }
    public String getNaam () {
        return naam;
    }
    public void setVakje(Vakje v) {
        vakje = v;
        v.setKarakter(this);
    }

    public int getEnergie() {
        return energie;
    }

    public void setEnergie(int energie) {
        this.energie = energie;
    }
}