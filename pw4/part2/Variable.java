package pw4.part2;

public class Variable implements ArithmeticExpression {
    private String name;
    private double value;

    public Variable(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public void set(double value) {
        this.value = value;
    }
    @Override
    public double asValue() {
        return value;
    }
    @Override
    public String asString() {
        return name;
    }
}
