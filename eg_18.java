
// 18.	How to Print Different Values in Java
// import java.io.*;

public class eg_18 {
    public static void main(String[] args) {

        int num = 122;
        char ch = 'A';
        String str = "Oracle";
        double d = 190.98;
        float f = 3.14f;

        System.out.println(); // prints nothing but throws the cursor to the next line
        System.out.println(num); // prints integer
        System.out.println(ch); // prints character
        System.out.print(str + "\n");
        System.out.print(d + "\n");
        System.out.print(f + "\n");
        System.out.printf("'%s' %n", "javatpoint");
        System.out.printf("'%S' %n", "Jack");
    }
}
