package codechef1000to1400;

import java.util.Scanner;

public class football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();     // no of players
            int [] goals = new int[N];
            for (int j = 0; j < N ; j++) {
                 goals [j]= sc.nextInt();   // no of goals
            }
            int [] fouls  = new int[N];
            for (int j = 0; j < N ; j++) {
                fouls[j] = sc.nextInt();    // no of fouls
            }
            int [] points = new int[N];
            int max = 0 ;
            for (int j = 0; j < N ; j++) {
                points[j]=goals[j]*20 - (fouls[j]*10);
                if (points[j] < 0 ) points[j]= 0 ;
                max = Math.max(max,points[j]);
            }

            System.out.println(max);
        }
    }
}
