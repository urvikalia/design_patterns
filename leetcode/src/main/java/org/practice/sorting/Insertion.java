package org.practice.sorting;

import java.util.Arrays;

public class Insertion {

    public static void sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++) {

            int temp = arr[i];
            int red = i - 1;
            while (red >=0 && arr[red] > temp) {
                arr[red + 1] = arr[red];
                red--;
            }
            arr[red + 1] = temp;
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("Sorted array");
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int[] arr = {4,8,6,2,1,5};
        System.out.println(Arrays.toString(arr));
        sort(arr);
    }
}
