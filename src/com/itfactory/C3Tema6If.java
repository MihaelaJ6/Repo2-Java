package com.itfactory;
import java.util.Scanner;
public class C3Tema6If {
    /**
     * Se citeste un numar de la tastatura. Sa se afiseze un mesaj afirmativ daca numarul este mai mare ca 10
     * In caz contrar se va afisa un mesaj negativ.
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int x = scanner.nextInt();
        if (x > 10){
            System.out.println("Numarul este mai mare ca 10 ");
        } else {
            System.out.println("Numarul nu este mai mare ca 10 ");
        }
    }
}
