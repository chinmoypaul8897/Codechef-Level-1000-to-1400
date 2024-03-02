package codechef1000to1400;

import java.util.Scanner;

public class zeroString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T  ; i++) {
            int N = sc.nextInt();
            String S = sc.next();
            char  [] C = S.toCharArray();
            int count1 = 0 ;
            int count0 = 0 ;
            for (int j = 0; j < N ; j++) {
                if (C[j]=='1') count1++;
                else count0++;
            }

            if (count1>count0)
            {
                for (int j = 0; j < N  ; j++) {
                    if (C[j]=='1') C[j]='0';
                    else C[j]='1';
                }
                int newcount1 = 0 ;
                for (int j = 0; j < N  ; j++) {
                    if (C[j]=='1' ) newcount1++;
                }
                System.out.println(newcount1+1);
            }
            else {
                System.out.println(count1);
            }
        }
    }
}
