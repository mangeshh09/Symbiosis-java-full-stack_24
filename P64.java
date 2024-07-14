//64.	Input angles of a triangle and check whether the triangle is valid or not.

import java.util.Scanner;

class P64{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first angle of the triangle: ");
        int a = sc.nextInt();
        System.out.println("Enter the second angle of the triangle: ");
        int b = sc.nextInt();
        System.out.println("Enter the third angle of the triangle: ");
        int c = sc.nextInt();
        if(a+b+c==180)
        System.out.println("The triangle is valid");
        else
        System.out.println("The triangle is not valid");
    }
}