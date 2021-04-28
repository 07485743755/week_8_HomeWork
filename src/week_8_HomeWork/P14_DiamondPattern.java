package week_8_HomeWork;

import java.util.Scanner;

public class P14_DiamondPattern {


    /*  14. Write a program in Java to display the pattern like a diamond.
     While loop
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
     */

    //Static method

    public static void diamond(int number) {

        //Local variable
        int i = 1;
        number=number/2+1;
        int raw = number;


        //Logic for up part of diamond

        while (i < number) {

            int j = 1;

            while (j <= raw - 1) {

                System.out.print(" ");
                j++;
            }

            j = 1;
            while (j <= i * 2 - 1) {

                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
            raw--;

        }

        //Logic for down part of diamond

        raw=number;
        i=1;
        while(i<=number){

            int j=1;
            while(j<=i-1){

                System.out.print(" ");
                j++;
            }
            j=1;
            while(j<=raw*2-1){

                System.out.print("*");
                j++;

            }
            System.out.println();
            i++;
            raw--;

        }

    }

    //Main method
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in); //create object
        System.out.print("Enter the number for total no. raw in diamond pattern : " + "\t");
        int number = num.nextInt();
        diamond(number);  //call diamond method direct
    }
}
