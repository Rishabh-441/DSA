public class RecurssionSumDigits {
    public static void main(String[] args) {
        System.out.println(add(250023));
    }
    public static int add(int n){
        if (n < 0) return -1;
        if (n == 0) return 0;
        return n%10 + add(n/10);
    }
}
