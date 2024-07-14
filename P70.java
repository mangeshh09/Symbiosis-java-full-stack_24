//70.	Write a Java Program to Find the Largest of Three Numbers Using Nested IF
import java.util.Scanner;
class P70
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println("The largest number is: "+a);
            }
            else
            {
                System.out.println("The largest number is: "+c);
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("The largest number is: "+b);
            }
            else
            {
                System.out.println("The largest number is: "+c);
            }
        }
    }
}