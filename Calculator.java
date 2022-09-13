import java.util.*;
public class Calculator {
    public Calculator() {
    }
    public double add(double number1, double number2) {
        return number1 + number2;
    }
    public double substract(double number1, double number2) {
        return number1 - number2;
    }
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }
    public double divide(double number1, double number2) {
        return number1 / number2;
    }
    public int modulo(int number1, int number2) {
        return number1 % number2;
    }
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        boolean stayInLoop = true;
        while(stayInLoop) {
            System.out.println("Please enter 2 numbers and an operation : ");
            int num1 = scan.nextInt();
            String operator = scan.next();
            int num2 = scan.nextInt();
            switch (operator) {
                case "+":
                    System.out.println(myCalculator.add(num1, num2));
                    break;
                case "-":
                    System.out.println(myCalculator.substract(num1, num2));
                    break;
                case "*":
                    System.out.println(myCalculator.multiply(num1, num2));
                    break;
                case "/":
                    System.out.println(myCalculator.divide(num1, num2));
                    break;     
                case "%":
                    System.out.println(myCalculator.modulo(num1, num2));
                    break;    
                default:
                    System.out.println("Invalid operation! Please try again!");
                    break;
            }

        }
    }
}