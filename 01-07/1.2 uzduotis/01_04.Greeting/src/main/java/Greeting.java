
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String start = "Hi ";
        String end = scanner.nextLine();
        System.out.print(start + end);

    }
}
