//26.	Java Program to Find Size of Different Data Types

public class P26 {
    public static void main(String[] args) {
        int a = 10;
        float b = 10.5f;
        double c = 10.5;
        char d = 'a';
        String e = "Hello";
        System.out.println("Size of int is " + Integer.BYTES + " bytes");
        System.out.println("Size of float is " + Float.BYTES + " bytes");
        System.out.println("Size of double is " + Double.BYTES + " bytes");
        System.out.println("Size of char is " + Character.BYTES + " bytes");
        //System.out.println("Size of String is " + String.BYTES + " bytes");

    }
}
