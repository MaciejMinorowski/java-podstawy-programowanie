package org.example;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input number from 0 to 5");
        int integer = input.nextInt();

        if (integer < 0 || integer > 5){
            System.out.println("Wrong number given");
        }
        else {
            switch (integer){
                case 0:
                    System.out.println("*");
                    break;
                case 1:
                    System.out.println("!");
                    break;
                case 2:
                    System.out.println("#");
                    break;
                case 3:
                    System.out.println("%");
                    break;
                case 4:
                    System.out.println("&");
                    break;
                case 5:
                    System.out.println("^");
                    break;
                default:
                    System.out.println("Given number is not correct");

                }
            }
        }
}

