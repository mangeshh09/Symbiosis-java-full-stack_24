//57.	Check whether a character is an alphabet or not.

import java.util.Scanner;
class P57
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character :");
        char ch = sc.next().charAt(0);

        if(Character.isLetter(ch))
        {
            System.out.println(ch+ " is character");
        }
        else
        {
            System.out.println(ch+" is not a character");
        }
    }
}