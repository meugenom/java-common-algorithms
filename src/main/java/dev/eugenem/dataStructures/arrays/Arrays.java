package dev.eugenem.dataStructures.arrays;

public class Arrays {

    public int[] arr;

    /**
     * push new value in the end to the array
     * @param value
     */
    public void push(int val){
        int[] tmp = new int[this.arr.length + 1];
        for(int i = 0; i < this.arr.length; i++) {
            tmp[i] = this.arr[i];
        }
        tmp[tmp.length - 1] = val;
        this.arr = tmp;
    }

    /**
     * pop - remove last value
     */
    public void pop(){
        int[] tmp = new int[this.arr.length - 1];
        for(int i = 0; i < tmp.length; i++) {
            tmp[i] = this.arr[i];
        }        
        this.arr = tmp;
    }

    /**
     * @return array's size
     */
    public int size(){
        if(arr == null)
            return 0;

        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }
    
    /**
     * find minimum in the array
     * @return min value in the array
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
     * @param index
     */
    public void remove (int index) {
        if (this.arr == null || this.arr.length == 0) {
            throw new IllegalArgumentException("Array doesn't exist");
        }

        if (index >= this.arr.length) {
            throw new IllegalArgumentException("Index doesn't exist");
        }

        int[] tmp = new int[this.arr.length -1];
        int j = 0;
        for(int i = 0; i < this.arr.length; i++) {
            if(i != index) {
                tmp[j] = this.arr[i];
                j++;
            }
        }
        this.arr = tmp;
    }

    /**
     * reverse current array without params
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
     * @param start - begin index of array - by default = (0)
     * @param end - end index of array - by default = (this.arr.length - 1)
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

    public void autoFill() {
        this.arr = new int[]{1, 3, 6, 8, 2, 4, 7};
    }

    

    @Override
    public String toString() {
        String out = "arr = [ ";
        int n = this.arr.length;
            for (int i = 0; i < n; i++) {
                if(i == n - 1) {
                    out = out + arr[i] + "]";
                } else {
                    out = out + arr[i] + ", ";
                }
            }
        return  out;
    }

    public static void main(String[] args) {
        Arrays arr = new Arrays();
        arr.autoFill();
        System.out.println(arr.toString());
        arr.remove(2);
        System.out.println(arr.toString());
        arr.push(11);
        System.out.println(arr.toString());
        arr.reverse();
        System.out.println(arr.toString());
        System.out.println("min  = " + arr.findMin());
        System.out.println("size  = " + arr.size());
        arr.pop();
        System.out.println(arr.toString());

    }
}
