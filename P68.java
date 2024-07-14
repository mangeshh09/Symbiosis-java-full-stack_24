//68.	Calculate profit or loss.

import java.util.Scanner;
public class P68 {
    public static void main(String[] args) {
        int cp,sp,profit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price:");
        cp = sc.nextInt();
        System.out.println("Enter the selling price:");
        sp = sc.nextInt();
        profit = sp-cp;
        if(profit>0)
        {
            System.out.println("Profit of :"+profit);
        }
        else
        {
            System.out.println("Loss of :"+profit);
        }
    }    
}