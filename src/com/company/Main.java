package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int[] a = new int[40];
        for (int i = 0; i < a.length; i++) {
            a [i] = random.nextInt(100);
            System.out.print(a [i] + " ");
        }
        System.out.print("\nPlease, enter any number: ");
        int b = scan.nextInt();
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a [i] == b) {
                System.out.println("Number you are looking for is located in this index - [" + i + "]");
                j++;
            }
        } if (j == 0) {
            System.out.println("The number you entered is not in the range.\nPlease, come tomorrow!");
        }
    }
}