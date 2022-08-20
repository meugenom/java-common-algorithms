package codewars;

public class CountingDuplicates {

	public static int duplicateCount(String text) {

		String accum = "";
		int step = 0;
		int length = text.length();

		while (step < length) {

			int s = 0;
			while (s < length) {

				String first = String.valueOf(text.charAt(s)).toLowerCase();
				String last = String.valueOf(text.charAt(step)).toLowerCase();
				if (first.equals(last) && s != step) {
					if (accum.indexOf(first) == -1) {
						accum = accum + first;
					}
				}

				s++;
			}
			step++;
		}

		System.out.println(accum);
		return accum.length();
	}

	public static void main(String[] args) {
		// String text = "aabbcde";
		// String text = "indivisibility";
		// String text = "aA11";
		String text = "ABBA";
		System.out.println(duplicateCount(text));
	}
}
