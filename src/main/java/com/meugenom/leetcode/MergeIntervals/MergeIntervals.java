package com.meugenom.leetcode.MergeIntervals;

public class MergeIntervals {

	private int[][] intervals;
	
	public int[][] merge(int[][] intervals) {
		this.intervals = intervals;
		sort();
		
     	return helper();   
    }

	public int[][] helper(){
		int length = intervals.length;
		int i = 0;
		while(i < length - 1) {
			if(intervals[i][1] >= intervals[i+1][0]){
				
				//rewrite intervals 
				int[][] tmp = new int[length - 1][2];
				int k = 0;
				for (int j = 0; j < length; j++) {
					if(i != j){
						tmp[k] = intervals[j];
						k++;
					}
				}
				int[] m = new int[2];
				m[0] = intervals[i][0];
				m[1] = intervals[i+1][1] > intervals[i][1]?intervals[i+1][1]:intervals[i][1];
				tmp[i] = m;
				intervals = tmp;
				length --;
				i = -1;
			}
		i++;
		}
		return intervals;
	}

	public void sort(){
        int[] temp; 
        for(int i=0; i < intervals.length; i++){
			for(int j=0; j < intervals.length; j++){
                if(intervals[j][0] > intervals[i][0]){
                    temp = intervals[i];
                    intervals[i] = intervals[j];
                    this.intervals[j] = temp;
                }
            }
        }
    }

	@Override
	public String toString() {
		String str = "[";
		for (int i = 0; i < intervals.length; i++) {
			str = str + "[" + intervals[i][0]+"," + intervals[i][1]+"]";
		}
		str = str + "]";
		return str;
	}

	public static void main(String[] args) {
		//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
		//Out: intervals = [[1,6],[8,10],[15,18]]
		int[][] intervals = new int[4][2];
		intervals[0] = new int[]{2,6};
		intervals[1] = new int[]{1,4};
		intervals[2] = new int[]{2,3};
		intervals[3] = new int[]{5,10};

		MergeIntervals mg = new MergeIntervals();
		mg.intervals = intervals;
		mg.sort();
		System.out.println(mg);
		mg.merge(intervals);
		System.out.println(mg);
	}
}
