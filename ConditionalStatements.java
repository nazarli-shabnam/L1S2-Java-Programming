// package pw1and2;
//EXERCISE 3
import java.util.Scanner;


public class ConditionalStatements {
    public  static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1=myObj.nextInt();
        // System.out.println("Enter a number: ");
        int num2=myObj.nextInt();
        //System.out.println("the first num: "+num1+"\nThe second num: "+num2);
        System.out.println("The sum of "+num1+" and "+num2+" is: "+sum(num1,num2));
        mult(num1,num2);
        myObj.close();
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static void mult(int a, int b){
        if(a%2==0 || b%2==0){
            int newNum1=a*a;
            int newNum2=b*b;
            System.out.println("The squares of "+a+" and "+b+" are respectively "+newNum1+" and "+newNum2);}
        else{
            System.out.println("The product of "+a+" and "+b+" is "+a*b);
        }
        
    }
}

/*
 * Specify (give the signature) a method that asks a user to input 2 integers
 * and returns:
 * 
 * a. The sum of a and b if both integers are even
 * b. The multiplication of a by b if both integers are odd
 * c. Else, the square of each integers
 * 
 * Write your method using a Scanner for the keyboard inputs.
 */