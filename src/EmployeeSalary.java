import java.util.Scanner;

public class EmployeeSalary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double basic, da, hra, gross;

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();

        da = basic * 10 / 100;
        hra = basic * 15 / 100;
        gross = basic + da + hra;

        System.out.println("DA = " + da);
        System.out.println("HRA = " + hra);
        System.out.println("Gross Salary = " + gross);
    }
}