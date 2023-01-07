package com.itfactory;
import java.util.Random;
public class C3Tema4For {
    /**
     * Sa se creeze un program in care se vor parcurge numerele de la 0 la 19
     * La fiecare iteratie, se va genera un numar random x intre 0 si 20
     * Se va verifica conditia daca indexul adunat cu numarul generat random este 30, se va afisa un mesaj de match.
     *
     * Exemplu: la indexul 12 s-a generat numarul x=18. Prin urmare 12 + 18 = 30
     */
    public static void main(String[] args)
    {
        Random random = new Random();
        for(int i = 0; i <= 20; i++) {
            int x = random.nextInt(20);
            if ((i + x) == 30)
            {
                System.out.println("Am gasit un match: " + i + " : " + x);
            } else{
                System.out.println("Numarul este diferit de 30: " + (i+x));
            }
        }
    }
}
