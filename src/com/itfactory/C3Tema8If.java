package com.itfactory;

import java.util.Random;

public class C3Tema8If {
    /**
     Vreau sa verific daca un numar este intre 1 si 25, intre 25 si 50, intre 50 si 75 sau intre 75 si 100
     1.....25......50......75.....100 ?
     */
    public static void main(String[] args)
    {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        if (randomInt >= 50 & randomInt <= 75) {
            System.out.println(randomInt);
            System.out.println("Numarul introdus este intre 50 si 75");
        }
        if (randomInt >= 75 & randomInt <= 100) {
            System.out.println(randomInt);
            System.out.println("Numarul introdus este intre 75 si 100");
        }
        if (randomInt >= 25 & randomInt <= 50) {
            System.out.println(randomInt);
            System.out.println("Numarul introdus este intre 25 si 50");
        } else if (randomInt <= 25) {
            System.out.println(randomInt);
            System.out.println("Numarul introdus este intre 0 si 25");
        }

    }
}
