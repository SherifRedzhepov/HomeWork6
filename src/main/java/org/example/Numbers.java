package org.example;

import java.util.Scanner;

public class Numbers {
    private  static int generateNum(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void checkNumbersEquals(int a, int b, int c){
        if(a == b && b == c){
            System.out.println( "The numbers are equal.\n");
        }
        else {
            System.out.println("The numbers are not equal.\n");
        }
    }
    private static void checkIsPositive(int a, int b , int c){
     int[] numbers = {a ,b ,c};
        for (int number : numbers) {
            if (number > 0) {
                System.out.printf("Number %d is positive.\n",number);
            } else if (number < 0) {
                System.out.printf("Number %d is negative.\n",number);
            } else {
                System.out.printf("Number %d is 0.\n",number);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Please insert three number to check for equality :\n");
        checkNumbersEquals(generateNum(), generateNum(), generateNum());

        System.out.println("Please insert three number to check for positive :\n");
        checkIsPositive(generateNum(), generateNum(), generateNum());
    }
}
