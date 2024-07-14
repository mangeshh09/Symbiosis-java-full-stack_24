//30.	Palindrome Program in Java

public class P30
{
    public static void main(String[] args) {
        int num = 121, temp = num, rev = 0, rem;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (temp == rev) 
        {
            System.out.println("The number is a palindrome.");
        } 
        else {
            System.out.println("The number is not a palindrome.");
        }
    }
}