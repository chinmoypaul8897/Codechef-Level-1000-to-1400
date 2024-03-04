package codechef1000to1400;

import java.util.Scanner;

public class endSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt(); // length of permutation P
            int[] P = new int[N];
            int positionOf1 = 0 ;
            int positionOfN = 0 ;
            for (int j = 0; j < N; j++) {
                P[j] = sc.nextInt();
                if (P[j]==1) positionOf1=j+1;
                else if (P[j]==N) positionOfN=j+1;
            }
            if (P[0] == 1 && P[N-1]==N) System.out.println(0);
            else if (positionOf1 < positionOfN)   // 1 is left to N
                System.out.println((positionOf1-1)+(N-positionOfN));
            else if (positionOf1>positionOfN)       // 1 is right to N
                System.out.println((positionOf1-1)+(N-positionOfN)-1);

        }
        }
    }

