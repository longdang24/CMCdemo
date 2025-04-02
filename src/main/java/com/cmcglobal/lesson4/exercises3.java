package com.cmcglobal.lesson4;


import java.util.Random;
import java.util.Scanner;

public class exercises3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10)+1;
        int guess = 0;
        int cout = 0;

        System.out.println("Title guess number 1-10");
        System.out.println("enjoy ");

        while (guess != randomNumber){
           System.out.println("Enter your nunber: " );
           guess = sc.nextInt();
           cout++;
        if (guess < randomNumber){
            System.out.println("too low");
        }else if (guess > randomNumber){
            System.out.println("Too high");
        }else {
            System.out.println("Correct "+guess);
            System.out.println("attemp "+ cout);
        }
        }



    }
}
