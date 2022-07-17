package com.meugenom.leetcode.AddBinary;

public class AddBinary {
	
	public static String addBinary(String a, String b) {
        
		int i = a.length()-1;
        int j = b.length()-1;
        
		int sign = 0;        
    
		StringBuilder result = new StringBuilder();
        
        while(i >=0 || j >= 0 ){

            char a1 = i >= 0 ? a.charAt(i) : '0';
            char b1 = j >= 0 ? b.charAt(j) : '0';
            
            if(sign == 0){

                if(a1 == '0' && b1 == '0'){
                    
					result.append("0");
                    sign = 0;
                
				} else if(a1 == '1' && b1 == '1'){

                    result.append("0");
                    sign = 1;
                
				} else {
                
					result.append("1");
                    sign = 0;
                
				}
            } else {
                
				if(a1 == '0' && b1 == '0'){
                    
					result.append("1");
                    
					sign = 0;
                
				} else if(a1 == '1' && b1 == '1'){
                    
					result.append("1");
                    
					sign = 1;
                
				} else {
                    
					result.append("0");
                    
					sign = 1;
                }                
            }
			i--;
			j--;
        }
        
        if(sign == 1)

            result.append("1");
        
        return result.reverse().toString();
    }

	public static void main(String[] args) {
		String a = "11", b = "1";
		System.out.println(addBinary(a, b)); // out "100"
	}
}
