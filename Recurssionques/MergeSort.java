package Recurssions;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12,343,1,3445,13};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] sort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int m = arr.length/2;

        int[] left = sort(Arrays.copyOfRange(arr,0,m));
        int[] right = sort(Arrays.copyOfRange(arr,m,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length+second.length];

        int i=0,j=0,k=0;

        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length){
            mix[k] = first[i];
            k++;
            i++;
        }
        while (j < second.length){
            mix[k] = second[j];
            k++;
            j++;
        }
        return mix;
    }
}
