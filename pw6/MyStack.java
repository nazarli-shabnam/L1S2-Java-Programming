package pw6;

public class MyStack<E> {
    private int maxSize;
    private Object[] stack;
    private int top;

    public MyStack(int size) {
        maxSize = size;
        stack = new Object[maxSize];
        top = -1;
    }

    public void push(E value) {
        if (top >= maxSize - 1) {
            throw new MaxCapacityException("Stack overflow. Cannot push " + value);
        }
        stack[++top] = value;
    }

    public E pop() {
        if (top < 0) {
            throw new EmptyStackException("Stack underflow.");
        }
        return (E) stack[top--];
    }

    public E peek() {
        if (top < 0) {
            throw new EmptyStackException("Stack is empty.");
        }
        return (E) stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Stack: ");
        for (int i = 0; i <= top; i++) {
            sb.append(stack[i]).append(" ");
        }
        sb.append("| Capacity: ").append(maxSize).append(", Top: ").append(top);
        return sb.toString();
    }
}
