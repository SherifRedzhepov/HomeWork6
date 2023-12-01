package org.example;

import java.util.Scanner;

public class Methods {

    private  static double generateNum(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    private static double numAverage(double a , double b){

        return (a + b) /2;
    }
    private static double sumOfNum(double a , double b){
        return a + b;
    }


    public static void main(String[] args) {
        System.out.println("Please enter two numbers to find their average:");
        System.out.printf("The average of the numbers is %.1f\n", numAverage(generateNum(), generateNum()));

        System.out.println("Please enter four numbers to find their sum:\n");
        System.out.printf("The sum of the numbers is %.2f",sumOfNum(numAverage(generateNum(), generateNum()),numAverage(generateNum(), generateNum())));
    }
}



