package com.meugenom.leetcode.TwoSum;

public class TwoSum {    

    public int sum;
    public int[] result;

    public int[] twoSum(int[] nums, int target) {

        outerloop:
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {

                if(j > i && i != j) {
                    sum =  nums[i] + nums[j];
                }

                if(nums[i]==0 && nums[j]==0){
                    sum =  nums[i] + nums[j];
                }


                if(sum == target && i!=j){

                    result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    break outerloop;
                }
            }
        }

        return result;
    }



    public static void main(String[] args){
        TwoSum s = new TwoSum();
        int[] nums = new int[5];
        nums[0] = (1);
        nums[1] = (2);
        nums[2] = (4);
        nums[3] = (7);
        nums[4] = (12);        
                    
        int[] res = s.twoSum(nums, 11);

        for(int i = 0; i < res.length; i++) {
            System.out.println("res = " + res[i]);
        }
    }
}