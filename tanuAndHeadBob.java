package codechef1000to1400;

import java.util.Scanner;

public class tanuAndHeadBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            String S = sc.next();
            boolean indian = false ;
            boolean foreigner = false ;
            for (int j = 0; j < N ; j++) {
                if (S.charAt(j)=='I') {
                    indian = true;
                    break;
                }
                else if (S.charAt(j)=='Y')
                {
                    foreigner=true;
                    break;
                }
            }
            if (indian==true) System.out.println("INDIAN");
            else if (foreigner==true) System.out.println("NOT INDIAN");
            else System.out.println("NOT SURE");
        }
    }
}