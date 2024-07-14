//73.	Java Program To Find Character Is Vowel Or Not

import java.util.Scanner;
public class P73
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U')
        {
            System.out.println("The Character is Vowel.");
        }
        else
        {
            System.out.println("The Character is not Vowel.");
        }
    }
}