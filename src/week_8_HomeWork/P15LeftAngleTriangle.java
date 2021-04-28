package week_8_HomeWork;

import java.util.Scanner;

public class P15LeftAngleTriangle {


    /*
    15. Display left angle triangle of * using nested for loops

        *
       **
      ***
     ****
    *****

    *
    **
    ***
    ****
    *****

  */


    //Instance method with parameter
    public void rightAngle(int number) {

        int n = number + 2;

        for (int i = 1; i <= n; i++) {

            for (int k = n; k > i; k--) {

                System.out.print(" ");

            }

            for (int j = 1; j < i - 1; j++) {

                System.out.print("*");
            }

            System.out.println(" ");
        }

    }

    //Instance variable
    public static void leftAngle(int number){

        for (int i=1; i<=number;i++){

            for (int j=1; j<=i;j++){

                System.out.print("*");

            }

            System.out.println();
        }

    }

    //Main Method
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in); //Create object
        System.out.print("Enter the value for no of raw: " + "\t");
        int number = num.nextInt();
        P15LeftAngleTriangle right = new P15LeftAngleTriangle();  //create object
        System.out.println("Right angle triangle :");
        right.rightAngle(number); //call rightAngle method in main method via object
        System.out.println("\n"+"Left angle triangle : ");
        leftAngle(number); //call leftAngle method in main method direct

    }
}
