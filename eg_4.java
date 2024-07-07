// 4.	Calculate power of a number

import java.util.Scanner;

class eg_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO CALCULATE ITS POWER");
        int i = sc.nextInt();
        System.out.println("ENTER THE POWER");
        int pow = sc.nextInt();

        System.out.println("THE POWER OF " + i + " USING POWER METHOD is " + Math.pow(i, pow));

        // using loop
        int power = 1;
        while (pow != 0) {
            power *= i;
            pow--;
        }
        System.out.println("THE POWER OF " + i + " USING LOOP is " + power);
        sc.close();
    }
}