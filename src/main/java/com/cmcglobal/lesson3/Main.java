package com.cmcglobal.lesson3;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            // Create scaner object
            Scanner scanner = new Scanner(System.in);

            System.out.println("Xin chao moi nguoi: ");
            String name = scanner.nextLine();

            System.out.println("Ten nguoi dung "+ name );
        }
    }
