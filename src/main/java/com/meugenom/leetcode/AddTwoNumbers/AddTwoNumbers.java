package com.meugenom.leetcode.AddTwoNumbers;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int[] a, b, c, d;
        a = this.getNumber(l1);
        b = this.getNumber(l2);
        c = this.sum(a, b);
        d = this.reverse(c);
        ListNode result = new ListNode();
        result = null;

        if (this.length(l1) == 0 && this.length(l2) == 0) {
            return l1;
        }
        if (this.length(l1) == 0 && this.length(l2) != 0) {
            return l2;
        }
        if (this.length(l1) != 0 && this.length(l2) == 0) {
            return l1;
        }

        for (int i = 0; i < d.length; i++) {
            ListNode r = new ListNode();
            r.val = d[i];
            r.next = result;
            result = r;
        }

        return result;
    }

    public int[] sum(int[] l1, int[] l2) {
        int tmp;
        int resDigit = 0;
        int k = l1.length >= l2.length ? l1.length : l2.length;
        int[] resultat = new int[k];

        for (int i = 0; i < k; i++) {
            tmp = 0;
            int lastDigit = 0;
            int firstDigit = 0;

            if (l1.length > i) {
                tmp = l1[i];
            }

            if (l2.length > i) {
                tmp = tmp + l2[i];
            }

            tmp = tmp + resDigit;
            resDigit = 0;

            if (tmp < 10) {

                resultat[i] = tmp;
                //System.out.println("tmp: " + tmp);
            } else {
                lastDigit = tmp % 10;

                while (tmp != 0) {
                    firstDigit = tmp % 10;
                    tmp = tmp / 10;
                }

                resultat[i] = lastDigit;
                resDigit = firstDigit;
            }

            if (i == k - 1 && firstDigit > 0) {
                int[] tmpArray = new int[k + 1];
                tmpArray[k] = resDigit;

                for (int j = 0; j < k; j++) {
                    tmpArray[j] = resultat[j];
                }

                resultat = tmpArray;
            }

        }

        return resultat;
    }

    public int[] reverse(int[] arr) {
        int j = 0;
        int[] reversed = new int[arr.length];

        for (int i = (arr.length - 1); i >= 0; i--) {
            reversed[j] = arr[i];
            j++;
        }

        return reversed;
    }

    public int[] getNumber(ListNode l) {
        int i = 1;
        int[] str = new int[this.length(l)];
        str[0] = l.val;

        while (l.next != null) {
            l = l.next;
            str[i] = l.val;
            i++;
        }

        return str;
    }

    public int length(ListNode l) {
        int length = 1;

        if (l.next == null && 0 <= l.val && l.val <= 9) {
            return 1;
        }

        if (l.next == null) {
            return 0;
        }

        while (l.next != null) {
            length++;
            l = l.next;
        }
        
        return length;
    }

    public static void main(String[] args) {

        ListNode a = new ListNode();
        ListNode b = new ListNode();
        ListNode c = new ListNode();

        ListNode d = new ListNode();
        ListNode e = new ListNode();
        ListNode g = new ListNode();

        a.val = 2;
        b.val = 4;
        c.val = 3;

        d.val = 5;
        e.val = 6;
        g.val = 4;

        a.next = b;
        b.next = c;
        c.next = null;

        d.next = e;
        e.next = g;
        g.next = null;

        System.out.println(a);
        System.out.println(d);

        AddTwoNumbers s = new AddTwoNumbers();
        System.out.println(s.addTwoNumbers(a, d));

        ListNode x = new ListNode();
        x.val = 1;

        System.out.println("x-length: " + s.length(x));

        int[] intArray1 = { 9, 9, 9, 9, 9, 9, 9 };
        int[] intArray2 = { 9, 9, 9, 9 };

        int[] f = s.sum(intArray1, intArray2);

        for (int j = 0; j < f.length; j++) {
            System.out.println(f[j]);
        }
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "[next=" + next + ", val=" + val + "]";
    }

}