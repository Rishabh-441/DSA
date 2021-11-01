//PROGRAM TO PRINT PRIME NUMBERS:
/*
TIME COMPLEXITY:

N/2 + N/3 + N/4 + N/5 + ... = N * (1/2 + 1/3 + 1/4 + 1/5 + ...)

time COMPLEXITY: N log(logN)

 */
public class SieveOfEratosthenes {
    boolean[] arr;
    int n;
    SieveOfEratosthenes(int n){
        arr = new boolean[n];
        this.n = n;
    }

    public void primes(){
        int c = 2;
        while(c*c <= n){
            for(int i = 2*c; i< n; i += c){
                if(!arr[i]) arr[i] = true;
            }
            c++;
        }
        for (int i = 2; i < n; i++) {
            if(arr[i] == false) System.out.print(i+"  ");
        }
    }
}
class Op{
    public static void main(String[] args) {
        SieveOfEratosthenes obj = new SieveOfEratosthenes(200);
        obj.primes();
    }
}
