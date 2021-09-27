package dev.eugenem.leetcode.HappyNumber;

public class HappyNumber {

    private int number = 0;

    public boolean isHappy(int n) {

        if(n == 1)
            return true;

        if (n < 0 || n > 2147483647)
            return false;

        if(n == 0)
            return false;

        this.helper(n);

        if(this.number == 1)
            return true;

        return false;
    }

    public void helper(int num) {
        int sum = 0;
        while(num > 0) {
            sum = sum + (num % 10)*(num % 10);

            //next digit
            num = num / 10;
        }

        if(String.valueOf(sum).length() == 1 && !numCheker(sum)){        
            //System.out.println("num= " + sum);
            this.number = sum;
        }else{
            this.helper(sum);
        }
    }

    //checks natural number
    public boolean numCheker(int num){
        for (int i = 2; i < num; i++){
            if ( num % i == 0) return false; 
         }
         return (num > 1);
    }

    public static void main(String[] args){
        HappyNumber h = new HappyNumber();
        int n = 19;
        System.out.println(h.isHappy(n));
    }
}
