package leetcode.LongestPalindromicSubstring;

public class LongestPalindromicSubstring {

	public static String  palindrom = "";

	public static String longestPalindrome(String s) {

		//private case when s.length() = 1
		if(s.length() == 1) return s;

		//private case when s="ab" --> return "a"
		if(s.length() == 2 && s.charAt(0)!= s.charAt(1)) return s.substring(0, 1);

		//private case when s="bb" --> return "bb"
		if(s.length() == 2 && s.charAt(0)== s.charAt(1)) return s;
		
		int length = s.length();
		int center = 1; //center > 0 and < length - 1
		while(center < length){
			
			int left = center - 1;
			int right = center + 1;
			checkPalindrome(s, left, right);

			//private case when bb in the string "abbc"
			//to check this possibility
			int l = center - 1;
			int r = center;
			checkPalindrome(s, l, r);

			center++;
		}

		//private case when s="abcda" --> return "a"
		if(s.charAt(0)== s.charAt(s.length() - 1) && palindrom.length() == 0) return s.substring(0, 1);

        return palindrom;
    }

	public static void checkPalindrome(String s, int left, int right){
		
		if(left >= 0 && right <= s.length() - 1){
			if(s.charAt(left) == s.charAt(right)){
				
				//System.out.println(s.substring(left, right + 1));
				
				//need longest palindrom
				if(s.substring(left, right + 1).length() > palindrom.length()){
					palindrom = s.substring(left, right + 1);
				}
	
				left--;
				right++;

				if(left >= 0 && right <= s.length()){
					checkPalindrome(s, left, right);
				}
			}
		}
	}


	public static void main(String[] args){
		//String s = "akksbcdgfgdcvndddddddd";
		//String s = "aaaa";
		String s = "abcda";
        System.out.println(longestPalindrome(s));
    }
}
