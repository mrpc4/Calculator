// Author: Chima Ukachukwu

public class Calculator {

  private int result;

  public Calculator() {
    this.result = 0;
  } // Default Constructor

  // Add
  public void add(int number1, int number2) {
    this.result = number1 + number2;
  } // End of add

  // Subtract
  public void subtract(int number1, int number2) {
    this.result = number1 - number2;
  } // End of subtract

  // Multiply
  public void multiply(int number1, int number2) {
    this.result = number1 * number2;
  }

  // Divide
  public void divide(int number1, int number2) {
    this.result = number1 / number2;
  }

  // Display result
  public int getResult() {
    return this.result;
  }

  public static void main(String[] args) {
    // Declare 2 numbers
    int num1 = 56;
    int num2 = 78;

    // Instantiate an object calculator
    System.out.println("My name is Chima Ukachukwu, let me be your calculator for today!");
    Calculator myCalculator = new Calculator();

    // Add num1 and num2
    myCalculator.add(num1, num2);
    System.out.println("The sum of 56 and 78 is " + myCalculator.getResult());

    // Subtract num2 from num1
    myCalculator.subtract(num2, num1);
    System.out.println("The difference of 56 and 78 is " + myCalculator.getResult());

    // Multiply num1 and num2
    myCalculator.multiply(num1, num2);
    System.out.println("The product of 56 and 78 is " + myCalculator.getResult());

    // Divide num1 by num2
    myCalculator.divide(num1, num2);

    // Display the result
    System.out.println("The quotient of 56 and 78 is " + myCalculator.getResult());
  }
}
