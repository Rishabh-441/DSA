public class RecurssionCheckPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("helleh"));
    }
    public static boolean checkPalindrome(String s){
        if (s.length() == 0 || s.length() == 1) return true;
        if (s.charAt(0) == s.charAt(s.length()-1))
            return checkPalindrome(s.substring(1,s.length()-1));
        return false;
    }
}
