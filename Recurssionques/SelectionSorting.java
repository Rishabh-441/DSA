package Recurssions;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(Arrays.toString(sort(arr, arr.length, 0,0)));
    }
    static int[] sort(int[] arr, int r, int c, int max){
        if (r == 0){
            return arr;
        }
        if (c < r){
            if (arr[c] > arr[max]){
                return sort(arr, r, c+1, c);
            }
            return sort(arr, r, c+1, max);
        }
        else {
            int x = arr[c-1];
            arr[c-1] = arr[max];
            arr[max] = x;
            return sort(arr, r-1, 0, 0);
        }

    }
}
