package sorting;

public class MergeSort {
	
	/**
	 * mergesort current array
	 * @param arr
	 */
	public void mergeSort(int[] arr) {

		int length = arr.length;

		if (length < 2) {
			return;
		}

		int middle = length / 2;
		int[] leftArr = new int[middle];
		int[] rightArr = new int[length - middle];

		// autofill leftArr with left part of the arr
		for (int i = 0; i < middle; i++) {
			leftArr[i] = arr[i];
		}

		// autofill rightArr with right part of the arr
		for (int i = middle; i < length; i++) {
			rightArr[i - middle] = arr[i];
		}

		// recursion
		mergeSort(leftArr);
		mergeSort(rightArr);

		// merge parts
		merge(arr, leftArr, rightArr);
	}

	/**
	 * merge values with arr from left and right parts
	 * @param arr
	 * @param leftArr
	 * @param rightArr
	 */
	public void merge(int[] arr, int[] leftArr, int[] rightArr) {

		int leftIndex = leftArr.length;
		int rightIndex = rightArr.length;

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < leftIndex && j < rightIndex) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}

		for (int a = i; a < leftIndex; a++) {
			arr[k] = leftArr[i];
			k++;
			i++;
		}

		for (int a = j; a < rightIndex; a++) {
			arr[k] = rightArr[j];
			k++;
			j++;
		}
	}

	public String display(int[] arr) {
		String out = "[ ";
		for (int i = 0; i < arr.length; i++) {
			if(i != arr.length - 1){
				out += arr[i] + ", ";
			} else {
				out += arr[i] + "]";
			}
		}
		return out;
		
	}
}
