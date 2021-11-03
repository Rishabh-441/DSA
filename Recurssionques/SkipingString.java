package Recurssionques;

import java.util.Scanner;

public class SkipingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(skipApple(sc.next()));
    }
    public static String skipApple(String s){
        if (s.length() < 5) return s;
        if (s.substring(0,5).equals("apple")) return "" + skipApple(s.substring(5));
        return s.charAt(0) + skipApple(s.substring(1));
    }
}
