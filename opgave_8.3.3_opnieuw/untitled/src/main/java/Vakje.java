public class Vakje {
    private Karakter karakter;
    private int vaknr;
    private int xPositie;
    private int yPositie;

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

    public int berekenVakjeAfstand(int vaknr) {
        return this.vaknr - vaknr;
    }
}
