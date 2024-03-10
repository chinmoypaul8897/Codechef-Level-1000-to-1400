package codechef1000to1400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class discrepanciesInTheVotersList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int N1 = sc.nextInt();    // first
            int N2 = sc.nextInt();   // second
            int N3 = sc.nextInt();  //  the number of voters in the third list.
            int [] arr = new int[N1+N2+N3];


            for (int j = 0; j < N1+N2+N3 ; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            ArrayList<Integer> finalList = new ArrayList<>();
            for (int i = 0; i < N1+N2+N3-1; i++) {
                if (arr[i] != arr[i+1])
                {
                    finalList.add(arr[i]);
                }
             }
        System.out.println(finalList.size());
        for (int ele : finalList)
        {
            System.out.println(ele);
        }


    }
}
