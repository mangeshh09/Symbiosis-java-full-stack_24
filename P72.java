//72.	Java Program to Find Number Is Positive or Negative

import java.util.Scanner;

public class P72 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) 
        {
            System.out.println("The number is positive.");
        } 
        else if (num < 0) 
        {
            System.out.println("The number is negative.");
        } 
        else 
        {
            System.out.println("The number is zero.");
        }
    }
}