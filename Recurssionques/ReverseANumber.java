package Recurssions;

public class ReverseANumber {
    public static int rev2(int n){
        int digits = (int) (Math.log10(n) + 1);
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if (n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem* (int)Math.pow(10, digits-1) + helper(n/10, digits-1);
    }

    public static void main(String[] args) {
        System.out.println(rev(12345));
        System.out.println(rev2(12345));
    }
    static String rev(int n){
        if (n%10 == n){
            return Integer.toString(n);
        }

        return rev(Integer.parseInt(Integer.toString(n).substring(1))) + Integer.toString(n).charAt(0);
    }
}
