//39.	The Greatest Number Among the Given Three Number
import java.util.Scanner;
class P39
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three numbers:");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();

        if(a>=b && a>=c)
        {
            System.out.println(a+" is largest.");
        }
        else if(b>=a && b>=c)
        {
            System.out.println(b+" is largest.");
        }
        else
        {
            System.out.println(c+" is largest.");
        }
    }
}