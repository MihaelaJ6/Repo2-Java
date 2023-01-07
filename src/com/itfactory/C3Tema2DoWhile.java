package com.itfactory;
import java.util.Scanner;
public class C3Tema2DoWhile {
    /**
     * Sa se implementeze un program in care se citeste initial un numar x int de la tastatura
     * Sa se creeze o bucla de tip <do while> in care la acest numar se adauga cate un nou numar citit pana in momentul in care acesta depaseste valoarea de 50 (Sau puteti alege voi)
     *
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println("Introduceti un numar:");
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        System.out.print("Numarul initial: " + x);
        do
        {
            System.out.print("Introduceti noul numar: ");
            int y = Integer.parseInt(scanner.nextLine());
            System.out.println("S-a citit numarul: " + y);
            x = x + y; //x += y este un mod mai simplu de a-l aduna pe y la x.
            System.out.println("Am obtinut numarul: " + x);
            System.out.println("---------------------------");
        } while (x <= 50);
        System.out.println("Am iesit din bucla");
    }
}