package com.skillup.classes.sorting_char;

import java.util.Arrays;

public class SortingChar {
    public static void main(String[] args) {
        char[] arr = {'d', 'w', 'g', 'e', 'a', 'h', 'r', 's', 'q', 'b', 'y'};

        bubbleSorting(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static char[] bubbleSorting(char[] a) {

        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            char bufChar;
            for (int i = 0; i < a.length-1 ; i++) {
                if (a[i] > a[i + 1]) {
                    isSorted = false;
                    bufChar = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = bufChar;
                }
            }
        }
        return a;
    }
}
