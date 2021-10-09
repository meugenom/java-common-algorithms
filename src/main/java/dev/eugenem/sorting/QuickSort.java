package dev.eugenem.sorting;

public class QuickSort {

	public void sort(int[] elements, int left, int right) {

		int i = left, j = right;

		int pivot = elements[(left + right) / 2];

		while (i <= j) {
			while (elements[i] < pivot) {
				i++;
			}

			while (elements[j] > pivot) {
				j--;
			}

			if (i <= j) {

				// Swap
				int tmp = elements[i];
				elements[i] = elements[j];
				elements[j] = tmp;

				i++;
				j--;

			}
		}

		// Recursive calls
		if (left < j) {
			sort(elements, left, j);
		}

		if (i < right) {
			sort(elements, i, right);
		}
	}

	public String display(int[] arr) {
		String out = "[ ";
		int i = 0;
		while (i < arr.length) {
			if (i != arr.length - 1) {
				out += arr[i] + ", ";
			} else {
				out += arr[i] + "]";
			}
			i++;
		}
		return out;
	}
}
