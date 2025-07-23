package org.practice.sorting;

import java.util.Arrays;

/*
Bubble sort
core logic is to compare adjacent and swap if need be.
After each iteration the biggest element get bubbled at the end
Possible Optimizations:
1. Can reduce the second loop termination condition further by i. reducing the comparison by shrinking the range
2. Check if the array is already sorted, using a boolean
 */
public class Bubble {



    public static void sort(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)  // basic logic compare adjacent
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={64, 34, 25, 12, 22, 11, 90};
        sort(arr);
    }
}
