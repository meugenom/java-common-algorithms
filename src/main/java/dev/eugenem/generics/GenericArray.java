package dev.eugenem.generics;

public class GenericArray<T> {

    public final Object[] objectArray;
    public final int length;
    private String output = "";

    public GenericArray(int length) {
        /**
         * instantiate a new Object array of specified length
         */
        objectArray = new Object[length];
        this.length = length;
    }

    public T get(int i) {

        @SuppressWarnings("unchecked")
        T value = (T) objectArray[i];

        return value;
    }

    // set value at obj_array[i]
    public void set(int i, T value) {
        objectArray[i] = value;
    }

    public int getSize() {
        return this.length;
    }

    // need realize methods sort(), pop(), push(), shift(), unshift()
    // add new methods sort() with bubles sorting, quick sorting and others

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

class Main {
    public static void main(String[] args) {

        final int length = 5;
        GenericArray<Integer> result = new GenericArray<>(length);

        for (int i = 0; i < length; i++)
            result.set(i, i * 2);
        System.out.println(result.toString());
        int[] expected = new int[] { 0, 2, 4, 6, 8 };
        assert expected.equals(result) : "Expected array doesn't equal with result array";

        // creating string array
        GenericArray<String> stringArray = new GenericArray<>(length);
        for (int i = 0; i < length; i++) {
            stringArray.set(i, String.valueOf("test " + (char) (i + 97)));
            // System.out.println(stringArray.toString());
        }
    }
}
