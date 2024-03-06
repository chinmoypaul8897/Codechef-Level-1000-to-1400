package codechef1000to1400;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class removeBadElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
          int N = sc.nextInt();  // length of array A
            int [] count = new int[N];

            for (int j = 0; j < N ; j++) {
                int a = sc.nextInt();
                count[a-1]++;
            }

            int max = 0 ;
            for (int j = 0; j < N; j++) {
                max = Math.max(max,count[j]);
            }
            System.out.println(N-max);
        }
    }
}
