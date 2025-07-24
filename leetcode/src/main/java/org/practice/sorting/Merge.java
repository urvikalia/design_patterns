package org.practice.sorting;


/*
Merge sort is based on strategy divide and conquer
YOu divide the input into two parts , solve the divided problem and merge the two solved problems together
Make sure to add leaf node condition

 */
public class Merge {

    public static void sort(int [] arr,int start , int end)
    {
        if(start==end)
            return;
        int mid = (start + end) / 2;
        sort(arr,start,mid);
        sort(arr, mid + 1, end);

        int i = start;
        int j = mid + 1;

        int [] aux = new int[end-start+1];
        int index=0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                aux[index] = arr[i];
                i++;
            } else {
                aux[index] = arr[j];
                j++;
            }
            index++;
        }
        while (i <= mid) {
            aux[index++] = arr[i++];
        }
        while (j <= end) {
            aux[index++] = arr[j++];
        }

        for (int n = 0; n < aux.length; n++) {
            arr[start + n] = aux[n];            // Note
        }
        return;
    }
    public static void main(String[] args) {
        int[] arr = {4, 8, 6, 2, 1, 5};
        sort(arr,0, arr.length-1);
        System.out.println("sorted array: ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");



    }
}
