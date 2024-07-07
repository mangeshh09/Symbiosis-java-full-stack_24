// compound_interest
// A = P (1 + r/n)^(nt)

// Where:
// A = Accumulated value
// P = Principal amount
// r = Interest rate (decimal form)
// n = Number of compounding periods per year
// t = Time in years
import java.util.Scanner;

class eg_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER PRINCIPLE AMOUNT ");
        double principle = sc.nextDouble();

        System.out.println("ENTER INTEREST RATE");
        double rate = sc.nextDouble();

        System.out.println("ENTER TIME PERIOD IN YEARS");
        int t = sc.nextInt();

        System.out.println("NUMBER OF COMPOUNDING PERIOD PER YEAR");
        int n = sc.nextInt();

        double ci = principle * Math.pow((1 + rate / n), n * t);
        System.out.println("THE COMPOUND INTEREST IS " + ci);
        sc.close();
    }
}