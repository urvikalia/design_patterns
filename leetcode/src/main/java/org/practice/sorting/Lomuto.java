package org.practice.sorting;

import java.util.Arrays;

public class Lomuto {

    public static void swap(int arr[],int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sort(int []arr, int start , int end)
    {
        if(start >=end)
            return;

        int pivot = arr[start];
        int smaller =start;

        for(int bigger=start+1; bigger<=end;bigger++)
        {
            if(arr[bigger] <pivot)
            {
                smaller++;
                swap(arr, smaller, bigger);
            }
        }
        swap(arr, smaller, start);

        sort(arr, start, smaller-1);
        sort(arr, smaller+1, end);
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 8, 6, 3};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
