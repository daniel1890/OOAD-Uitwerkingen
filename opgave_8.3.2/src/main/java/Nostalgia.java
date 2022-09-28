public class Nostalgia implements MovieType{
    @Override
    public double getCharge(int days) {
        int result = (int) (days * 0.5);
        return result;
    }

    @Override
    public int getFrequentRenterPoints(int days) {
        if(days > 2) {
            return 2;
        } else {
            return 0;
        }
    }
}
