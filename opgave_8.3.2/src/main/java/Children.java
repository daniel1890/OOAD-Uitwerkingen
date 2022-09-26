public class Children implements MovieType{
    @Override
    public double getCharge(int days) {
        double result = 1.5;
        if(days > 3) {
            result += (days - 3) * 1.5;
        }

        return result;
    }

    @Override
    public int getFrequentRenterPoints(int days) {
        return 0;
    }
}
