// 11.	Read Integer (N) and Print the First Three Powers (N^1, N^2, N^3)

import java.util.Scanner;

public class eg_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER AN INTEGER");
        int num = sc.nextInt();

        System.out.println("POWER OF " + num);
        for (int i = 1; i <= 3; i++) {
            System.out.println(num + " ^ " + i + " = " + Math.pow(num, i));
        }
        sc.close();
    }
}