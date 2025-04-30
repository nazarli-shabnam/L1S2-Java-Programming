package pw4.part2;

public class Division implements ArithmeticExpression {
    private ArithmeticExpression left, right;
    public Division(ArithmeticExpression left, ArithmeticExpression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public double asValue() {
        return left.asValue() / right.asValue();
    }
    @Override
    public String asString() {
        return "(" + left.asString() + "/" + right.asString() + ")";
    }
}
