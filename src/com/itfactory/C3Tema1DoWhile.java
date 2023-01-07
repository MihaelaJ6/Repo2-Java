package com.itfactory;
import java.util.Scanner;
public class C3Tema1DoWhile {
    /**
     * Se se implementeze un program in care se citeste un numar de la tastatura pana la introducerea numarului 0.
     * Fiecare numar citit se va afisa sub forma: S-a citit numarul <x>
     */
    public static void main(String[] args)
    {
        System.out.println("Introduceti un numar:");
        Scanner scanner = new Scanner(System.in);
        int x;
        do {
            x = Integer.parseInt(scanner.nextLine());
            System.out.println("S-a citit numarul " + x);
        } while (x != 0);
    }
}