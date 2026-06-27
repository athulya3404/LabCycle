import java.util.Scanner;

public class SearchElement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, search, i;

        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements:");
        for (i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        search = sc.nextInt();

        for (i = 0; i < n; i++)
        {
            if (arr[i] == search)
            {
                System.out.println("Element found at position " + (i + 1));
                break;
            }
        }

        if (i == n)
        {
            System.out.println("Element not found");
        }
    }
}