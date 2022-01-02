package Recurssions;

import java.util.ArrayList;

public class ReturningAllOcccurences {
    public static void main(String[] args) {
        System.out.println(searchInd(new int[]{1, 2,56, 56, 3, 4, 5, 6, 7, 12, 34, 56, 23}, 56));
        System.out.println(searchInd2(new int[]{1, 2,56, 56, 3, 4, 5, 6, 7, 12, 34, 56, 23}, 56));
    }

    //method 1:
    static ArrayList<Integer> searchInd(int[] arr, int target){
        ArrayList<Integer> list = new ArrayList<>();
        return helper(arr, target, 0, list);
    }

    private static ArrayList<Integer> helper(int[] arr, int target, int i, ArrayList<Integer> list) {
        if (i == arr.length){
            return list;
        }
        if (arr[i] == target){
            list.add(i);
        }
        return helper(arr, target, i+1, list);
    }

    //method 2:
    static ArrayList<Integer> searchInd2(int[] arr, int target){
        return helper2(arr, target, 0);
    }

    private static ArrayList<Integer> helper2(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();

        if (i == arr.length){
            return list;
        }

        if (arr[i] == target){
            list.add(i);
        }

        ArrayList<Integer> listFromBelowCalls = helper2(arr, target, i+1);
        list.addAll(listFromBelowCalls);

        return list;
    }

}
