import java.util.Scanner;

public class NewtonRaphsonMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println(sqrt(n));
    }

    static double sqrt(double n){
        double root;
        double x = n;
        while (true){
            root = 0.5 * (x + (n/x));

            if (Math.abs(root - x) < 0.5){
                break;
            }

            x = root;
        }
        return root;
    }
}
