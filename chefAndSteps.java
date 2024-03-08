package codechef1000to1400;

import java.util.Scanner;

public class chefAndSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
               int N = sc.nextInt();   // the number of distances
               int K = sc.nextInt();   // Chef’s step length
            char [] arr = new char[N];
             for (int j = 0; j < N ; j++) {
                 int D = sc.nextInt();
                 if (D % K == 0 ) arr[j]='1';
                 else arr[j]='0';
            }
             String S = new String(arr);
            System.out.println(S);
        }
    }
}
