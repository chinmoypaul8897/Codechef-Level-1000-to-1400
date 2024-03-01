package codechef1000to1400;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T ; i++) {
           int N = sc.nextInt();
           int count = 0;
           int [] arr = new int[2*N];
            for (int j = 0; j <2*N ; j++) {
                arr[j] = sc.nextInt();
            }
            for (int j = 0; j < 2*N; j++) {
                for (int k = 0; k < 2*N; k++) {
                    if (arr[j]==arr[k]) count++;
                }
                if (count>2) break;
                else count=0;
            }
            if (count>2) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
