// package pw1and2;
//EXERCISE 4
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();
        System.out.println("Choose an operation:");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.println("5. %");
        System.out.print("Operation: ");
        int choice = myObj.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Output: " + num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Output: " + num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Output: " + num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Output: " + num1 + " / " + num2 + " = " + ((double) num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                if (num2 != 0) {
                    System.out.println("Output: " + num1 + " % " + num2 + " = " + (num1 % num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }

        myObj.close();
    }
}

/*
 * Write a program that applies an arithmetic operation between 2 integers that
 * were asked to the user.
 * The operand is asked with a basic menu: use a switch to analyze which
 * operation
 * should be performed. Here is an example of expected output:
 */
/*
 * output:
 * Give 2 integers successively:
 * 2
 * 1
 * Choose an operation:
 * 1. +
 * 2. -
 * 3. *
 * 4. /
 * 5. %
 * 
 * Operation: 1
 * Output: 2 + 1 = 3
 */