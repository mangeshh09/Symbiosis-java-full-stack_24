//49.	The Date Is Correct or Not
import java.util.Scanner;
class P49
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int date,month,year;
        System.out.println("Enter date: ");
        date= sc.nextInt();
        System.out.println("Enter Month: ");
        month = sc.nextInt();
        System.out.println("Enter Year:");
        year = sc.nextInt();
        
        if(year<0)
        {
            System.out.println("Invalid year.");
        }
        else
        {
            if(month>0 && month<13)
            {
                if(date>0 && date<31)
                {
                    System.out.println("Valid date...");
                }
            }
            else
            {
                System.out.println("Invalid date...");
            }
        }
    }
}