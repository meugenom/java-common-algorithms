package codewars;
/***
 * Implement a pseudo-encryption algorithm which given a string S and an integer N concatenates all the odd-indexed 
 * characters of S with all the even-indexed characters of S, this process should be repeated N times.
 * 
 * Examples:
 * 
 * encrypt("012345", 1)  =>  "135024"
 * encrypt("012345", 2)  =>  "135024"  ->  "304152"
 * encrypt("012345", 3)  =>  "135024"  ->  "304152"  ->  "012345"
 * 
 * encrypt("01234", 1)  =>  "13024"
 * encrypt("01234", 2)  =>  "13024"  ->  "32104"
 * encrypt("01234", 3)  =>  "13024"  ->  "32104"  ->  "20314"
 * Together with the encryption function, you should also implement a decryption function which reverses the process.
 * 
 * If the string S is an empty value or the integer N is not positive, return the first argument without changes.
 */



public class SimpleEncryption {

	public static String encrypt(final String text, final int n) {

		if(n == 0 && text == null) return null;
    	if(n <= 0 && text.length() == 0) return "";
    	if(n <= 0) return text;

		int step = 0;
		String encryptedString = "";
		String str = text;

		if(n <= 0) return text;

		while(step < n){

			int length = text.length();
			int current_position = 1;
			int start_substr = 0;
			String head = "";
			String tail = "";
			
			while (current_position < length) {
			
				//System.out.println(text.charAt(current_position));

				//the encrypted symbol
				head = head + str.charAt(current_position);
				
				//unchanged part of the string
				tail = tail + str.substring(start_substr, current_position);
				
				//move position for new unchanged part
				start_substr = current_position + 1;

				//new step
				current_position = current_position + 1;
				current_position++;
	
			}

			//System.out.println("start_substr = " + start_substr);
			//System.out.println("length = " + length);

			if(start_substr + 1 == length) tail = tail + str.charAt(start_substr);
			//System.out.println("Head : " + head);
			//System.out.println("Tail : " + tail);

			encryptedString = head + tail;

			//new str for next encryption
			str = encryptedString;

			step ++;
		}

		return encryptedString;
	}
	
	public static String decrypt(final String encryptedText, final int n) {
		
		//private falls
		if(n == 0 && encryptedText == null) return null;
    	if(n <= 0 && encryptedText.length() == 0) return "";
    	if(n <= 0) return encryptedText;

		int step = 0;
		String decryptedString = "";
		String str = encryptedText;

		if(n <= 0) return encryptedText;

		while(step < n){

			int length = encryptedText.length();
			int current_position = 0;
			String head = "";
			String tail = "";

			int center = length/2;
			//System.out.println(center);

			head = str.substring(0, center);
			tail = str.substring(center, length);
			
			System.out.println("Head : " + head);
			System.out.println("Tail : " + tail);
			
			while (current_position < head.length()) {
			
				//System.out.println(head.charAt(current_position));

				decryptedString = decryptedString + tail.charAt(current_position);
				decryptedString = decryptedString + head.charAt(current_position);
				
				//new step
				current_position++;
	
			}
			
			if(head.length() < tail.length()) decryptedString = decryptedString + tail.charAt(tail.length() - 1);

			//new str for next encryption
			str = decryptedString;
			decryptedString = "";

			step ++;
		}

		return str;
	}

	public static void main(String[] args){
        //System.out.println("");
		final String text = "s eT ashi tist!";
		final int count = 2;
		System.out.println(decrypt(text, count));
		
    }
}
