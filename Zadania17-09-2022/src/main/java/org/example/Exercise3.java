package org.example;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Please first integer");
        int num1 = inputNum.nextInt();
        System.out.println("Please input second integer");
        int num2 = inputNum.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of two integers: " + sum);
    }
}
