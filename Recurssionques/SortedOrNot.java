package Recurssions;

public class SortedOrNot {
    public static void main(String[] args) {
        System.out.println(sortedOrNot(new int[]{1, 2, 3, 4, 56, 6}));
    }
    static boolean sortedOrNot(int[] arr){
        return helper(arr,0);
    }

    private static boolean helper(int[] arr, int s) {
        if (s == arr.length-1){
            return true;
        }
        return arr[s] > arr[s+1] && helper(arr, s+1);
    }

}
