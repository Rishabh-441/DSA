/*
Time complexity : O(log(N) + precision) ~ O(log(N))
 */

import java.util.Scanner;

public class SqrtBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(sqroot(n,p));
    }

    static float sqroot(int n,int p){
        int s = 0;
        int e = n;
        float root = 0f;
        while (s < e){
            int m = s + (e-s)/2 ;
            if (m*m == n) return m;
            if (m*m < n) s++;
            else e--;
        }
        float x = 0.1f;
        for (int i = 0; i < p; i++) {
            while(root*root <= n){
                root += x;
            }
            root -= x;
            x/=10;
        }
        return root;
    }
}
