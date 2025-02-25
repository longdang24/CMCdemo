package com.cmcglobal.lesson3;

import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int A = 9/5;
//        int B= 32;

        System.out.println("Enter temperature in Celsius");
        int C = scanner.nextInt();
        int fomula = (C *9/5)+32;

//        System.out.println("Temperature in Fahrenheit: " + ((C *A)+B));
        System.out.println("Temperature in Fahrenheit: " + fomula);
    }
}
