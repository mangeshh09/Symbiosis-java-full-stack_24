// 19.	Java Programs To Find Area And Circumference Of Circle

import java.util.Scanner;
import java.lang.Math;

public class eg_19{
    public static void main(String[] args) {
        double circumference, radius;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
        circumference = Math.PI * 2 * radius;
        System.out.println("The circumference of the circle is: " + circumference);
    }
}