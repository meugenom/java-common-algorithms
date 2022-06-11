package com.meugenom.sorting;

import java.util.Arrays;

public class BubleSort<T> {

	public Object[] unsortedObjectArray;
	public Object[] sortedObjectArray;

	public void set(T arr) {
		this.unsortedObjectArray = (Object[]) arr;
	}

	public T get() {
		if (this.sortedObjectArray != null)
			return (T) sortedObjectArray;

		return null;
	}

	public void sort() {

		T tmp;
		Object[] arr = this.unsortedObjectArray;

		for (int i = 0; i < (Arrays.asList((T[]) arr).size()); i++) {
			for (int j = 0; j < (Arrays.asList((T[]) arr).size()); j++) {

				// System.out.println(Arrays.asList((T[]) arr).get(j));

				T a = Arrays.asList((T[]) arr).get(i);
				T b = Arrays.asList((T[]) arr).get(j);

				if (a instanceof String) {
					if (((String) a).compareTo((String) b) < 0) {
						tmp = (T) arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}

				if (a instanceof Integer) {
					if (((Integer) a).compareTo((Integer) b) < 0) {
						tmp = (T) arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
		}
		this.sortedObjectArray = arr;
	}

	public String display() {
		Object[] arr = this.sortedObjectArray;
		String out = "[ ";
		for (int i = 0; i < arr.length; i++) {
			out += arr[i];
			if (i == arr.length - 1) {
				out += "]";
			} else {
				out += ", ";
			}
		}
		return out;
	}
}