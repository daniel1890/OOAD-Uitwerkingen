public class MainApp {
    public static void main(String[] args) {
        Movie m1 = new Movie("Shrek", 2001, new NewRelease());
        Movie m2 = new Movie("Shrek 2", 2003, new Regular());
        Movie m3 = new Movie("Shrek 3", 2005, new Nostalgia());

        System.out.println(m1.getCharge(3));
        System.out.println(m2.getCharge(3));
        System.out.println(m3.getCharge(4));
    }
}
