package Recurssions;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(zeros(202010, 0));
    }
    static int zeros(int n, int cnt){
        if (n == 0){
            return cnt;
        }
        if (n%10 == 0){
            return zeros(n/10, cnt+1);
        }
        return zeros(n/10, cnt);
    }
}
