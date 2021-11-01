public class RecurssionDecToBin {
    public static void main(String[] args) {
        System.out.println(decToBin(13));
    }
    public static int decToBin(int n){
        if (n < 0){
            return -1;
        }
        if (n == 0) return 0;
        return n%2 + 10*decToBin(n/2);
    }
}
