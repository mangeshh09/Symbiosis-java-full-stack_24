//37.	Calculate area of rectangle
import java.util.Scanner;
class Rectangle{
    double length;
    double width;

    public Rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    public double calculateArea()
    {
        return length*width;
    }
}
public class P37
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        double l = sc.nextDouble();
        System.out.println("Enter the width:");
        double w = sc.nextDouble();
        Rectangle R1 = new Rectangle(l,w);
        System.out.println("Area of Rectangle : "+R1.calculateArea());
    }
}