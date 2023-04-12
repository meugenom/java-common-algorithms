package dataStructures.arrays;

public class Arrays {

	private int[] arr;

	/**
	 * push new value in the end to the dynamic array
	 * 
	 * @param value
	 * @time complexity O(n)
	 * @space complexity O(n)
	 */
	public void push(int val) {
		int[] tmp = new int[this.arr.length + 1];
		for (int i = 0; i < this.arr.length; i++) {
			tmp[i] = this.arr[i];
		}
		tmp[tmp.length - 1] = val;
		this.arr = tmp;
	}

	/**
	 * pop - remove last value
	 * 
	 * @time complexity O(n)
	 * @space complexity O(n)
	 */
	public void pop() {
		int[] tmp = new int[this.arr.length - 1];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = this.arr[i];
		}
		this.arr = tmp;
	}

	/**
	 * @return array's size
	 * @time complexity O(n)
	 * @space complexity O(1)
	 */
	public int size() {
		if (arr == null)
			return 0;

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
		}
		return count;
	}

	/**
	 * find minimum in the array
	 * 
	 * @return min value in the array
	 * @time complexity O(n)
	 * @space complexity O(1)
	 */
	public int findMin() {
		if (this.arr == null || this.arr.length == 0) {
			throw new IllegalArgumentException("Array doesn't exist");
		}

		int min = this.arr[0];
		for (int i = 1; i < this.arr.length; i++) {
			if (this.arr[i] < min) {
				min = this.arr[i];
			}
		}
		return min;
	}

	/**
	 * remove value by index
	 * 
	 * @param index
	 * @time complexity O(n)
	 * @space complexity O(n)
	 */
	public void remove(int index) {
		if (this.arr == null || this.arr.length == 0) {
			throw new IllegalArgumentException("Array doesn't exist");
		}

		if (index >= this.arr.length) {
			throw new IllegalArgumentException("Index doesn't exist");
		}

		int[] tmp = new int[this.arr.length - 1];
		int j = 0;
		for (int i = 0; i < this.arr.length; i++) {
			if (i != index) {
				tmp[j] = this.arr[i];
				j++;
			}
		}
		this.arr = tmp;
	}

	/**
	 * reverse current array without params
	 * 
	 * @time complexity O(n)
	 * @space complexity O(1)
	 */
	public void reverse() {
		int start = 0;
		int end = this.arr.length - 1;
		while (start < end) {
			int temp = this.arr[start];
			this.arr[start] = this.arr[end];
			this.arr[end] = temp;
			start++;
			end--;
		}
	}

	/**
	 * reverse current array with params
	 * 
	 * @param start - begin index of array - by default = (0)
	 * @param end   - end index of array - by default = (this.arr.length - 1)
	 * @time complexity O(n)
	 * @space complexity O(1)
	 */
	public void reverse(int start, int end) {
		while (start < end) {
			int temp = this.arr[start];
			this.arr[start] = this.arr[end];
			this.arr[end] = temp;
			start++;
			end--;
		}
	}

	/**
	 * sort array
	 * 
	 * @time complexity O(n^2)
	 * @space complexity O(1)
	 */
	public void sort() {
		boolean isSwapped = false;

		for (int i = 0; i < this.arr.length; i++) {
			// Use j=i+1 instead of j=0 in the inner loop to avoid comparing the same
			// element twice.
			for (int j = i + 1; j < this.arr.length; j++) {
				if (this.arr[j] < this.arr[i]) {
					int temp = this.arr[i];
					this.arr[i] = this.arr[j];
					this.arr[j] = temp;
					isSwapped = true;
				}
			}
			if (!isSwapped) {
				break;
			}
		}
	}

	/**
	 * Merges two sorted arrays.
	 *
	 * @param arr1 first sorted array
	 * @param arr2 second sorted array
	 * @return merged array
	 * @time complexity O(n)
	 * @space complexity O(n)
	 */
	public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {

		int[] mergedArr = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				mergedArr[k] = arr1[i];
				i++;
			} else {
				mergedArr[k] = arr2[j];
				j++;
			}
			k++;
		}

		while (i < arr1.length) {
			mergedArr[k] = arr1[i];
			i++;
			k++;
		}

		while (j < arr2.length) {
			mergedArr[k] = arr2[j];
			j++;
			k++;
		}

		return mergedArr;
	}

	/**
	 * Merges two unsorted arrays
	 *
	 * @param arr1 the first unsorted array
	 * @param arr2 the second unsorted array
	 * @return the merged array
	 * @time complexity O(n^2)
	 * @space complexity O(n)
	 */
	public int[] mergeUnsortedArrays(int[] arr1, int[] arr2) {
		int[] mergedArr = new int[arr1.length + arr2.length];
		int i = 0;

		// copy elements from arr1 to mergedArr
		for (int j = 0; j < arr1.length; j++) {
			mergedArr[i] = arr1[j];
			i++;
		}

		// copy elements from arr2 to mergedArr
		for (int j = 0; j < arr2.length; j++) {
			mergedArr[i] = arr2[j];
			i++;
		}

		// sort the merged array using bubble sort
		for (int j = 0; j < mergedArr.length - 1; j++) {
			for (int k = 0; k < mergedArr.length - j - 1; k++) {
				if (mergedArr[k] > mergedArr[k + 1]) {
					int temp = mergedArr[k];
					mergedArr[k] = mergedArr[k + 1];
					mergedArr[k + 1] = temp;
				}
			}
		}

		return mergedArr;
	}

	// prepare array for testing
	public void autoFill() {
		this.arr = new int[] { 1, 3, 6, 8, 2, 4, 7, 11, 25, 63, 32, 0, -4 };
	}

	@Override
	public String toString() {
		String out = "arr = [ ";
		int n = this.arr.length;
		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				out = out + arr[i] + "]";
			} else {
				out = out + arr[i] + ", ";
			}
		}
		return out;
	}

	public void set(int[] newArray) {
		if (newArray == null)
			throw new IllegalArgumentException("Input Array isn't exist");
		this.arr = newArray;
	}

	public int[] get() {
		return this.arr;
	}

}
