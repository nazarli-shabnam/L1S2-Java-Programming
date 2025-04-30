package pw3;
public class Stack {
    private int max_size;   
    private int[] stack;   
    private int top;       

    public Stack(int size) {
        max_size = size;
        stack = new int[max_size];
        top = -1; 
    }

    public void push(int value) {
        if (top >= max_size - 1) {
            System.out.println("Stack overflow. Cannot push " + value);
            return;
        }
        stack[++top] = value;
        System.out.println("pushed the value: " + value);
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack underflow.");
            return -1;
        }
        int value = stack[top--];
        System.out.println("Popped the value: " + value);
        return value;
    }

    public int peek() {
        if (top < 0) {
            System.out.println("the stack is empty.");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        System.out.print("my stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack s = new Stack(6);  

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.printStack();

        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.printStack();
    }
}
