package week_8_HomeWork;

import java.util.*;

public class P2_MinAndMaxInputChallenge {

    //Instance method
    public void m1() {

        int intNumber, i = 1, n = 0, minNumber = 0, maxNumber = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number: ");
        intNumber = num.nextInt();
        minNumber = intNumber;

        while (i > 0) {

            intNumber = num.nextInt();

            if (intNumber >= 0) {

                for (int j = 0; j < n; j++) {

                    if (intNumber < minNumber) {

                        minNumber = intNumber;
                    }
                }
                for (int j = 0; j < n; j++) {

                    // max=a;
                    if (intNumber > maxNumber) {

                        maxNumber = intNumber;
                    }
                }

            } else {

                System.out.println("Invalid Number");
                System.out.println("Min number is  = " +"\t\t"+ minNumber);
                System.out.println("Max number is  = " +"\t\t"+ maxNumber);
                System.out.println("Total no of entered value: " +"\t\t"+ (n + 1));
                break;
            }


            i++;
            n = i;
        }
    }

    public static void main(String[] args) {

        P2_MinAndMaxInputChallenge obj = new P2_MinAndMaxInputChallenge();
        obj.m1();

    }
}
