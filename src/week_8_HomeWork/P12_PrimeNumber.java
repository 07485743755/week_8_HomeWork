package week_8_HomeWork;

import java.util.Scanner;

public class P12_PrimeNumber {

    /*12. Write a programme to input any number and check if it is prime or not.
    (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
    prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
    17.... are the prime numbers.)  */

    //Instance Method with parameter

    public void primeNumber(int number) {

        boolean result = false;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {

                result = false;
                break;

            } else {

                result = true;

            }

        }

        if (number == 1 || number == 2) {

            System.out.println("Given number " + "\t" + number + "\t" + "is prime number");

        } else if (result == false) {

            System.out.println("Given number " + "\t" + number + "\t" + "is not prime number");


        } else {

            System.out.println("Given number " + "\t" + number + "\t" + "is prime number");

        }
    }

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);  //create object
        System.out.print("Enter the number :" + "\t");
        int number = num.nextInt();

        P12_PrimeNumber prime = new P12_PrimeNumber(); //create object
        prime.primeNumber(number);  //call prime method via object
    }
}
