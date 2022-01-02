package Recurssions;

public class ProdOfDigits {
    public static void main(String[] args) {
        System.out.println(pod(1205));
        System.out.println(pod(1234));
    }
    static int pod(int n){
        if (n%10 == n){
            return n;
        }
        return n%10 * pod(n/10);
    }
}
