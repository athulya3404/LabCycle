import java.util.Scanner;

public class ArraySorting
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter 5 numbers:");

        // Reading array elements
        for(int i = 0; i < 5; i++)
        {
            a[i] = sc.nextInt();
        }

        // Sorting logic (Ascending order)
        for(int i = 0; i < 5; i++)
        {
            for(int j = i + 1; j < 5; j++)
            {
                if(a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");

        // Display sorted array
        for(int i = 0; i < 5; i++)
        {
            System.out.print(a[i] + " ");
        }    }  }
