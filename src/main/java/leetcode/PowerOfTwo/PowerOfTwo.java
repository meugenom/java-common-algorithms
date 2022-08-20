package leetcode.PowerOfTwo;

public class PowerOfTwo {

	/* bitwise solution
	 * 	public boolean isPowerOfTwo(int n) {
        	return n>0 && ( (n&(n-1)) == 0) ;
    	}
	 */

	public static boolean isPowerOfTwo(int n) {

		return pow((double) n);
	}

	public static boolean pow(double n) {

		if (n == 1)
			return true;
		if (n < 1)
			return false;

		return pow(n / 2);

	}

	public static void main(String[] args) {
		// int n = 16;
		// int n = 3;
		int n = 1;
		System.out.println(isPowerOfTwo(n));
	}
}
