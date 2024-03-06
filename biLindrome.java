package codechef1000to1400;
import java.util.Scanner;

public class biLindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   // the length of string S
            String S = sc.next();
            boolean flag = false ;
            for (int j = 0; j < N ; j++) {
                for (int k = j+1; k < N ; k++) {
                    if (S.charAt(j)==S.charAt(k)) {
                        flag = true;
                        break;
                    }
                }

            }
            if (flag==true) System.out.println(N-2);
            else System.out.println(-1);
        }

    }
}
