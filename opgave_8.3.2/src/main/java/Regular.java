public class Regular implements MovieType{
    @Override
    public double getCharge(int days) {
        double result = 2;

        if(days > 2) {
            result += (days - 2) * 1.5;
        }

        return result;
    }

    @Override
    public int getFrequentRenterPoints(int days) {
        return 0;
    }
}
