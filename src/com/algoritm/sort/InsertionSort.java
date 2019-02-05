package com.algoritm.sort;

import java.util.Arrays;

public class InsertionSort {

    public String sort(int arrInts[]) {

        for (int i = 1; i < arrInts.length; ++i)
        {
            int tempValue = arrInts[i];
            int j =  i - 1;
            while (j >= 0 && arrInts[j] > tempValue)
            {
                arrInts[j + 1] = arrInts[j];
                j = j - 1;
            }
            arrInts[j + 1] = tempValue;
        }
        return Arrays.toString(arrInts);
    }
}
