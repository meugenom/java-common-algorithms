package leetcode.DecodeString;

import java.util.Stack;

public class DecodeString {

	public String decodeString(String s) {

		Stack<Integer> count = new Stack<>();
		Stack<String> result = new Stack<>();

		String res = "";
		int i = 0;

		while (i < s.length()) {

			if (Character.isDigit(s.charAt(i))) {

				int num = 0;
				while (Character.isDigit(s.charAt(i))) {

					num = num * 10 + (s.charAt(i) - '0');
					i++;

				}
				count.push(num);
			} else if (s.charAt(i) == '[') {

				result.push(res);
				res = "";
				i++;

			} else if (s.charAt(i) == ']') {

				StringBuilder temp = new StringBuilder(result.pop());
				int num = count.pop();

				for (int j = 0; j < num; j++) {
					temp.append(res);
				}
				res = temp.toString();
				i++;

			} else {

				res += s.charAt(i);
				i++;

			}
		}
		return res;
	}

	public static void main(String[] args) {
		DecodeString ds = new DecodeString();
		String s = "2[3[a]2[bc]]rr2[f]j";
		System.out.println(ds.decodeString(s));
	}
}
