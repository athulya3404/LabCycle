import java.util.Scanner;

public class StudentDetails
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String name, course, rollNo;
        double percentage;

        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("Roll No: ");
        rollNo = sc.nextLine();

        System.out.print("Course: ");
        course = sc.nextLine();

        System.out.print("Percentage: ");
        percentage = sc.nextDouble();

        System.out.println("\nStudent Details");
        System.out.println("---------------");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Course     : " + course);
        System.out.println("Percentage : " + percentage);
    }
}