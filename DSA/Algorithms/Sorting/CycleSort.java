package com.company;
import java.util.Arrays;
public class CyclecSort {
    public static void main(String[] args) {
        int [] a = {4, 3, 2, 1, 5, 6};
        cyclic(a);
        System.out.println("Array after sorting",Arrays.toString(a));
    }
    static void cyclic(int [] arr)
    {
        int i = 0;
        while (i < arr.length)
        {
            int correctInd = arr[i] - 1;
            if(arr[i] == arr[correctInd])
            {
                i++;
            }
            else{

                swap(arr, i, correctInd);
            }
        }
    }
    static void swap(int [] a, int i, int j)
    {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
