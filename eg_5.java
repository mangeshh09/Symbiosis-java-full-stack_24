// 5.	Swap two numbers
public class eg_5 {

    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("THE INITIAL VALUE OF NUMBER_1 is " + a);
        System.out.println("THE INITIAL VALUE OF NUMBER_2 is " + b);
        // SWAP WITHOUT USING THIRD VARIABLE

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("THE CHANGED VALUE OF NUMBER_1 AFTER SWAPPING is " + a);
        System.out.println("THE CHANGED VALUE OF NUMBER_2 AFTER SWAPPING is " + b);

    }
}