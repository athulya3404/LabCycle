import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A,B,C;

        System.out.print("Enter first number:");
        A = sc.nextInt();

        System.out.print("Enter second number:");
        B = sc.nextInt();

        System.out.print("Enter third number:");
        C = sc.nextInt();

        if (A > B)
        {
            if (A > C)
            {
                System.out.println("Largest : " + A);

            }
            else
            {
                System.out.println("Largest : " + C);
            }
        }
        else
        {
            System.out.println("Largest : " + B);
        }
    }
}
