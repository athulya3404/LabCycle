import java.util.Scanner;

public class PositiveNegative
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int positive = 0, negative = 0, zero = 0;

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();

            if (arr[i] > 0)
            {
                positive++;
            }
            else if (arr[i] < 0)
            {
                negative++;
            }
            else
            {
                zero++;
            }
        }
        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
        System.out.println("Zeros = " + zero);
    }
}