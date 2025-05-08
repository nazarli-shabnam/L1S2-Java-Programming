package pw6;

public class TestParenthesisMatching {
    public static void main(String[] args) {
        String[] testCases = {
            "((a+b)-(c+d))",     // correct
            "a+(b+(c+d))",       // correct
            "((a+b)+c",          // incorrect
            "((a+b)+c))",        // incorrect
            ")a+b(",             // incorrect
            "",                  // correct (empty string => balanced)
            "((()))",            // correct
            "(()",               // incorrect
            "())(",              // incorrect
        };

        for (String test : testCases) {
            ParenthesisMatching checker = new ParenthesisMatching(test);
            boolean result = checker.parse();
            System.out.println("Expression: \"" + test + "\" is " + (result ? "BALANCED" : "NOT BALANCED"));
        }
    }
}

