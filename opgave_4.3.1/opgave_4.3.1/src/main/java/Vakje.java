public class Vakje {
    private Karakter karakter;
    private int vaknr;

    public void setVaknr(int vaknr) {
        this.vaknr = vaknr;
    }

    public int getVaknr() {
        return this.vaknr;
    }
    public void setKarakter(Karakter karakter) {
        this.karakter = karakter;
    }

    public void verwijderKarakter() {
        this.karakter = null;
    }

    public Karakter getKarakter() {
        return karakter;
    }
}
