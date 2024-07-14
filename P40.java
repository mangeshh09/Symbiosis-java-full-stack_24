//40.	The Number Is Positive or Negative
import java.util.Scanner;
public class P40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter Number:");
        num = sc.nextInt();
        if(num==0)
        {
            System.out.println("Number is 0.");
        }
        else if(num<0)
        {
            System.out.println("Negative number.");
        }
        else
        {
            System.out.println("Positive number.");
        }
    }
}
