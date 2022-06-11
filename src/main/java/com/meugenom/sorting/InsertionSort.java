package com.meugenom.sorting;

public class InsertionSort {

	public void insertionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int a = 0;

			while (a <= i) {

				if (arr[a] > arr[i]) {
					int tmp = arr[i];
					arr[i] = arr[a];
					arr[a] = tmp;
				}
				a++;
			}
		}
	}

	public String print(int[] arr) {
		String out = "[ ";

		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) {
				out += arr[i] + ", ";
			} else {
				out += arr[i] + "]";
			}
		}
		return out;
	}
}
