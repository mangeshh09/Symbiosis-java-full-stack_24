//66.	Check whether the triangle is an equilateral, isosceles or scalene triangle.

import java.util.Scanner;

class P66
{
    public static void main(String args[])
    {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side: ");
        x = sc.nextInt();
        System.out.println("Enter 2nd side: ");
        y = sc.nextInt();
        System.out.println("Enter 3rd side: ");
        z = sc.nextInt();

        if(x==y && y==z)
        {
            System.out.println("Equilateral Triangle.");
        }
        else if(x==y || y==z || z==x)
        {
            System.out.println("Isosceles Triangle.");
        }
        else
        {
            System.out.println("Scalene Triangle.");
        }
    }
}