import java.util.Scanner;

public class SwapNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.print("Enter A: ");
        A = sc.nextInt();

        System.out.print("Enter B: ");
        B = sc.nextInt();

        System.out.println("Before Swap");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        A = A + B;
        B = A - B;
        A = A - B;

        System.out.println("After Swap");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}