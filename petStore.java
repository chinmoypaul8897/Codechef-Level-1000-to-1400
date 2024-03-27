package codechef1000to1400;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class petStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
            int N = sc.nextInt(); // the no of animals in the store
            int max = 0 ;
            int [] count = new int[101] ;
            for (int j = 0; j < N ; j++) {
                int A  = sc.nextInt();
                count[A]++;
                max = Math.max(max,A);
            }
            boolean flag = true ;
            for (int j = 0; j < max+1; j++) {
                if (count[j] % 2 != 0 ) flag = false ;
            }
            if (flag==false ) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
