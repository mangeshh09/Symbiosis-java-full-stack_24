//56.	Check whether a year is a leap year or not.

import java.util.Scanner;

class P56
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