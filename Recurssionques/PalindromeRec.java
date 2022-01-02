package Recurssions;

public class PalindromeRec {
    public static void main(String[] args) {
        System.out.println(check("hello"));
        System.out.println(check("raammaar"));
    }
    static boolean check(String str){
        return str.equals(rev(str));

    }

    private static String rev(String str) {
        if (str.length() == 1){
            return str;
        }
        return str.charAt(str.length()-1) + rev(str.substring(0,str.length()-1));
    }


}
