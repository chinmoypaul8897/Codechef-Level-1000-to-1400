package codechef1000to1400;

import java.util.Scanner;

public class laptopRecommendation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T  ; i++) {
            int N = sc.nextInt();    // no of friends
            int [] laptop = new int[10];
            for (int j = 0; j < 10 ; j++) {
                laptop[j]=j+1;
            }
            int [] count = new int[10];
            int max = 0 ;
            for (int j = 0; j < N ; j++) {
                int A = sc.nextInt(); // recommendation of i th friend
                for (int k = 0; k < 10; k++) {
                    if (A==laptop[k]) count[k]++;
                    max = Math.max(max,count[k]);

                }
            }
            int  maxCount = 0 ;
            for (int k = 0; k < 10; k++) {
                if (max == count[k]) maxCount++;
            }
            if (maxCount > 1 ) System.out.println("CONFUSED");
            else {
                for (int j = 0; j < 10; j++) {
                    if (max == count[j]) System.out.println(j+1);
                }
            }

        }
    }
}
