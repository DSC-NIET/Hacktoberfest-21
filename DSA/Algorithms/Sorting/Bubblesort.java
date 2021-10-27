package com.company;
import java.util.Arrays;
public class Bubblesort {
    public static void main(String[] args){
        int [] a = {7, 2, 3, 4, 5};
        bubble(a);
        System.out.println("The sorted array is "+ Arrays.toString(a));
    }
    static void bubble(int[] arr)
    {
        boolean swap=true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1])
                {
                    swap = false;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            if(swap){
                break;
            }
        }
    }
}
