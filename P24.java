//24.	Write a Program to Calculate the Gross Salary of an Employee in Java

public class P24 {
    public static void main(String[] args) {
        int basicSalary = 10000;
        int da = 1000;
        int hra = 2000;
        int pf = 1000;
        int grossSalary = basicSalary + da + hra - pf;
        System.out.println("Gross Salary of an Employee is: " + grossSalary);
    }
}
