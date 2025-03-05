// package pw1and2;
public class exercise1{


    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        int sum = add(5,3);
        int mult = mult(5, 3);
        int max= max(5,3);
        int min=min(5,3,1);
        int gcd=gcd(5,3);
        System.out.println("Sum: " + sum);
        System.out.println("Multiplication: " + mult);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("GCD: " + gcd);
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int mult(int a, int b) {
        return a * b;
    }
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
    public static int min(int a, int b,int c) {
        int min = a;
        if (b < min)
         min = b;
        if (c < min)
         min = c;      
        return min;
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
