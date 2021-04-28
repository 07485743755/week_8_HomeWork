package week_8_HomeWork;

import java.util.Scanner;

public class P3_VowelConsonantChallenge {

    /*3. Write a Java program that takes the user to provide a single character from the
    alphabet. Print Vowel or Consonant, depending on the user input. If the user input
    Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
    error message.
    For eg:
     Input an alphabet: p
     Expected Output:
     Input letter is Consonant */

    public void singleCharacter(){

        String str; //Local variable
        char input; //Local variable

        Scanner char1=new Scanner(System.in);
        System.out.println("Enter the character: ");
        str=char1.next();
        input=str.charAt(0);

        if (input >= 65 && input <= 90 || input >= 97 && input <= 122 && str.length()==1)
        {

            if(input=='a'||input=='A'||input=='e'||input=='E'||input=='i'||input=='I'||input=='o'
                    ||input=='O' ||input=='u'||input=='U'){

                System.out.println("Input character "+input+" is vowel");
            }else{

                System.out.println("Input character "+input+" is consonant");
            }

        }else {

            System.out.println("Invalid input");

        }
    }

    //Main method
    public static void main(String[] args) {

        P3_VowelConsonantChallenge alphabet=new P3_VowelConsonantChallenge(); //Create object
        alphabet.singleCharacter(); //call singleCharacter method in main method

    }
}
