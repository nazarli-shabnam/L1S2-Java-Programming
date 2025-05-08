package pw6;

public class ParenthesisMatching {
    private MyStack<Character> stack;
    private String input;

    public ParenthesisMatching(String input) {
        this.input = input;
        this.stack = new MyStack<>(input.length());
    }

    public static boolean bracketsAreMatching(char c1, char c2) {
        return c1 == '(' && c2 == ')';
    }

    public boolean parse() {
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (!bracketsAreMatching(topChar, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public MyStack<Character> getStack() {
        return stack;
    }

    public void setStack(MyStack<Character> stack) {
        this.stack = stack;
    }
}

