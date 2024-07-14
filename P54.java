//54.	Check whether a number is divisible by 5 and 11 or not.
import java.util.Scanner;

class P54
{
    public static void main(String args[])
    {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        if(num%5==0 && num%11==0)
        {
            System.out.println("The number is divisible by 5 and 11");
        }
        else
        {
            System.out.println("Not divisible.");
        }
    }
}