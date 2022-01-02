package Recurssions;

public class CountSteps {
    public static void main(String[] args) {
        System.out.println(steps(234));
    }
    static int steps(int n){
        return helper(n, 0);
    }

    private static int helper(int n, int cnt) {
        if (n == 0){
            return cnt;
        }
        if (n%2 == 0){
            return helper(n/2, cnt+1);
        }
        return helper(n-1, cnt+1);
    }
}
