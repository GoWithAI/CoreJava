package corejava.strings.problems;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesesKata {

    static void main() {
        System.out.println(isBalanced("{{{(())}}}"));
        System.out.println(isBalanced("{{{(()}}}"));
        System.out.println(isBalanced("[({})]"));
        System.out.println(isBalanced("[(])"));
    }

    static boolean isBalanced(String input) {
        // odd length can never pair up
        if (input.length() % 2 != 0) {
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            switch (c) {
                case '(', '[', '{' -> stack.push(c);
                case ')' -> { if (stack.poll() != '(') return false; }
                case ']' -> { if (stack.poll() != '[') return false; }
                case '}' -> { if (stack.poll() != '{') return false; }
                default -> { }
            }
        }

        return stack.isEmpty();
    }
}
