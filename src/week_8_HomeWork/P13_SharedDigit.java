package week_8_HomeWork;

import java.util.Scanner;

public class P13_SharedDigit {

        /*
        13. Shared Digit
    Write a method named hasSharedDigit with two parameters of type int.
    Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
    within the range, the method should return false.
    The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
    otherwise, the method should return false.
    EXAMPLE INPUT/OUTPUT:
    * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
    * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
    * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
    NOTE: The method hasSharedDigit should be defined as public static
         */

    //Instance method with parameters with return type
    public static boolean hasSharedDigit(int a, int b) {

        //Local variable
        int i = 0;
        int a1[] = new int[2];
        int b1[] = new int[2];
        boolean result=false;

        //Logic for shared digit
        if (a >= 10 && a <= 99 && b >= 10 && b <= 99) {

            while (a > 0 && b > 0) {
                a1[i] = a % 10;
                a = a / 10;
                b1[i] = b% 10;
                b = b / 10;
                i++;
            }

            if (a1[0] == b1[0] || a1[0] == b1[1] || a1[1] == b1[0] || a1[1] == b1[1]) {

                result= true;

            }

        }else {

        result= false;

        }


        return result;

    }


    //Main Method
    public static void main(String[] args) {

        Scanner num=new Scanner(System.in);
        System.out.print("Enter first number: "+"\t");
        int a=num.nextInt();
        System.out.print("Enter second number: "+"\t");
        int b=num.nextInt();
        System.out.println("Given number shared digit: "+"\t"+ hasSharedDigit(a,b)); //call method

    }
}
