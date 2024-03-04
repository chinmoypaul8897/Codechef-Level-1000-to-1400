package codechef1000to1400;

import java.util.Scanner;

public class chefAndHisStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            String S = sc.next();
            int N = S.length() ;
            char [] C = S.toCharArray();
            int count = 0;
            for (int j = 0; j < N ; j++) {
             if (C[j]=='>') C[j]='<';
             else if (C[j]=='<') C[j]='>';
            }
            for (int j = 0; j < N-1 ; j++) {
               if (C[j]=='>' && C[j+1]=='<') count++;
            }
            System.out.println(count);
        }
    }
}
