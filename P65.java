//65.	Input all sides of a triangle and check whether the triangle is valid or not.

import java.util.Scanner;
public class P65 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle:");
        double a = sc.nextDouble();
        System.out.println("Enter the second side of the triangle:");
        double b = sc.nextDouble();
        System.out.println("Enter the third side of the triangle:");
        double c = sc.nextDouble();
        if((a+b>c)&&(a+c>b)&&(b+c>a))
        {
            System.out.println("The triangle is valid.");
        }
        else
        {
            System.out.println("The triangle is not valid.");
        }
    }
}