//69.	Java Program To Check Character Is Uppercase, Lowercase Alphabet Or A Digit Or A Special Symbol
import java.util.Scanner;
public class P69
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
            char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase alphabet");
        else if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase alphabet");
        else if (ch >= '0' && ch <= '9')
            System.out.println("Digit");
        else
            System.out.println("Special symbol");
    }
}