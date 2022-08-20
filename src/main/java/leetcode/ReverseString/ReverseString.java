package leetcode.ReverseString;

public class ReverseString {

    public void reverseString(char[] s) {
        int j = s.length - 1;
        int i = 0;
        char tmp;

        while(j >= i) {
            tmp = s[j];
            s[j] = s[i];
            s[i] = tmp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        ReverseString r = new ReverseString();
        char[] str = new char[5];
        str[0] = 'H';
        str[1] = 'e';
        str[2] = 'l';
        str[3] = 'l';
        str[4] = 'o';

        r.reverseString(str);
        System.out.println("reversed string = " + str);
    }
    
}
