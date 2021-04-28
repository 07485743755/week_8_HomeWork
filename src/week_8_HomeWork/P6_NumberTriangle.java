package week_8_HomeWork;

import java.util.Scanner;

public class P6_NumberTriangle {

    /*6. Write a program in Java to display the pattern like a triangle with a number.
     For eg.
     Input number of rows: 10
     Expected Output:
     1
     12
     123
     1234
     12345
     123456
     1234567
     12345678
     123456789
     12345678910  */

    //Instance method with parameter
    public void tringle(int input) {

        //Logic for number triangle
        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j);
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);  //create object
        System.out.print("Enter the value for no. of raw : ");
        int input = num.nextInt();
        P6_NumberTriangle tri = new P6_NumberTriangle(); //create object
        tri.tringle(input);  //call triangle method in main method via object

    }

}
