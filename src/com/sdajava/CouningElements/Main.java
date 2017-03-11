package com.sdajava.CouningElements;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x, licznik = 0;
       int[] matrix = {12, 89, 0, 0, 10, 15, -90};

        System.out.println("Podaj pierwszą liczbę:");

        Scanner on = new Scanner(System.in);
        x = on.nextInt();

        for(int i = 0; i< matrix.length; i++) {
            if (matrix[i] == x) {
                System.out.println("Jest!!!");
                licznik++;
            } else {
                System.out.println("Nie ma!!!");
            }
        }
        System.out.println(licznik);
    }
}
