package com.itfactory;
import java.util.Random;
public class C3Tema9If {
    /**Am un cos cu bile. Bilele sunt de 3 culori: negru, alb si rosu
     Pentru usurinta o sa asimilam urmatoarele culori cu numere:
     Negru: 1
     Alb: 2
     Rosu: 3
     La fiecare rulare o sa extrag cate 2 bile.
     1. Daca ambele bile sunt rosii afisati mesajul "Culori"
     2. Daca o bila este neagra si una este alba afisati mesajul "Nonculori"
     */
    public static void main(String[] args) {
        Random random = new Random();
        int culoare1 = random.nextInt(3 + 1);
        int culoare2 = random.nextInt(3 + 1);

        if ((culoare1 != 3) && culoare1 != culoare2) {
            System.out.println("Nonculori: " + culoare1 + ":" + culoare2);
        }
        if (culoare1 == 3 && culoare2 == 3) {
            System.out.println("Culori: " + culoare1 + ":" + culoare2);
        }
        else if (culoare1 == culoare2){
            System.out.println("Rerun");
        }
    }
}