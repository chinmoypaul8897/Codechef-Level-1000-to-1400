package codechef1000to1400;

import java.util.Scanner;

public class theAttackOfQueen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
             int N = sc.nextInt();  // size of chessboard
             int X = sc.nextInt();  // position of queen
             int Y = sc.nextInt();
             int horVerAttacks = 2* (N-1);
             int majorDiagonal = Math.min(X-1,N-Y)+Math.min(N-X,Y-1);
             int minorDiagonal = Math.min(X-1,Y-1)+Math.min(N-X,N-Y);
            System.out.println(horVerAttacks+majorDiagonal+minorDiagonal);
        }
    }
}
