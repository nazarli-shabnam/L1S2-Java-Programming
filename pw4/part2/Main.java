package pw4.part2;

public class Main {
    public static void main(String[] args) {
        Variable x = new Variable("x", 2.5);
        Variable y = new Variable("y", 4);
        ArithmeticExpression exp = new Sum(x, new Product(y, new Sum(x, y)));
        System.out.println(exp.asString()); 
        System.out.println(exp.asValue()); 
        x.set(5);
        System.out.println(exp.asValue());  
    }
}

