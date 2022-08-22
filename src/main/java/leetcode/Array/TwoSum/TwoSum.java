package leetcode.Array.TwoSum;

/***
 * 
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * 
 * T.C.: O(n^2)
 * S.C.: O(n)
 */

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