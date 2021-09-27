package dev.eugenem.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {        

        List<Integer> result = new ArrayList<Integer>();
        int scoreA = 0;
        int scoreB = 0;

        for (int i = 0; i < a.size(); i++) {
            int res = a.get(i) - b.get(i);
            System.out.println("res = " + res);

            if (res > 0) {
                scoreA++;
            } else if (res < 0) {
                scoreB++;
            }
        }

        result.add(scoreA);
        result.add(scoreB);

        return result;
    }

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        a.add(17);
        a.add(28);
        a.add(30);
        b.add(99);
        b.add(16);
        b.add(8);
    }
}
