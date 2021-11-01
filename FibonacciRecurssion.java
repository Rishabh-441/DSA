public class FibonacciRecurssion {
    public static void main(String[] args) {
        System.out.println(fab(1));
        System.out.println(fab(-2));
        System.out.println(fab(3));
        System.out.println((fab(4)));
    }
    public static int fab(int n){
        if (n < 1) return -1;
        if (n == 1 || n == 2) return n-1;
        return fab(n-1) + fab(n-2);
    }
}
