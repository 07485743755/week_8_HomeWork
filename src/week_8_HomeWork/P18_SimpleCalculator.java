package week_8_HomeWork;

public class P18_SimpleCalculator {

    /* 18. Sum Calculator
    Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
    names firstNumber and secondNumber both of type double.
    Write the following methods (instance methods):
    ● Method named getFirstNumber without any parameters, it needs to return the value of the
    firstNumber field.
    ● Method named getSecondNumber without any parameters, it needs to return the value of
    the secondNumber field.
    ● Method named setFirstNumber with one parameter of type double, it needs to set the value
    of the firstNumber field.
    ● *Method named setSecondNumber with one parameter of type double, it needs to set the
    value of the secondNumber field.
    ● Method named getAdditionResult without any parameters, it needs to return the result of
    adding the field values of firstNumber and secondNumber.
    ● Method named getSubtractionResult without any parameters, it needs to return the result of
    subtracting the field values of secondNumber from the firstNumber.
    ● Method named getMultiplicationResult without any parameters, it needs to return the result
    of multiplying the field values of firstNumber and secondNumber.
    ● Method named getDivisionResult without any parameters, it needs to return the result of
    dividing the field values of firstNumber by the secondNumber. In case the value of
    secondNumber is 0 then return 0.
    TEST EXAMPLE
    TEST CODE: Write the bellow code into main method
    SimpleCalculator calculator = new SimpleCalculator();
    calculator.setFirstNumber(5.0);
    calculator.setSecondNumber(4);
    System.out.println("add= " + calculator.getAdditionResult());
    System.out.println("subtract= " + calculator.getSubtractionResult());
    calculator.setFirstNumber(5.25);
    calculator.setSecondNumber(0);
    System.out.println("multiply= " + calculator.getMultiplicationResult());
    System.out.println("divide= " + calculator.getDivisionResult()); OUTPUT
    add= 9.0
    subtract= 1.0
    multiply= 0.0
    divide= 0.0
    TIPS:
    ● add= 9.0 is printed because 5.0 + 4 is 9.0
    ● subtract= 1.0 is printed because 5.0 - 4 is 1.0
    ● multiply= 0.0 is printed because 5.25 * 0 is 0.0
    ● divide= 0.0 is printed because secondNumber is set to 0
    NOTE: All methods should be defined as public NOT public static.
    NOTE: In total, you have to write 8 methods.
         */

    double firstNumber, secondNumber; //Instance variable

    //Instance method with return type
    public double getFirstNumber() {

        return firstNumber;

    }

    //Instance method with return type
    public double getSecondNumber() {

        return secondNumber;

    }

    //Instance method with parameter
    public void setFirstNumber(double firstNumber) {

        this.firstNumber = firstNumber;

    }

    //Instance method with parameter
    public void setSecondNumber(double secondNumber) {

        this.secondNumber = secondNumber;

    }

    //Instance method with return type
    public double getAdditionResult() {

        return firstNumber + secondNumber;

    }

    //Instance method with return type
    public double getSubtractionResult() {

        return firstNumber - secondNumber;

    }

    //Instance method with return type
    public double getMultiplicationResult() {

        return firstNumber * secondNumber;

    }

    //Instance method with return type
    public double getDivisionResult() {

        if (secondNumber == 0) {

            return 0;
        }
        return firstNumber / secondNumber;

    }

    //Main Method

    public static void main(String[] args) {

        P18_SimpleCalculator calculator = new P18_SimpleCalculator(); //Create object
        calculator.setFirstNumber(5.0); //call setFirstNumber method
        calculator.setSecondNumber(4);  //call setSecondNumber method
        System.out.println("add= " + calculator.getAdditionResult()); //call getAdditionResult method
        System.out.println("subtract= " + calculator.getSubtractionResult()); //call getSubtractionResult method
        calculator.setFirstNumber(5.25);  //call setFirstNumber method
        calculator.setSecondNumber(0);  //call setSecondNumber method
        System.out.println("multiply= " + calculator.getMultiplicationResult()); //call getMultiplicationResult method
        System.out.println("divide= " + calculator.getDivisionResult()); ////call getDivisionResult method
    }

}
