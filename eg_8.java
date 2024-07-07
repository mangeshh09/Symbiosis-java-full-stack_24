
// 8.	Simple Interest
import java.util.Scanner;

public class eg_8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE PRINCIPLE AMOUNT");
        float principle = sc.nextFloat();
        System.out.println("ENTER THE RATE");
        int rate = sc.nextInt();
        System.out.println("ENTER THE TIME PERIOD IN YEARS");
        int time = sc.nextInt();

        double a = (principle * rate * time) / 100;
        System.out.println("THE INTEREST IS $" + a);
        System.out.println("THE TOTAL AMOUNT IS $" + (a + principle));

        sc.close();

    }

}