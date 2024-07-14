//48.	Leap Year
import java.util.Scanner;

class P48
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter year to check : ");
        year = sc.nextInt();
        if(year%4==0)
        {
            System.out.println("Year is leap year.");
        } 
        else
        {
            System.out.println("Year is not leap year.");
        } 
    }
}