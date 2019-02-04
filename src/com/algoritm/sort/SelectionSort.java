package com.algoritm.sort;

import java.util.Arrays;

public class SelectionSort {

    public String sort(int[] arrInts) {

        for(int i = 0; i < arrInts.length - 1; i++) {
            int minItem = i;
            for(int j = i +1; j < arrInts.length; j++) {
                if(arrInts[j] < arrInts[minItem]) {
                    minItem = j;
                }
            }
            int temp = arrInts[i];
            arrInts[i] = arrInts[minItem];
            arrInts[minItem] = temp;
        }
        return Arrays.toString(arrInts);
    }
}
