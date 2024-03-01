package codechef1000to1400;

import java.util.Scanner;

public class tcsExamination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
           int DSA1 = sc.nextInt();
           int TOC1 = sc.nextInt();
           int DM1 = sc.nextInt();
            int DSA2 = sc.nextInt();
            int TOC2 = sc.nextInt();
            int DM2 = sc.nextInt();
            if (DSA1+TOC1+DM1 > DSA2+TOC2+DM2) System.out.println("Dragon");
            else if (DSA1+TOC1+DM1 < DSA2+TOC2+DM2) System.out.println("Sloth");
            else {             // DSA1+TOC1+DM1 = DSA2+TOC2+DM2
                if (DSA1 > DSA2) System.out.println("Dragon");
                else if (DSA1 < DSA2) System.out.println("Sloth");
                else {
                    if (TOC1>TOC2) System.out.println("Dragon");
                    else if (TOC1<TOC2) System.out.println("Sloth");
                    else System.out.println("Tie");
                }
            }
        }
    }
}
