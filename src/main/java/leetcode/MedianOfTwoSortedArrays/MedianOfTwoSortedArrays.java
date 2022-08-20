package leetcode.MedianOfTwoSortedArrays;

public class MedianOfTwoSortedArrays {

    public int min;
    public double median;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] arr = this.merge(nums1, nums2);
        arr = this.sort(arr);        
        double right = Math.round((double) arr.length/2);
        double left = Math.floor((double)arr.length/2);

        if(Double.compare(left, right) == 0) {
            return Double.sum(arr[(int)left - 1], arr[arr.length - (int)right])/2.0;
        } else {
            return arr[(int) left];
        }
    }

    public int[] sort ( int[] arr) {
        int temp;
        min = arr[0];

        for(int i=0; i < arr.length; i++) {

            for(int j=0; j < arr.length; j++) {

                if( arr[j] > arr[i] ) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public int[] merge ( int[] m, int[] n) {
        int[] result = new int[m.length + n.length];

        for(int i = 0; i < m.length; i++) {
            result[i] = m[i];
        }

        for(int j = 0; j < n.length; j++){
            result[j + m.length] = n[j];
        }

        return result;
    }


    public static void main(String[] args){
        int[] n = new int[2];
        n[0] = 1;
        n[0] = 3;

        int[] m = new int[1];
        m[0] = 2;
        
        MedianOfTwoSortedArrays o = new MedianOfTwoSortedArrays();
        System.out.println(o.findMedianSortedArrays(n, m)); // {0,1,2,3,4,5,6,9,10}
    }
}
