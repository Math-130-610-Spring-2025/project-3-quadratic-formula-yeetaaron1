import java.util.Scanner;

/*
 * Date: 02/27/2025
 * Author: Aaron Canchola
 * Class: Math-130-610
 * Project: QuadraticSolver
 * Description: QuadraticSolver class that reads coefficients of a quadratic equation,
 *              determines the number and type of solutions, and displays them.
 */
public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;

        System.out.println("This program solves a quadratic equation in standard form ax^2 + bx + c = 0\n");

        // Prompt user for coefficients
        System.out.print("Quadratic coefficient a: ");
        a = input.nextDouble();
        System.out.print("Linear coefficient b: ");
        b = input.nextDouble();
        System.out.print("Constant c: ");
        c = input.nextDouble();

        if (a == 0) {
            System.out.println("Error: 'a' cannot be zero in a quadratic equation.");
            input.close();
            return;
        }

        // Compute the discriminant
        double discriminant = b * b - 4 * a * c;

        System.out.println();

        if (discriminant > 0) {
            // Two real solutions
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("The quadratic equation has two real solutions: x = %.4f and x = %.4f\n", x1, x2);
        } else if (discriminant == 0) {
            // One real solution
            double x = -b / (2 * a);
            System.out.printf("The quadratic equation has one real solution: x = %.4f\n", x);
        } else {
            // Two complex solutions
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("The quadratic equation has two complex solutions: x = %.4f + %.4fi and x = %.4f - %.4fi\n",
                    realPart, imaginaryPart, realPart, imaginaryPart);
        }

        input.close();
    }
}
