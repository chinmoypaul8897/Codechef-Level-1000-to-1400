package codechef1000to1400;

import java.util.Scanner;

public class farAway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
           int N = sc.nextInt();   // the length of array A
           int M = sc.nextInt();   // the limit on the elements of A and B
            int [] A = new int[N];
            int [] B = new int[N];
            for (int j = 0; j < N ; j++) {
                A[j]=sc.nextInt();
                if (A[j] <= M/2 ) B[j]=M;
                else B[j]=1;
            }
            long sum = 0 ;
            for (int j = 0; j < N ; j++) {
                sum= sum + Math.abs(A[j]-B[j]);
            }
            System.out.println(sum);

        }
    }
}
