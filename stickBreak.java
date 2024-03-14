package codechef1000to1400;

import java.util.Scanner;

public class stickBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int L = sc.nextInt();   // the initial length of the stick
            int K = sc.nextInt();   // the number of parts Chef wants to break the stick into.
            if (L % K == 0 ) System.out.println(0);
                else System.out.println(L-K);
        }
    }
}
