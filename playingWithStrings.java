package codechef1000to1400;

import java.util.Scanner;

public class playingWithStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   // length of String S and R
            String S = sc.next();
            String R = sc.next();
            int countOneS = 0 ;
            int countOneR = 0 ;
            for (int j = 0; j < N ; j++) {
                if (S.charAt(j)=='1') countOneS++;
                if (R.charAt(j)=='1') countOneR++;
            }
            if (countOneS==countOneR) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
