package Recurssions;

public class NTO1 {
    public static void main(String[] args) {
        nto1(8);
        System.out.println("***************************");
        nto1rev(8);
        System.out.println("***************************");
        for (int i = 8; i >0 ; i--) {
            for (int j = 0; j < 8-i; j++) {
                System.out.print(" ");
            }
            bothnto1rev(i);
            System.out.println();
        }
        for (int i = 1; i <=8 ; i++) {
            for (int j = 0; j < 8-i; j++) {
                System.out.print(" ");
            }
            bothnto1rev(i);
            System.out.println();
        }
    }
    static void nto1(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        nto1(n-1);
    }

    static void nto1rev(int n){
        if (n == 0){
            return;
        }
        nto1rev(n-1);
        System.out.println(n);
    }

    static void bothnto1rev(int n){
        if (n == 0){
            return;
        }
        System.out.print(n);
        bothnto1rev(n-1);
        System.out.print(n);
    }
}
