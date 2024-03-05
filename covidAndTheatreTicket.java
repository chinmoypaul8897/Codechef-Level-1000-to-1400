package codechef1000to1400;
import java.util.Scanner;

public class covidAndTheatreTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T  ; i++) {
            int N = sc.nextInt();  // the number of rows
            int M = sc.nextInt();  // the number of seats in each row
            int eligibleSeats = 0 ;
            int eligibleRows = 0 ;
            if (N % 2 == 0 ) eligibleRows=N/2;
            else eligibleRows=(N/2)+1;
            if (M % 2 == 0 ) eligibleSeats=M/2;
            else eligibleSeats=(M/2)+1;
            System.out.println(eligibleSeats*eligibleRows);
        }
    }
}
