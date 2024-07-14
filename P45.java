//45.	The Number Is Even or Odd

import java.util.Scanner;
class P45
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Even number.");
        }    
        else
        {
            System.out.println("Odd number.");
        }
    }
}