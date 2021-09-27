package dev.eugenem.leetcode.PalindromeNumber;

public class PalindromeNumber {

    int [] arr;

    public boolean isPalindrome(int x) {

        if (x < -2147483647 || x > 2147483647) {
            return false;
        }else{

            if(x == 0)
                return true;
            if(x < 0){
                return false;
            }
            if(String.valueOf(x).length()==1){
                return true;
            }

                int [] arr = new int [String.valueOf(x).length()];
                int i = 0;

                while( x > 0){
                    int symbol = x % 10;
                    arr[i] = symbol;
                    //next digit
                    x = x / 10;
                    i++;
                }

                this.arr = arr;
                this.helper();

                if(this.arr.length == 0){
                    return true;
                }else if(this.arr.length == 1){
                    return true;
                }
        }

        return false;
    }


    public void helper() {
            int[] a  = this.arr;
        
            if(a[0] == a[a.length - 1]) {
                int [] tmp = new int [a.length - 2];
                int j=0;
                for(int i = 0; i < a.length; i++) {
                    if(i!=0 && i!=a.length - 1) {
                        tmp[j] = a[i];
                        j++;
                    }
                }
                //System.out.println("a[0] == a[a.length]  " + a[0] +" == " + a[a.length-1]);

                if(tmp.length > 1) {
                    this.arr = tmp;
                    this.helper();
                } else {
                    this.arr = tmp;
                }
            }
    }

    public static void main(String[] args) {

        PalindromeNumber r = new PalindromeNumber();
        int calculated = -101;

        System.out.println(r.isPalindrome(calculated));
    }
}
