package com.itfactory;
import java.util.Scanner;
public class C3tema13While {
    /**
     * Sa se citeasca de la tastatura numere pana la introducerea numarului 0.
     * Se cere sa se foloseasca bucla while.
     */
    public static void main(String[] args)
    {
        System.out.println("Introduceti un numar:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        while (x!=0) {
            System.out.println("Am citit: " + x);
            System.out.print("Introdu numarul: ");
            x= scanner.nextInt();
        }
        System.out.println("S-a introdus numarul 0. Ies din bucla");
    }
}
