// 14.	GCD of Two Numbers

public class eg_14 {
    public static void main(String args[]) {
        int a = 12, b = 9, gcd = 1;
        for (int i = 1; i <= a && i <= b; ++i) {

            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        System.out.printf("The GCD of %d and %d is %d.", a, b,gcd);
    }
}