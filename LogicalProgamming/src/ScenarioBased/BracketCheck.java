package ScenarioBased;

import java.util.Stack;

public class BracketCheck {
	public static void main(String[] args) {
		String s1 = "()";
		String s2 = "()[]{)";
		String s3 = "(]";

		System.out.println(isValid(s1)); // Output: true
		System.out.println(isValid(s2)); // Output: true
		System.out.println(isValid(s3)); // Output: false
	}

	private static boolean isValid(String s1) {
		Stack<Character> stack = new Stack<>();

		for (char ch : s1.toCharArray()) {

			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}

			else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();

			}
			else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();

			}
			
			else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();

			}
			
			else {
				return false;
			}

		}
		return stack.isEmpty();
	}

}
