package com.company;

public class Binarysearch {
    public static void main(String [] args)
    {
        int [] a = {1, 2, 3, 4, 5};
        int target = 1;
        System.out.println(binarysearch(a, target));
    }
    static int binarysearch(int [] a, int t)
    {
        int start = 0;
        int end = a.length - 1;
        while (start <= end)
        {
            int mid = start +(end-start)/2;
            if(t == a[mid])
            {
                return mid;
            }
            else if(t > a[mid])
            {
                start = mid+1;
            }
            else{
                end =mid-1;
            }
        }
        return -1;

    }
}
