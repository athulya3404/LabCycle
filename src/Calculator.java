import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int choice, A, B;

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        System.out.print("Enter first number: ");
        A = sc.nextInt();

        System.out.print("Enter second number: ");
        B = sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Result = " + (A + B));
                break;

            case 2:
                System.out.println("Result = " + (A - B));
                break;

            case 3:
                System.out.println("Result = " + (A * B));
                break;

            case 4:
                System.out.println("Result = " + (A / B));
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
