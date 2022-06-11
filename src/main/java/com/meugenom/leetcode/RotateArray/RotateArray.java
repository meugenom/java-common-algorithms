package com.meugenom.leetcode.RotateArray;

// 37/38 test cases passed 
// doesn't optimal


public class RotateArray {

    public void rotate(int[] nums, int k) {  
        
        if(nums.length == 2) {
            if ( k % 2 != 0 ) {
                int tmp = nums[0];
                nums[0] = nums[1];
                nums[1] = tmp;
            }
        }
        if(k != 0 && nums.length > 2) {
            nums = turn(nums, k);
        }
    }

    public int[] turn ( int[] nums, int k) {

        int start = 0;
        int end = nums.length - 1;
        int tmp = nums[start];
        int last;
        nums[start] = nums[end]; 
        start++;
        
        while(start < end) {
            if(start == 1) {
                last = nums[start + 1];
                nums[start + 1] = nums[start];
                nums[start] = tmp;
                tmp = last;    
            }            
            if(start + 1 <= end && start != 1) {
                last = nums[start + 1];
                nums[start + 1] = tmp;
                tmp = last;
            }
            start++;
        }

        k--;
        if(k > 0) {
            this.turn(nums, k);
        }
        return nums;
    }


    public static void main(String[] args){

        RotateArray c = new RotateArray();
        int[] nums = new int[]{1,2,3,4,5,6};
        int k = 2;
        c.rotate(nums, k);
        for(int i=0; i < nums.length; i++){
            System.out.println("num["+i+"]= "+nums[i]);
        }


    }   
    
}
