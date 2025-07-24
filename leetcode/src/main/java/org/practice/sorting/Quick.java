package org.practice.sorting;

public class Quick {

    public static void sort(int [] arr, int start , int end)
    {
        if(start >= end)
            return;

        int pivot = arr[start];
        int i=start;
        int j= end;
        int index=start+1;
        int []aux = new int[end-start+1];

        while(index<=end)
        {
            if(arr[index]<=pivot)
            {
                aux[i++ - start]=arr[index++];
            }
            else
            {
                aux[j-- - start]=arr[index++];
            }
        }
        aux[i-start]=pivot;

        for(int n = 0;n<aux.length;n++)
        {
            arr[start+n]=aux[n];
        }

        sort(arr,start,i-1);
        sort(arr,i+1,end);

    }
    public static void main(String[] args) {
        int arr[] = {4, 8, 6, 2, 1, 5};
        sort(arr, 0, arr.length-1);
        System.out.println("Sorted array: ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

    }
}
