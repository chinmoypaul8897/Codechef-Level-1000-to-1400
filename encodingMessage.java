package codechef1000to1400;

import java.util.Scanner;

public class encodingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();
            String S = sc.next();
            char [] ch = S.toCharArray();
            int  [] ascii = new int [N];
            if (N % 2 == 0 ) {
                for (int j = 0; j < N; j = j + 2) {
                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;

                }
            }
            else {
                for (int j = 0; j < N-1; j = j + 2) {
                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;

                }
            }
            for (int j = 0; j < N ; j++) {
                ascii[j]=122+97 - (int)ch[j];
                ch[j]=(char)ascii[j];
            }
            for (char    ele : ch )
            {
                System.out.print(ele);
            }
            System.out.println();
        }

    }
}
