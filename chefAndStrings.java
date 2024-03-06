package codechef1000to1400;

import java.util.Scanner;

public class chefAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            int [] S = new int[N];
            for (int j = 0; j < N; j++) {
                 S[j] = sc.nextInt();
            }
            long step = 0 ;
            for (int j = 0; j < N-1 ; j++) {
                step= step + Math.abs(S[j]-S[j+1])-1;
            }
            System.out.println(step);
        }
    }
}
