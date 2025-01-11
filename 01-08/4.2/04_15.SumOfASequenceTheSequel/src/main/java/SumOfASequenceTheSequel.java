
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int FirstNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("Last number? ");
        int LastNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = FirstNumber; i <= LastNumber; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is: " + sum);
    }
}
