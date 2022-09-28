public class NewRelease implements MovieType{
    @Override
    public double getCharge(int days) {
        return days * 3;
    }

    @Override
    public int getFrequentRenterPoints(int days) {
        if(days > 1) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
