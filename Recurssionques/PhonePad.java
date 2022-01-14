package Recurssionques;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        phoneString("129");
        System.out.println(phoneStringArray("129"));
        System.out.println(phoneStringArrayCount("129"));
    }

    private static int phoneStringArrayCount(String s) {
        return helperCount("", s);
    }

    private static int helperCount(String p, String up) {
        if (up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';

        for (int i = 3*(digit - 1); i < 3*digit ; i++) {
            if (i > 25) {
                break;
            }
            count += helperCount(p + (char)('a' + i), up.substring(1));
        }

        return count;
    }

    private static ArrayList<String> phoneStringArray(String s) {
        return helperArray("", s);
    }

    private static ArrayList<String> helperArray(String p, String up) {
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> arr = new ArrayList<>();

        int digit = up.charAt(0) - '0';

        for (int i = 3*(digit - 1); i < 3*digit ; i++) {
            if (i > 25) {
                break;
            }
            ArrayList<String> call = helperArray(p + (char)('a' + i), up.substring(1));
            arr.addAll(call);
        }

        return arr;
    }

    private static void phoneString(String s) {
        helper("", s);
    }

    private static void helper(String p, String up) {
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';   //this will convert '2' into 2

        for (int i = 3*(digit - 1); i < 3*digit ; i++) {
            if (i > 25) {
                break;
            }
            helper(p + (char)('a' + i), up.substring(1));
        }
    }


}
