package Substrings_Subsets;

import java.util.ArrayList;
import java.util.List;

public class SubsetArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        List<List<Integer>> ans = subset(arr);
//        for (var x:ans) {
//            System.out.println(x);
//        }
        System.out.println(subset(arr));

        System.out.println(subsetDuplicate(new int[]{1,2,2}));
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (var num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++){
                List<Integer> internal= new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetDuplicate(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for (int i= 0; i < arr.length; i++){
            start = 0;
            if (i > 0 && arr[i] == arr[i-1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();

            for (int j = start; j < n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
