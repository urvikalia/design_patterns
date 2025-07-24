package org.practice.sorting;

import java.util.Arrays;

public class Hoares {

    public static void swap(int []arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(int []arr, int start , int end)
    {
        if(start >= end) return;

        int pivot = arr[start];
        int smaller = start+1;
        int bigger = end-1;
        while (smaller <= bigger)
        {
            if (arr[smaller] < pivot) {
                smaller++;
            }
            else if (arr[bigger] > pivot) {
                bigger--;
            }
            else {
                swap(arr, smaller, bigger);
                smaller++;
                bigger--;
            }
        }
        swap(arr, start, bigger);

        sort(arr, start , bigger-1);
        sort(arr, bigger+1, end);

    }
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 1, 3, 2};
        sort(arr,0,arr.length);
        System.out.println("Sorted array....");
        System.out.println(Arrays.toString(arr));



    }
}
