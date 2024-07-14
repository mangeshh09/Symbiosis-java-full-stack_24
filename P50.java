//50.	Voting Eligibility Checker
import java.util.Scanner;
class P50
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter the age:");
        age= sc.nextInt();
        if(age<18)
        {
            System.out.println("Not eligible for voting.");
        }
        else
        {
            System.out.println("Eligible for voting.");
        }
    }
}