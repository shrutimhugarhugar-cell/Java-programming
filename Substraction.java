import java.util.Scanner;

class Subtraction
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, b, difference;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        difference = a - b;

        System.out.println("Difference = " + difference);

        sc.close();
    }
}
