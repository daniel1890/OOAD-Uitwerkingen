public abstract class Account {
    private int accountno;
    private String customer;
    private double balance;

    public Account(Bank b, String cust, double perc) {
        // ...
    }

    public void deposit(double amount) {

    }

    public void withdraw(double amount) {

    }

    public int getAccountno() {

        return this.accountno;
    }
}
