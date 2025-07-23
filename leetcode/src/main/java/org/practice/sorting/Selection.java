package org.practice.sorting;

import java.util.Arrays;

/*
    As the Name suggest it is selection sort.
    Concept: Find minimum element, swap with first position, repeat for remaining array.
    Its unstable

 */
public class Selection {

    public static void sort(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int minIndex= i;        // preserve the index
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;         // if find another min , mark it as min
                }
            }

            //swap
            int temp =arr[minIndex];        // swap min and ith position
            arr[minIndex]=arr[i];
            arr[i]=temp;

        }
        System.out.println("Sorted array is as below:");
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {4,8,6,2,1,5};
        System.out.println(Arrays.toString(arr));
        sort(arr);

    }
}
