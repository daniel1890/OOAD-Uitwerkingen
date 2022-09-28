public class Movie{

    private MovieType movieType;

    private String title;
    private int releaseyear;

    public Movie(String title, int year, MovieType movieType) {
        this.title = title;
        this.releaseyear = year;
        this.movieType = movieType;
    }

    public double getCharge(int daysRented) {
        return movieType.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int days) {
        return movieType.getFrequentRenterPoints(days);
    }
}
