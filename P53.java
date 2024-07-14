//53.	Check whether a number is negative, positive or zero.
import java.util.Scanner;
class P53
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        if(num==0)
        {
            System.out.println("Number is zero.");
        }
        else if(num<0)
        {
            System.out.println("Number is negative.");
        }
        else
        {
            System.out.println("Number is positive.");
        }
    }
}