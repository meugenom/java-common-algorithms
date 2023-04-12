package generics;

public class GenericArray<T> {

	public Object[] objectArray;
	public int length;
	private String output = "";

	// constructor
	public GenericArray(int length) {
		/**
		 * instantiate a new Object array of specified length
		 */
		objectArray = new Object[length];
		this.length = length;
	}

	/**
	 * @param array of type T
	 * @return the value at obj_array[i]
	 */
	public T get(int i) {
		@SuppressWarnings("unchecked")
		T value = (T) objectArray[i];
		return value;
	}

	/**
	 * @param array of type T
	 * @param i
	 * @param value
	 */
	public void set(int i, T value) {
		objectArray[i] = value;
	}

	/**
	 * @return the size of the array
	 */
	public int getSize() {
		return this.length;
	}

	/**
	 * @return sorted array
	 */
	public void sort() {
		int n = this.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (((Comparable<T>) objectArray[j]).compareTo((T) objectArray[j + 1]) > 0) {
					T temp = (T) objectArray[j];
					objectArray[j] = objectArray[j + 1];
					objectArray[j + 1] = temp;
				}
			}
		}
	}
	
	public T pop() {
		if (this.length == 0) {
			throw new ArrayIndexOutOfBoundsException("Cannot pop from an empty array");
		}
		T popped = (T) objectArray[this.length - 1];
		this.length--;
		return popped;
	}

	public void push(T value) {
		if (this.length == objectArray.length) {
			Object[] newArray = new Object[this.length + 1];
			for (int i = 0; i < this.length; i++) {
				newArray[i] = objectArray[i];
			}
			this.objectArray[this.length] = value;
			this.objectArray = newArray;
		} else {
			this.objectArray[this.length] = value;
		}
		this.length++;
	}

	public T shift() {
		if (this.length == 0) {
			throw new ArrayIndexOutOfBoundsException("Cannot shift from an empty array");
		}
		T shifted = (T) objectArray[0];
		for (int i = 1; i < this.length; i++) {
			objectArray[i - 1] = objectArray[i];
		}
		this.length--;
		return shifted;
	}

	public void unshift(T value) {
		if (this.length == objectArray.length) {
			Object[] newArray = new Object[this.length + 1];
			newArray[0] = value;
			for (int i = 1; i < newArray.length; i++) {
				newArray[i] = objectArray[i - 1];
			}
			this.objectArray = newArray;
		} else {
			for (int i = this.length; i > 0; i--) {
				objectArray[i] = objectArray[i - 1];
			}
			objectArray[0] = value;
		}
		this.length++;
	}

	@Override
	public String toString() {
		output = output + "[";
		for (int i = 0; i < this.length; i++) {
			output = output + objectArray[i];
			if (i != this.length - 1) {
				output = output + ", ";
			}
		}
		output = output + "]";
		return output;
	}
}
