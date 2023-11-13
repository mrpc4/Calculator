// Author: Chima Ukachukwu

public class Calculator {
    private int result;

    public Calculator() {
        result = 0;
    } // Default COnstructor 

   // add
    public void add(int number1 , int number2) {
        result = number1 + number2;
    } // end of add


    // substract
    public void substract(int number1, int number2){
        result = number1 - number2 ;
    } // end substract

    // multiply
    public void multiply(int number1, int number2){
        result = number1 * number2;
    }

// divide
    public void divide(int number1, int number2){
        result = number1 / number2 ; 
    }

    // display result
    public int getResult() {
        return result;
    }

    public static void main(String[] args) {
//declare 2 numbers

	int num1 = 56, num2 = 78;
// instantiate an object calculator
    System.out.println("My name is Chima Ukachukwu, let me be your calculator for today!");
Calculator Mycalculator = new Calculator();

// add num1
        Mycalculator.add(num1,num2);
        System.out.println(" The sum of 56 and 78 is "+Mycalculator.getResult());

// substract num2
        Mycalculator.substract(num2,num1);
        System.out.println(" The diffrence of 56 and 78 is "+Mycalculator.getResult());

//multiply num1 and num2
        Mycalculator.multiply(num1, num2);
        System.out.println(" The product of 56 and 78 is "+Mycalculator.getResult());

// divide num1 and num2
        Mycalculator.divide(num1, num2);

// display the result 
        System.out.println(" The quotient of 56 and 78 is "+Mycalculator.getResult());


    }
}
