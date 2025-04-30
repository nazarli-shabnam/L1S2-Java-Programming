package pw5;

abstract class BinaryOperator implements ArithmeticExpression {
    protected ArithmeticExpression left;
    protected ArithmeticExpression right;
    
    public BinaryOperator(ArithmeticExpression left, ArithmeticExpression right) {
        this.left = left;
        this.right = right;
    }
    
    protected abstract String label();
    
    protected abstract double eval(double arg1, double arg2);
    
    @Override
    public String asString() {
        return "(" + left.asString() + label() + right.asString() + ")";
    }
    
    @Override
    public double asValue() {
        return eval(left.asValue(), right.asValue());
    }
}

