public class RecurssionPowerOfN {
    public static void main(String[] args) {
        System.out.println(power(2,-2));
    }
    public static double power(double x, int y){
        if (y < 0) {
            x = 1/x;
            y *= -1;
        }
        if (y == 0){
            return 1;
        }
        return x * power(x,y-1);
    }
}
