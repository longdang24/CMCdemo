package lesson4;

import java.util.Scanner;


public class exercises2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int percent = scanner.nextInt();
        int  grade = percent/10;
            switch (grade) {
                case 10:
                case 9:
                    System.out.println("Your grade is A");
                    break;
                case 8:
                    System.out.println("Your grade is B");
                    break;
                case 7:
                    System.out.println("Your grade is C");
                    break;
                case 6:
                    System.out.println("Your grade is D");
                    break;
                default:
                    System.out.println("your grade is F");

            }

    }
}
