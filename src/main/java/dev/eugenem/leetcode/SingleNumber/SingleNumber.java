package dev.eugenem.leetcode.SingleNumber;

public class SingleNumber {

    public int singleNumber(int[] nums) {
            
        if(nums.length == 0)
            return 0;

        if(nums.length == 1)
        return nums[0];

        boolean count = false;
        int i = 0;
        int j = 0;
        int currentNumber = nums[0];

        while(i < nums.length) {

            if(currentNumber == nums[i] && i != j) {
                count = true;
            }

            if(i == nums.length - 1 && count == false)
                break;

            if(i == nums.length - 1 && count == true) {
                i = 0;
                j++;
                currentNumber = nums[j];
                count = false;
            } else {
                i++;
            }
        }

        return currentNumber;
    }


    public static void main(String[] args) {

        int[] a = new int[3];
        a[0] = 2;
        a[1] = 2;
        a[2] = 1;
        SingleNumber s = new SingleNumber();
        System.out.println("Single Number is " + s.singleNumber(a));

        a = new int[5];
        a[0] = 4;
        a[1] = 1;
        a[2] = 2;
        a[3] = 1;
        a[4] = 2;
        System.out.println("Single Number is " + s.singleNumber(a));

        a = new int[1];
        a[0] = 1;
        System.out.println("Single Number is " + s.singleNumber(a));
        
        a = new int[5];
        a[0] = 1;
        a[1] = 3;
        a[2] = 1;
        a[3] = -1;
        a[4] = 3;
        System.out.println("Single Number is " + s.singleNumber(a));
    }
}