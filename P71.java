//71.	Employee Salary Program in Java

import java.util.Scanner;
public class P71
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double salary, hra, da, gross_salary;
            System.out.println("Enter details for Employee :");
            System.out.println("Enter the salary: ");
            salary = sc.nextDouble();
            System.out.println("Enter the HRA: ");
            hra = sc.nextDouble();
            System.out.println("Enter the DA: ");
            da = sc.nextDouble();
            gross_salary = salary + hra - da;
            System.out.println("Gross Salary: "+gross_salary);

            System.out.println("Gross salary of Employee :"+gross_salary);
    }
}