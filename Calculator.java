// Author: Chima Ukachukwu

public class Calculator {
    private int result;

    public Calculator() {
        result = 0;
    } // Default COnstructor 

   // add
    public void add(int number) {
        result += number;
    } // end of add


    // substract
    public void substract(int number){
        result -= number;
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
        Mycalculator.add(num1);
        System.out.println(" The result of the calculator is "+Mycalculator.getResult());

// substract num2
        Mycalculator.substract(num2);
        System.out.println(" The result of the calculator is "+Mycalculator.getResult());

//multiply num1 and num2
        Mycalculator.multiply(num1, num2);
        System.out.println(" The result of the calculator is "+Mycalculator.getResult());

// divide num1 and num2
        Mycalculator.divide(num1, num2);

// display the result 
        System.out.println(" The result of the calculator is "+Mycalculator.getResult());


    }
}
