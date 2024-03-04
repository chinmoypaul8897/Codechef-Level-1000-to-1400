package codechef1000to1400;

import java.math.BigInteger;
import java.util.Scanner;

public class countingProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            long [] arr = new long[N];
            long sum = 0 ;
            boolean flag = false ;
            for (int j = 0; j < N ; j++) {
                arr[j]=sc.nextLong();
                sum = sum + arr[j];
                if (arr[j] % 2 != 0 ) {
                    flag = true;
                }
            }
            if (sum % 2 == 0 && flag ==true ) System.out.println("YES");   // means the sum cannot be distributed as two odd numbers
            else System.out.println("NO");
        }
    }
}
