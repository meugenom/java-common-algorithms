package leetcode.ReverseWordsInStringIII;

public class ReverseWordsInStringIII {

	public static String reverseWords(String s) {

		int length = s.split(" ").length;
		String out = "";

		String[] reversed = new String[length];
		reversed = s.split(" ");

		int step = 0;
		while (step < length) {
			if (out.length() == 0) {
				out = reverse(reversed[step]);
			} else {
				out = out + " " + reverse(reversed[step]);
			}
			step++;
		}

		return out;
	}

	public static String reverse(String word) {

		int j = word.length() - 1;
		int i = 0;
		String tmp;

		String[] arr = new String[word.length()];

		for (int a = 0; a < arr.length; a++) {
			arr[a] = String.valueOf(word.charAt(a));
		}

		while (j >= i) {
			tmp = arr[j];
			arr[j] = arr[i];
			arr[i] = tmp;

			i++;
			j--;
		}
		String out = "";

		for (int b = 0; b < arr.length; b++) {
			out = out + arr[b];
		}

		return out;

	}

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		// reverseWords(s);
		// System.out.println(reverse("abcde"));
		System.out.println(reverseWords(s));
	}
}
