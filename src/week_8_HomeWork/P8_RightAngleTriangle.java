package week_8_HomeWork;

import java.util.Scanner;

public class P8_RightAngleTriangle {

    /*8. Display right angle triangle of @ using nested for loops
     @
     @@
     @@@
     @@@@
     @@@@@  */


    //Instance method with parameter

    public void rightTriangle(int number){

        //Logic for right angle triangle
        for(int i=1;i<=number;i++){

            for (int j=1;j<=i;j++){

                System.out.print("@");

            }
            System.out.println();
        }

    }

    //Main method
    public static void main(String[] args) {

        Scanner num=new Scanner(System.in);
        System.out.print("Enter the value for no. of raw = "+"\t");
        int number=num.nextInt();

        P8_RightAngleTriangle triangle=new P8_RightAngleTriangle();  //create object
        triangle.rightTriangle(number); //call rightAngle method in main method via object

    }
}
