// 12.	Area of a Circle

import java.util.Scanner;

public class eg_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER RADIUS OF CIRCLE");
        double r = sc.nextInt();

        double area = 3.14 * r * r;

        System.out.println("THE AREA OF CIRCLE IS = " + area);
        sc.close();
    }
}