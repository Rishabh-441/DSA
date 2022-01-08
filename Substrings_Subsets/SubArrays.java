package Substrings_Subsets;

import java.util.ArrayList;

public class SubArrays {
    public static void main(String[] args) {
        subSeqAscii("", "Rishabh");
        System.out.println(subSeqAsciiArr("", "Risahbhd"));
    }
    static void subSeqAscii(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeqAscii(p, up.substring(1));
        subSeqAscii(p + ch, up.substring(1));
        subSeqAscii(p + (ch + 0), up.substring(1));
    }
    static ArrayList<String > subSeqAsciiArr(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subSeqAsciiArr(p, up.substring(1));
        ArrayList<String> second = subSeqAsciiArr(p + (ch+0), up.substring(1));
        ArrayList<String> third = subSeqAsciiArr(p + ch, up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
    }
}
