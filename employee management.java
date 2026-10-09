import java.util.Scanner;

public class emp2 {

    static Scanner sc = new Scanner(System.in);

    static String[] name = new String[100];
    static int[] age = new int[100];
    static String[] designation = new String[100];
    static double[] salary = new double[100];

    static int count = 0;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    createEmployee();
                    break;

                case 2:
                    displayEmployee();
                    break;

                case 3:
                    raiseSalary();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }

    static void createEmployee() {

        String continueChoice;

        do {
            System.out.print("Enter the name: ");
            name[count] = sc.nextLine();

            System.out.print("Enter the age: ");
            age[count] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter the Designation: ");
            designation[count] = sc.nextLine();

            if (designation[count].equalsIgnoreCase("programmer")) {
                salary[count] = 20000;
            }
            else if (designation[count].equalsIgnoreCase("manager")) {
                salary[count] = 30000;
            }
            else if (designation[count].equalsIgnoreCase("tester")) {
                salary[count] = 25000;
            }
            else {
                salary[count] = 0;
                System.out.println("Invalid designation!");
            }

            count++;

            System.out.print("(y/n): ");
            continueChoice = sc.nextLine();

        } while (continueChoice.equalsIgnoreCase("y"));
    }

    static void displayEmployee() {

        if (count == 0) {
            System.out.println("No employees available.");
            return;
        }

        System.out.println("\n===== EMPLOYEE DETAILS =====");

        for (int i = 0; i < count; i++) {

            System.out.println("\nEmployee " + (i + 1));
            System.out.println("Your name is: " + name[i]);
            System.out.println("Your age is: " + age[i]);
            System.out.println("Your salary: " + salary[i]);
            System.out.println("Your designation is: " + designation[i]);

            System.out.println("---------------------------");
        }
    }

    static void raiseSalary() {

        if (count == 0) {
            System.out.println("No employees available.");
            return;
        }

        System.out.print("Enter employee number: ");
        int employee = sc.nextInt();

        if (employee < 1 || employee > count) {
            System.out.println("Invalid employee number!");
            return;
        }

        System.out.print("Enter salary raise amount: ");
        double raise = sc.nextDouble();

        salary[employee - 1] += raise;

        System.out.println("Salary raised successfully!");
        System.out.println("New salary: " + salary[employee - 1]);
    }
}