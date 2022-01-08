package Substrings_Subsets;

import java.util.ArrayList;
import java.util.Arrays;

public class StringPerm {
    public static void main(String[] args) {
//        substrings("", "Rishabh");
        ArrayList<String> arr = subStrArray("", "Rishabh");
        System.out.println(arr);
    }
    static void substrings(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        substrings(p+ch, up.substring(1));
        substrings(p, up.substring(1));
    }

    static ArrayList<String> subStrArray(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> left = new ArrayList<>();
            left.add(p);
            return left;
        }

        char ch = up.charAt(0);
        System.out.println((int)ch);
        ArrayList<String> larr = subStrArray(p+ch, up.substring(1));
        ArrayList<String> rarr = subStrArray(p, up.substring(1));

        larr.addAll(rarr);
        return larr;

    }

}
