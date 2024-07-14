//33.	How to Generate Random Numbers in Java

import java.util.Random;

public class P33
{
    public static void main(String args[])
    {
        Random rand = new Random();
        int random = rand.nextInt(100);
        System.out.println("Random integer: "+random);
    }
}