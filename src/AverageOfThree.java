import java.util.Scanner;

public class AverageOfThree
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double num1, num2, num3, average;

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        num3 = sc.nextDouble();

        average = (num1 + num2 + num3) / 3;

        System.out.println("Average = " + average);

    }
}