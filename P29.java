//29.	Prime Number Program in Java
import java.util.Scanner;
public class P29
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i;
        for (i = 2; i < n; i++) 
        {
            if (n % i == 0) 
            {
                break;
            }
        }
        if (i == n) 
        {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a Prime Number");
        }                 
    }
}