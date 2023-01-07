package com.itfactory;
import java.util.Random;
public class C3Tema16While {
    /**
     * Se cere sa se creeze o bucla while prin care se genereaza cate un numar randon intre 1 si 10 la fiecare iteratie.
     * In momentul in care s-a generat 5 se va iesi din bucla.
     */
    public static void main(String[] args)
    {
        Random random = new Random();
        int x = random.nextInt(10 + 1);
        while (x<=10)
        {
            if(x == 5) {
                //Acest break folosit in bucle ma ajuta ca la un momentdat sa inchid bucla. In acest caz, in momentul in care am generat 5, am iesti din bucla.
                System.out.println("Iesim din bucla");
                break;
            }
            x= random.nextInt(10+1);
            System.out.println("Numarul generat este: " + x);
        }
    }
}