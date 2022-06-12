public class BankAccount {

    private static double interestRate = 0.02;
    private static int countId = 1;

    private int id;
    private double balance;

    public BankAccount() {
        this.id = countId;
        countId++;
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public Double getInterest(int years) {
        return interestRate * years * this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public int getId() {
        return id;
    }
}
