public class RecurssionGCD {
    public static void main(String[] args) {
        System.out.println(GCD(2,12));
    }
    public static int GCD(int a, int b){
        if ( a < 0 || b < 0) return -1;
        if (b == 0) return a;
        return GCD(b,a%b);
    }
}
