package Recurssionques;

import java.util.Scanner;

public class RemoveAChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(removeA(sc.next()));
    }
    static String removeA(String s){
        if (s == null || s.length() == 0) return s;
        if (s.charAt(0) == 'a' || s.charAt(0) == 'A'){
            return  removeA(s.substring(1));
        }
        return s.charAt(0) + removeA(s.substring(1));
    }
}
