package leetcode.Array.HouseRobber;

public class HouseRobber {

    public int rob(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }

        if(nums.length == 1) {
            return 0;
        }

        int sumEven = 0;
        int sumOdd = 0;
        int index = 1;

        while(index < nums.length) {

            //1,3,5,7...
            sumOdd = sumOdd + nums[index - 1];

            //0,2,4,6...
            sumEven = sumEven + nums[index];

            if(index + 2 < nums.length) {
                index = index + 2;
            }else if(index + 1 < nums.length) {
                sumOdd = sumOdd + nums[index + 1];
                break;
            } else {
                index++;
            }
        }
        return sumOdd > sumEven? sumOdd: sumEven;
    }

    public static void main(String[] args){
        HouseRobber h = new HouseRobber();
        int[] nums1 = new int[]{2,7,9,3,1,0,7,8,12,5,888,999,0,0};
        System.out.println(h.rob(nums1));
    }
}
