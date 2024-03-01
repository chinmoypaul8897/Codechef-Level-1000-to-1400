package codechef1000to1400;

import java.util.Scanner;

public class easyPronunciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt();   // length of string
            String S = sc.next();
            int count=0;
            boolean flag = true ;
            for (int j = 0; j < N ; j++) {
                if (S.charAt(j)!='a' && S.charAt(j)!= 'e' && S.charAt(j)!='i' && S.charAt(j)!='o' && S.charAt(j)!='u') {
                    count++;
                    if (count>=4) flag= false;

                }
                else count=0;
            }
            if (flag==false) System.out.println("NO");
            else System.out.println("YES");

        }
    }

}
