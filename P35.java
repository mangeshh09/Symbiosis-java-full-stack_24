//35.	How to Compare Two Objects in Java

import java.util.Scanner;

public class P35 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        Integer a = sc.nextInt();
        System.out.println("Enter second number:");
        Integer b = sc.nextInt();
        if(a.compareTo(b)==0)
        {
            System.out.println("a is equal to b.");
        }
        else{
            System.out.println("a is not equal to b.");
        }
    }
}
