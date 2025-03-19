package com.cmcglobal.lesson4;
import java.util.Scanner;


public class ifElseStatement {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap vao 1 so nguyen duong");
//        int inputNumber = scanner.nextInt();
//
//        if (inputNumber %2 == 0 ){
//            System.out.println("So chan");
//        }else {
//            System.out.println("So le ");
//        }
// ------------------------------------------------------

//        System.out.println(" Nhap 1 so thuc ");
//        float inputNumber = scanner.nextFloat();
//
//        if (inputNumber %2 == 0){
//            System.out.println("So chan");
//        }else if (inputNumber %2 ==1 ){
//            System.out.println("So le");
//        }else {
//            System.out.println("khong phai la so tu nhien");
//        }
        // ---------------------------------------------------------


//        System.out.println("Nhap 1 so diem");
//        int score = scanner.nextInt();
//
//        if (score >89) {
//            System.out.println(" Loai A ");
//        }
//        else if (score > 79){
//            System.out.println("Loai B");
//        }
//        else if (score > 69){
//            System.out.println("Loai C");
//        }else if (score > 59){
//            System.out.println("Loai D");
//        }
//        else {
//            System.out.println("Khong xep loai");
//        }
// ----------------------------------------------------
//        System.out.println("Nhap 1 so diem");
//        int score = scanner.nextInt();
//
//        if (score > 95) {
//            System.out.println("Hoc bong toan phan");
//        }
//        if (score < 96 && score > 85) {
//            System.out.println("Hoc bong ban phan ");
//        }
//        if (score > 89) {
//            System.out.println(" Loai A ");
//        } else if (score > 79) {
//            System.out.println("Loai B");
//        } else if (score > 69) {
//            System.out.println("Loai C");
//        } else if (score > 59) {
//            System.out.println("Loai D");
//        } else {
//            System.out.println("Khong xep loai");
//
//
//        }
        System.out.println("Nhap vao 1 so nguyen duong");
        int inputNumber = scanner.nextInt();
        System.out.println((inputNumber %2 ==0 ) ? "So chan" : "So le");

    }
}
