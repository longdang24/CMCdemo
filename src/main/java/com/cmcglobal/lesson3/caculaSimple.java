package com.cmcglobal.lesson3;
import java.util.Scanner;

public class caculaSimple {
//    public static void main(String[] args) {
//        // Create new object
//        Scanner scanner = new Scanner(System.in);
//
////        int firt = scanner.nextInt();
//        System.out.println("Enter the firt interger " );
//        int firt = scanner.nextInt();
////        int second = scanner.nextInt();
//        System.out.println("Enter the second interger ");
//        int second = scanner.nextInt();
//
//        System.out.println("Addition " + (firt +second))10;
//        System.out.println("Subtraction " + (firt - second));
//        System.out.println("Multiplication " + (firt * second));
//        System.out.println("Division " + (firt / second));
//
//    }
 //   --------------------------
//    public static void main(String[] args) {
//        // Create new object
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your weight in kilograms: ");
//        int weight = scanner.nextInt();
//        System.out.println("Enter your height in meters: ");
//        float height = scanner.nextFloat();
//
//        float BMI = weight/(height*height);
//
//        System.out.println("Your BMI is : " + BMI);
//
//
//}
//public static void main(String[] args) {
//        // Create new object
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter an integer: ");
//        int num = scanner.nextInt();
//
//        num++;
//        System.out.println("After incrementing: "+ num);
//
//        num--;
//        System.out.println("After decrementing: "+ num);
//}
public static void main(String[] args) {
    // Create new object
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter year: ");
    int leapYear = scanner.nextInt();


    if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 ==0){
        System.out.print( leapYear +" is a leap year");

    }
    else
    {
        System.out.println(leapYear+" is not a leap year");
    }
}














}


