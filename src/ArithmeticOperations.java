import java.util.Scanner;

public class ArithmeticOperations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.print("Enter first number: ");
        A = sc.nextInt();

        System.out.print("Enter second number: ");
        B = sc.nextInt();

        System.out.println("Addition = " + (A + B));
        System.out.println("Subtraction = " + (A - B));
        System.out.println("Multiplication = " + (A * B));
        System.out.println("Division = " + (A / B));
        System.out.println("Modulus = " + (A % B));
    }
}