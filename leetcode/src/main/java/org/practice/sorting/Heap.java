package org.practice.sorting;

import java.util.Arrays;

public class Heap {

    public static void swap(int []arr, int i ,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void maxHeapify(int[] arr, int i)
    {
        // for every non leaf node check it needs to be heapified
        int leftChildIndex = 2 * i + 1;
        int rightChildIndex = 2 * i + 2;
        int largestIndex = i;
        int heapsize= arr.length;


        if(rightChildIndex < heapsize && arr[rightChildIndex] > arr[largestIndex])
            largestIndex = rightChildIndex;
        if(leftChildIndex < heapsize && arr[leftChildIndex] > arr[largestIndex])
            largestIndex = leftChildIndex;

        if(largestIndex != i) {
            swap(arr, i, largestIndex);
            maxHeapify(arr, largestIndex);
        }


    }
    public static void buildHeap(int[] arr)
    {
        // find first non leaf node
        int firstNonLeaf = arr.length / 2 - 1;
        for(int i = firstNonLeaf; i >= 0; i--)
        {
            maxHeapify(arr, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 6, 1, 9};
        buildHeap(arr);
        System.out.println("After building heap... ");
        System.out.println(Arrays.toString(arr));
    }
}
