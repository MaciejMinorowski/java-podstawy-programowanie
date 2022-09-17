package org.example;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input integer");
        int number = input.nextInt();

        if (number == 10) {
            System.out.println("Integer equals 10");
        }
        else if (number < 10) {
            System.out.println("Integer is smaller than 10");
        }
        else {
            System.out.println("Integer is bigger than 10");
        }
    }
}