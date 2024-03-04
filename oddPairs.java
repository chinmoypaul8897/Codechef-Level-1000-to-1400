package codechef1000to1400;

import java.util.Scanner;

public class oddPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
              long  N = sc.nextLong();
              long oddsNo = (N+1)/2;
              long evenNo = N / 2 ;
              long ans = 2* oddsNo*evenNo;
            System.out.println(ans);
        }
    }
}
