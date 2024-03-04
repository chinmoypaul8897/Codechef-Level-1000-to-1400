package codechef1000to1400;

import java.util.Scanner;

public class primeReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            String A = sc.next();
            String B = sc.next();
            int count1inA = 0 ;
            int count1inB = 0 ;
            for (int j = 0; j < N ; j++) {
                if (A.charAt(j)=='1') count1inA++;
            }
            for (int j = 0; j < N ; j++) {
                if (B.charAt(j)=='1') count1inB++;
            }

           if (count1inA==count1inB) System.out.println("YES");
           else System.out.println("NO");
        }
    }
}
