// 10.	Factorial of a Given Number

import java.util.Scanner;

public class eg_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO FIND ITS FACTORIAL");
        int num = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("THE FACTORIAL OF " + num + " is " + fact);
        sc.close();

    }

}