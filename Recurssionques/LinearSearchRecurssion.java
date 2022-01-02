package Recurssions;

public class LinearSearchRecurssion {
    public static void main(String[] args) {

    }
    static int searchInd(int[] arr, int target){
        return helperInd(arr, target, 0);
    }

    private static int helperInd(int[] arr, int target, int i) {
        if (i == arr.length){
            return -1;
        }
        if (arr[i] == target){
            return i;
        }
        return helperInd(arr, target, i+1);
    }

    static boolean search(int[] arr, int target){
        return helper(arr, target, 0);
    }

    private static boolean helper(int[] arr, int target, int i) {
        if (i == arr.length){
            return false;
        }

        return arr[i] == target || helper(arr, target, i+1);
    }
}
