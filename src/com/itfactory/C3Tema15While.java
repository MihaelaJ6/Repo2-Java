package com.itfactory;
public class C3Tema15While {
    /**
     * Se da un numar x = 1.
     * Se se incrementeze numarul x pana cand acesta depaseste 5.
     * @param args
     */
    public static void main(String[] args){
        int x = 1;
        while (x <= 5) {
            x++;
            System.out.println(x);
        }
        System.out.println("Numarul este: " + x);
    }
}