// 7.	Print Ascii Value of the Character

public class eg_7 {
    public static void main(String[] args) {
        int A = 'A', Z = 'Z', a = 'a', z = 'z';
        System.out.println("THE ASCII VALUE OF A IS " + A);
        System.out.println("THE ASCII VALUE OF Z IS " + Z);
        System.out.println("THE ASCII VALUE OF a IS " + a);
        System.out.println("THE ASCII VALUE OF z IS " +z );


        for (int i = 65; i <= 90; i++)  {
            System.out.printf("%c", i);
        }
        System.out.println();
        for(int j=97;j<=122;j++){
            System.out.printf("%c", j);
        }
    }
}