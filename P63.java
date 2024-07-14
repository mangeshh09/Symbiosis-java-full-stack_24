//63.	Count the total number of notes in a given amount.
import java.util.Scanner;
public class P63
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount=sc.nextInt();
        int fivehundred = amount/500;
        int hundred=amount/100;
        int fifty=amount/50;
        int twenty=amount/20;
        int ten=amount/10;
        System.out.println("Number of five hundred rupee notes:"+fivehundred);
        System.out.println("Number of hundred rupee notes:"+hundred);
        System.out.println("Number of fifty rupee notes:"+fifty);
        System.out.println("Number of twenty rupee notes:"+twenty);
        System.out.println("Number of ten rupee notes:"+ten);
    }
}