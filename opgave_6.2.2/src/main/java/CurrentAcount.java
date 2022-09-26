public class CurrentAcount extends Account{
    private double credLimit;

    public CurrentAcount(Bank b, String cust, double perc) {
        super(b, cust, perc);
    }

    @Override
    public void withdraw(double amount) {

    }

    public double getCredLimit() {
        return this.credLimit;
    }

    public void setCredLimit(double cred) {
        this.credLimit = cred;
    }
}
