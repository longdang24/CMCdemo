package lesson6;

class currentAccount extends bankAccount implements transaction{

    public currentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited into Current Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Overdraft allowed. Balance will be negative.");
            balance -= amount;
        } else {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn from Current Account.");
        }
    }
}
