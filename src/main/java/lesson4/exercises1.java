package lesson4;


public class exercises1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            switch (i % 15) { // 15 la boi chung chung cua 5 va 3
                case 3:
                case 6:
                case 9:
                case 12:
                    System.out.println("Fizz");
                    break;
                case 5:
                case 10:
                    System.out.println("Buzz");
                    break;
                default:
                    System.out.println(i);

            }
        }
    }
}
