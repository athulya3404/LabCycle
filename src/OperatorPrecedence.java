import java.util.Scanner;

public class OperatorPrecedence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d, e, result;

        System.out.print("Enter a: ");
        a = sc.nextInt();

        System.out.print("Enter b: ");
        b = sc.nextInt();

        System.out.print("Enter c: ");
        c = sc.nextInt();

        System.out.print("Enter d: ");
        d = sc.nextInt();

        System.out.print("Enter e: ");
        e = sc.nextInt();

        result = a + b * c - d / e;

        System.out.println("Result = " + result);
    }
}