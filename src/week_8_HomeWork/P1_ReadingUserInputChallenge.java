package week_8_HomeWork;

import java.util.Scanner;

public class P1_ReadingUserInputChallenge {

    /*

     1. Read 10 numbers from the console entered by the user and print the sum of those
    numbers.
    -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
    -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
    10 numbers.
    -Use the nextInt() method to get the number and add it to the sum.
    -Before the user enters each number, print the message Enter number #x: where x represents the
    count, i.e. 1, 2, 3, 4, etc.
    -For example, the first message printed to the user would be Enter number #1:, the next Enter number
    #2:, and so on.
    Hint:
    -Use a while loop.
    -Use a counter variable for counting valid numbers.
    -Close the scanner after you don't need it anymore.
    -Create a class with the name ReadingUserInputChallenge.
     */


    //Instance method with return type
    public void intValue() {

        Scanner input = new Scanner(System.in);  //Scanner object
        int i = 1, sum = 0;  //Instance variable

        while (i <= 10) {

            System.out.print("Please enter # " + i + " : ");

            if (input.hasNextInt()) {

                sum = sum + input.nextInt();
                i++;

            } else {

                System.out.println("Invalid number");
                input.next();

            }

        }
        System.out.println("Sum of Number is = " + sum);
        input.close();  //Close Scanner

    }

    //Main Method

    public static void main(String[] args) {

        P1_ReadingUserInputChallenge sum1 = new P1_ReadingUserInputChallenge(); //create object
        sum1.intValue(); //call intValue method via object

    }

}
