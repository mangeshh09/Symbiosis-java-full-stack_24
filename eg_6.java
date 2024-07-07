
// 6.	Area and Circumference of a Circle
import java.util.Scanner;

public class eg_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE RADIOUS OF CIRCLE");
        double radious = sc.nextFloat();

        double area = 3.14 * radious * radious;
        double circumference = 2 * 3.14 * radious;

        System.out.println("THE AREA OF CIRCLE IS " + area);
        System.out.println("THE CIRCUMFERENCE OF CIRCLE IS " + circumference);

        sc.close();

    }

}