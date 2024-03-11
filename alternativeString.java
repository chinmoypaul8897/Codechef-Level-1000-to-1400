package codechef1000to1400;

import java.util.Scanner;

public class alternativeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   // length of the string
            String S = sc.next();
            int countZero = 0 ;
            int countOne  = 0 ;
            for (int j = 0; j < N  ; j++) {
                if (S.charAt(j)=='1') countOne++;
                else countZero++;
            }
            if (countOne==countZero) System.out.println(N);
            else {
                int min = Math.min(countOne, countZero);
                System.out.println((min*2)+1);
            }

        }
    }
}
