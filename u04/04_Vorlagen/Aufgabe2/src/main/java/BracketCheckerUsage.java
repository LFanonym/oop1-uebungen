public class BracketCheckerUsage {
    void main() {
        checkBrackets("Test1", "(<[()]>){}", true);
        checkBrackets("Test2", "()[]{}<>", true);
        checkBrackets("Test3", "(((<>)))([<>])", true);
        checkBrackets("Test4", "<", false);
        checkBrackets("Test5", "[()>", false);
        checkBrackets("Test6", "{)(][}", false);
        checkBrackets("Test7", "({)}", false);
        checkBrackets("Test8", "", true);
    }

    void checkBrackets(String testName, String input, boolean expected) {
        boolean result = new BracketChecker().validate(input);
        IO.println(testName + " '" + input + "': " + (expected == result ? "ok" : "failed"));
    }
}
