package codechef1000to1400;

import java.util.Scanner;

public class stringGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();    // length of string
            String S = sc.next();
            int [] arr = new int[N];
            for (int j = 0; j < N ; j++) {
                arr[j]=(int)S.charAt(j);
            }
            int [] brr = new int[26];
            for (int j = 0; j < N; j++) {
                int k = arr[j] - 97 ;
                brr[k]++;
            }
            boolean flag = true ;
            for (int j = 0; j < 26; j++) {
                if (brr[j] % 2 != 0 ) {
                    flag = false;
                    break;
                }

            }
            if (flag==false) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
