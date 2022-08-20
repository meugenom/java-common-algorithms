package leetcode.AddDigits;
/***
 * Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 * 
 * Example 1:
 * Input: num = 38
 * Output: 2
 * Explanation: The process is
 * 38 --> 3 + 8 --> 11
 * 11 --> 1 + 1 --> 2 
 * Since 2 has only one digit, return it.
 * 
 * Example 2:
 * Input: num = 0
 * Output: 0
 */

 //method Simulations
public class AddDigits {
	
	public static int addDigits(int num) {
		
		int digitalRoot = 0;
        
		while (num > 0) {
        
			digitalRoot += num % 10;
            num = num / 10;
            
            if (num == 0 && digitalRoot > 9) {
        
				num = digitalRoot;
                digitalRoot = 0;  
        
			}    
        }     
        return digitalRoot;
    }

	public static void main(String[] args) {
		int num = 1234;
		System.out.println( addDigits(num));

	}
}
