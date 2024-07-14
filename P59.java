//59.	Input any character and check whether it is the alphabet, digit or special character.

import java.util.Scanner;

class P59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something:");
        char st = sc.next().charAt(0);

        if (Character.isLetter(st)) 
        {
            System.out.printf("Entered character is a letter ");
            if (Character.isUpperCase(st)) 
            {
                System.out.println(" and a Uppercase.");
            } 
            else if (Character.isLowerCase(st))
            {
                System.out.println("and a Lowercase.");
            }
        } 
        else if (Character.isDigit(st)) 
        {
            System.out.println("Entered charcter is a digit.");
        } 
        else 
        {
            System.out.println("Entered character is a Symbol.");
        }
    }
}