package pw5;
public class Product extends BinaryOperator {
    public Product(ArithmeticExpression left, ArithmeticExpression right) {
        super(left, right);
    }
    
    @Override
    protected String label() {
        return "*";
    }
    
    @Override
    protected double eval(double arg1, double arg2) {
        return arg1 * arg2;
    }
}

