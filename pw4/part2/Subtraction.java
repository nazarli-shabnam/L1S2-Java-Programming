package pw4.part2;
public class Subtraction implements ArithmeticExpression {
    private ArithmeticExpression left, right;
    public Subtraction(ArithmeticExpression left, ArithmeticExpression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public double asValue() {
        return left.asValue() - right.asValue();
    }
    @Override
    public String asString() {
        return "(" + left.asString() + "-" + right.asString() + ")";
    }
}