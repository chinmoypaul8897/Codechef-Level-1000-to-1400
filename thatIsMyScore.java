package codechef1000to1400;

import java.util.Scanner;

public class thatIsMyScore {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   //  total no of submissions
            int [] arr = new int[11];
            for (int j = 0; j < N ; j++) {
                 int P = sc.nextInt();   // problem no
                int S = sc.nextInt();   // score
                 if (S > arr[P-1] )
                     arr[P-1]=S;
            }
            int sum = 0 ;
            for (int j = 0; j < 8 ; j++) {
                sum+=arr[j];
            }
            System.out.println(sum);
        }



    }
}
