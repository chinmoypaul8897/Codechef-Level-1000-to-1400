package codechef1000to1400;

import java.util.Scanner;

public class gameOfPooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            if (N == 2 || N == 3 ) System.out.println(N-1);
            else System.out.println(N);
        }
    }
}
