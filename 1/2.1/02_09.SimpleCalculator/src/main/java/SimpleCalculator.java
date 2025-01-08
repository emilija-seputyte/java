
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int b = Integer.parseInt(scanner.nextLine());
        double divide = (double) a / b;

        System.out.println(a + " + " + b + " = " + Math.addExact(a, b));
        System.out.println(a + " - " + b + " = " + Math.subtractExact(a, b));
        System.out.println(a + " * " + b + " = " + Math.multiplyExact(a, b));
        System.out.println(a + " / " + b + " = " + divide);

    }
}
