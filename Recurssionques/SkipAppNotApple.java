package Recurssionques;

import java.util.Scanner;

public class SkipAppNotApple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(skipAppNotApple(sc.next()));
    }
    static String skipAppNotApple(String s){
        if (s.length() < 3) return s;
        if (s.substring(0,3).equals("app") && !(s.substring(0,5).equals("apple"))) return skipAppNotApple(s.substring(3));
        return s.charAt(0) + skipAppNotApple(s.substring(1));
    }
}
