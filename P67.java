//67.	Find all roots of a quadratic equation.
import java.util.Scanner;
public class P67
{
    public static void main(String args[])
        {   
            Scanner sc = new Scanner(System.in);
            double a,b,c;
            System.out.println("Enter the value of constants: ");
            a= sc.nextDouble();
            b= sc.nextDouble();
            c= sc.nextDouble();

            double firstroot,secondroot;

            double det = b*b- 4*a*c;
            if(det>0)
            {
                firstroot = (-b + Math.sqrt(det))/(2*a);
                secondroot = (-b + Math.sqrt(det))/(2*a);
                System.out.printf("First root = %.2f and Second Root = %.2f",firstroot,secondroot);
            }
            else if(det==0)
            {
                firstroot = secondroot = -b/(2*a);
                System.out.printf("First root = %.2f and Second Root = %.2f",firstroot,secondroot);
            }
            else
            {
                double real = -b/(2*a);
                double imaginary = Math.sqrt(-det)/(2*a);
                System.out.printf("First root = %.2f + %.2fi",real,imaginary);
                System.out.printf("\nSecond root = %.2f + %.2fi",real,imaginary);
            }
        }
}