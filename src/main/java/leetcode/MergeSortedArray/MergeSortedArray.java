package leetcode.MergeSortedArray;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m == 0 && nums1.length == 1){
            nums1[0] = nums2[0];
         }

        int lengthA = nums1.length;
        int lengthB = nums2.length;
        int a = 0;
        int b = 0;

        while(a < lengthA) {
            if(nums1[a] == 0 && b < lengthB){
                nums1[a] = nums2[b];
                b++;
            }
            a++;
        }

        this.sort(nums1);
    }
    
    public int[] sort(int[] arr) {

        int temp;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++){
                if(arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        MergeSortedArray d = new MergeSortedArray();
        int[] nums1 = new int[]{1,0};
        int[] nums2 = new int[]{2};
        int m = 1;
        int n = 1;
        d.merge(nums1, m, nums2, n);
    }
}