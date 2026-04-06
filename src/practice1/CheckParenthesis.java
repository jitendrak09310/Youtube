package practice1;

import java.util.Stack;

public class CheckParenthesis {

	public static void main(String[] args) {
		String str = "(((}}}}";

		boolean valid = isValid(str);
		System.out.println(valid);
	}

	public static boolean isValid(String str) {

		Stack<Character> stack = new Stack<>();

		for (char ch : str.toCharArray()) {

			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();

				if (ch == ')' && top != '(') {
					return false;
				}
				if (ch == '}' && top != '{') {
					return false;
				}
				if (ch == ']' && top != '[') {
					return false;
				}
			}

		}

		return stack.isEmpty();

	}

}
