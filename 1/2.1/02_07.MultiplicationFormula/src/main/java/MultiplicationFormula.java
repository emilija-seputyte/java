
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        int b = Integer.parseInt(scanner.nextLine());
        int multiple = a * b;
        System.out.println(a + " * " + b + " = " + multiple);

    }
}
