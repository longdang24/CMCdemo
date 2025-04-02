package lesson6;

public class Main {
    public static void main(String[] args) {
        // Tạo tài khoản tiết kiệm
        savingsAccount savings = new savingsAccount("Nguyen Van A", 1000);
        // Tạo tài khoản thanh toán
        currentAccount current = new currentAccount("Tran Thi B", 2000);

//        // Thực hiện nạp tiền
//        savings.deposit(500);
//        savings.displayBalance();

//        current.deposit(800);
//        //current.withdraw(3000); // Thử overdraft (rút nhiều hơn số dư)
//        current.displayBalance();
//
//        // Rút tiền từ tài khoản tiết kiệm
//        savings.withdraw(1200); // Thử rút vượt quá số dư
//        savings.displayBalance();
    }
}

