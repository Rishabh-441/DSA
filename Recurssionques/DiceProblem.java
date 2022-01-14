package Recurssionques;

import java.util.ArrayList;

public class DiceProblem {
    public static void main(String[] args) {
        diceCombination(4);
        System.out.println(diceCombinationArray(4));
    }

    private static ArrayList<String> diceCombinationArray(int n) {
        return helperArray("", n);
    }

    private static ArrayList<String> helperArray(String p, int n) {
        if (n == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 1; i <= 6 && i <=n; i++) {
            arr.addAll(helperArray(p + i, n - i));
        }
        return arr;
    }

    private static void diceCombination(int n) {
        helper("", n);
    }

    private static void helper(String p, int n) {
        if (n == 0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <=n; i++) {
            helper(p + i, n - i);
        }
    }
}
