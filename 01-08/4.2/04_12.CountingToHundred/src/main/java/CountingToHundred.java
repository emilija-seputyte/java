
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = n; i <= 100; i++) {
            System.out.println(i);
        }
    }
}

