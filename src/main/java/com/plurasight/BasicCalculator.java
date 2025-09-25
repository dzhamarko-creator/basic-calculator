import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();

        System.out.println("(A)dd (S)ubtract (M)ultiply (D)ivide");
        System.out.print("Choose: ");
        String op = sc.next();

        if (op.equalsIgnoreCase("A"))
            System.out.println(a + " + " + b + " = " + (a + b));
        else if (op.equalsIgnoreCase("S"))
            System.out.println(a + " - " + b + " = " + (a - b));
        else if (op.equalsIgnoreCase("M"))
            System.out.println(a + " * " + b + " = " + (a * b));
        else if (op.equalsIgnoreCase("D"))
            System.out.println(b != 0 ? a + " / " + b + " = " + (a / b) : "Error: divide by 0");
        else
            System.out.println("Invalid choice");

        sc.close();
    }
}
