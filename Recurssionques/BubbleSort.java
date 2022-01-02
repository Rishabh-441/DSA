package Recurssions;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(Arrays.toString(sort(arr, arr.length-1, 0)));
    }

    private static int[] sort(int[] arr, int r, int c){
        if (r == 0){
            return arr;
        }
        if (c < r){
            if (arr[c] > arr[c+1]) {
                int x = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = x;
            }
            return sort(arr, r, c+1);
        }
        else{
            return sort(arr,r-1, 0);
        }
    }
}
