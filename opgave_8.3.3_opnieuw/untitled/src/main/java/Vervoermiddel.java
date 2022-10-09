public class Vervoermiddel {
    String origineleEigenaar;

    public Vervoermiddel(String eigenaar) {
        this.origineleEigenaar = eigenaar;
    }

    public String toString() {
        return "originele eigenaar:" + origineleEigenaar;
    }
}
