package codechef1000to1400;

import java.util.Scanner;

public class sortTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   // the length of the binary string
            String S = sc.next();
            int count = 0 ;
            for (int j = 0; j < N-1; j++) {
                if (S.charAt(j)=='1' && S.charAt(j+1)=='0')
                    count++;
            }
            System.out.println(count);



        }
    }
}
