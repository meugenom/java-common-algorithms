package dev.eugenem.leetcode.BinarySearch;

public class BinarySearch {

    public int search(int[] nums, int target) {

        int mid;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] m = new int[6];
        m[0] = -1;
        m[1] = 0;
        m[2] = 3;
        m[3] = 5;
        m[4] = 9;
        m[5] = 12;

        System.out.println(bs.search(m, 2));
        System.out.println(bs.search(m, -1));
        System.out.println(bs.search(m, 12));
        System.out.println(bs.search(m, 3));

        int[] n = new int[1];
        n[0] = 5;
        System.out.println(bs.search(n, -5));

        int[] b = new int[2];
        b[0] = 2;
        b[1] = 5;
        System.out.println(bs.search(b, 0));
    }
}
