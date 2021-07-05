package com.sam.dynamicprogramming;

import java.util.ArrayList;

/*
Given a non-negative number represented as a list of digits, add 1 to the number (increment the number
represented by the digits). The digits are stored such that the most significant digit is first element of array.
*/

public class PlusOne {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(9);
        arr.add(9);
        System.out.println(increment(arr,3));
    }

    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        boolean carry = true;
        ArrayList<Integer> out = new ArrayList<>(arr);
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = N-1; i >= 0; i--) {
            if(arr.get(i) == 9 && carry) {
                out.set(i, 0);
                carry = true;
            } else {
                if (carry) {
                    out.set(i, arr.get(i) + 1);
                    carry = false;
                }
            }
        }
        if (carry) {
            result.add(1);
            result.addAll(out);
            return result;
        } else {
            return out;
        }

    }
}
