package lesson6;

class savingsAccount extends bankAccount implements transaction {

    public savingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited into Savings Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds in Savings Account.");
        } else {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn from Savings Account.");
        }
    }
}
