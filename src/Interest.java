import java.util.Scanner;

public class Interest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        double amount = principal + simpleInterest;

        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Amount = " + amount);

    }
}