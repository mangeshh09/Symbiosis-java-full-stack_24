//51.	Find the maximum between two numbers.
import java.util.Scanner;
class P51
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter  two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<b)
        {
            System.out.println(b+" is the greatest.");
        }       
        else
        {
            System.out.println(a+" is the greatest.");
        }
    }
}