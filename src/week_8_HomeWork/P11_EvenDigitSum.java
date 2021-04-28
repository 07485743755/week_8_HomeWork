package week_8_HomeWork;

import java.util.Scanner;

public class P11_EvenDigitSum {

    /*11. Even Digit Sum
    Write a method named getEvenDigitSum with one parameter of type int called number.
    The method should return the sum of the even digits within the number.
    If the number is negative, the method should return -1 to indicate an invalid value.
    EXAMPLE INPUT/OUTPUT:
    * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
    * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
    * getEvenDigitSum(-22); → should return -1 since the number is negative
    NOTE: The method getEvenDigitSum should be defined as public static
    */

    //Static method

    public static int getEvenDigitSum(int number) {

        int sum = 0, temp, n = 0, i = 0; //Local variable
        if (number >= 0) {

            //Logic for sum of even digit

            temp = number;

            while (temp > 0) {
                temp = temp / 10;
                n = n + 1;

            }


            int digit[] = new int[n]; //array declaration
            temp = number;

            while (temp > 0) {

                digit[i] = temp % 10;

                if (digit[i] % 2 == 0) {

                    sum = sum + digit[i];
                }
                temp = temp / 10;
                i++;
            }

            return sum;

        } else {

            return -1;
        }

    }

    //Main method
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);  //create object
        System.out.print("Enter the number for sum of digit =" + "\t");
        int number = num.nextInt();
        if (number >= 0) {

            System.out.println("Sum of even digit = " + "\t" + getEvenDigitSum(number));  //call method direct

        } else {

            System.out.println(getEvenDigitSum(number));  //call method direct
        }
    }

}
