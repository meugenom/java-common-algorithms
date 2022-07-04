package com.meugenom.codewars;

public class PlayingWithDigits {

	private static int result = 0;

	public static long digPow(int n, int p) {

		result = 0;

		int step = 0;

		String s = String.valueOf(n);
		int[] arr_n = new int[s.length()];

		int i = 0;
		while (i < s.length()) {
			arr_n[i] = Integer.parseInt(Character.toString(s.charAt(i)));
			i++;
		}

		//for (int j = 0; j < arr_n.length; j++) {
		//	System.out.println("arr[" + j + "] = " + arr_n[j]);
		//}

		multiple(arr_n, step, p);

		//System.out.println("res = " + result);

		if (result / n >= 1) {
			int k = result / n;
			if (k * n == result) {
				// System.out.println(k);
				return k;
			} else {
				return -1;
			}

		} else {
			return -1;
		}

	}

	public static void multiple(int[] arr_n, int step, int p) {

		result = result + (int) Math.pow(arr_n[step], p);

		if (step < arr_n.length - 1) {
			multiple(arr_n, step + 1, p + 1);
		}
	}

	public static void main(String[] args) {
		// System.out.println(digPow(89, 1));
		// System.out.println(digPow(92, 1));
		System.out.println("result : " + digPow(46288, 3));
	}
}
