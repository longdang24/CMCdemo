package lesson4;

import java.util.Scanner;


public class switchStatement {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rank = sc.nextInt();
    switch (rank){
        case 1:
            System.out.println("Mien phi phong tong thong");
        case 2:
            System.out.println("Mien phi phong tong thong2 ");
        case 3:
            System.out.println("giam 20%");
        case 4:
            System.out.println("mien phi gui xe");
        case 5:
            System.out.println("tich luy");
    }



    }

}
