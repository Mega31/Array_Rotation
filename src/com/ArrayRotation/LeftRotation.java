package com.ArrayRotation;

public class LeftRotation {
    /*Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
     * First we are gonna store d numbers of elements in temp
     * then we are going to shift the rest of the array and then store back the d elements back in array
     * */

    void leftRotatebyOne(int arr[], int n) {
        int i, temp;//declaring vars
        temp = arr[0];//storing the original element in temp
        for (i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];//updating arr[i] value
        }

        arr[i] = temp;//now restoring the temp value to last place
    }

    public void leftRotate(int arry[], int d, int n) {
        for (int i = 0; i < d; i++) {
            leftRotatebyOne(arry, n);
        }
    }
}
