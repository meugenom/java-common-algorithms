package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class AVeryBigSum {
    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {

        long sum = 0;

        for(int i=0; i < ar.size(); i++){
            sum = sum + ar.get(i);
        }

        return sum;
    }

    public static void main(String[] args){

        List<Long> l = new ArrayList<Long>();
        l.add((long) 1000000001);
        l.add((long) 1000000002);
        l.add((long) 1000000003);
        l.add((long) 1000000004);
        l.add((long) 1000000005);

        System.out.println(aVeryBigSum(l));
    }
}
