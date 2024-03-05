package codechef1000to1400;

import java.util.Scanner;

public class groupAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();  // the number of people at the party
            int [] freq = new int[N + 1 ];
            for (int j = 1; j <= N ; j++) {
                int P = sc.nextInt();
                freq[P]++;
            }
            boolean flag = true  ;
            for (int j = 2 ; j < N +1 ; j++) {
                if (freq[j] % j != 0 ) flag = false ;
            }
            if (flag==true ) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
