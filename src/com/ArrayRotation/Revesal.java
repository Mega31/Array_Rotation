package com.ArrayRotation;

public class Revesal {
    //Revesal algrothim
    //
    static void leftRotate(int arr[], int d) {
        int n = arr.length;
        rvereseArray(arr, 0, d - 1);
        rvereseArray(arr, d, n - 1);
        rvereseArray(arr, 0, n - 1);
    }

    /*Function to reverse arr[] from index start to end*/
    static void rvereseArray(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /*UTILITY FUNCTIONS*/
    /* function to print an array */
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }


}
