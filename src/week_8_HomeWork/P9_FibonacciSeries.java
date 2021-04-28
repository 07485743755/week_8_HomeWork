package week_8_HomeWork;

import java.util.Scanner;

public class P9_FibonacciSeries {

    //9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)

    //Static method with one parameter

    public static void fibonacci(int number){

        int priviousNumber=0,firstNumber=1,sum;

        for(int i=0;i<number;i++){

            System.out.print(priviousNumber+" ");
            sum=priviousNumber+firstNumber;
            priviousNumber=firstNumber;
            firstNumber=sum;

        }

    }

    //Main method
    public static void main(String[] args) {

        Scanner num=new Scanner(System.in);
        System.out.print("Enter the value up to the number you want Fibonacci series: "+"\t");
        int number=num.nextInt();
        System.out.print("Fibonacci series ="+"\t");
        fibonacci(number);  //call fibonacci method in main method direct

    }

}
