package codechef1000to1400;
import java.util.Scanner;

public class lazyJem   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            long N = sc.nextInt();   // no of problems
            long B = sc.nextInt();    // break time
            long M = sc.nextInt();    // initial time for solving each problems
            long   time = 0 ;
            while(N > 0 )
            {    long tempN = 0 ;
                if (N % 2 == 0 ) tempN  = N / 2;
                else tempN = (N + 1) / 2;
                time = time +  (( tempN * M )+ B);
                M = M * 2 ;
                N = N - tempN;
            }
            System.out.println(time-B);
        }
    }
}
