package codechef1000to1400;

import java.util.Scanner;

public class nQueensPuzzleSolved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            double N = sc.nextInt();
            double x = Math.pow((0.143*N),N);
            int X = (int)x;
            if (x-X < 0.5) System.out.println(X);
            else System.out.println(X+1);
        }
    }
}
