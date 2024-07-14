//58.	Input any alphabet and check whether it is vowel or consonant.

import java.util.Scanner;
class P58
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character :");
        char ch = sc.next().charAt(0);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println(ch+ " is vowel.");
        }
        else
        {
            System.out.println(ch+" is constant.");
        }
    }
}