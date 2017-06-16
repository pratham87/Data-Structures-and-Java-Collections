package stackProbs;

import java.util.Stack;

public class PopSequence {

	public static boolean validatePopSeq(String pushSeq, String popSeq) {
		Stack<Character> stack = new Stack<>();
		if (pushSeq == null || popSeq == null) {
			return false;
		}
		int i = 0, j = 0;
		while (i < pushSeq.length() && j < popSeq.length()) {
			while (!stack.isEmpty() && stack.peek() == popSeq.charAt(j)) {
				stack.pop();
				j++;
			}
			stack.push(pushSeq.charAt(i++));
		}

		while (!stack.isEmpty() && j < popSeq.length()) {
			if (stack.pop() != popSeq.charAt(j++)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println("Valid Seq: " + validatePopSeq("12345", "45321"));
		System.out.println("Invalid Seq:" + validatePopSeq("12345", "43512"));
	}

}
