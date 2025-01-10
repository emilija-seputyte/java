
import java.util.Scanner;

public class MilestoKm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter miles:");
        int mile = Integer.parseInt(scanner.nextLine());
        double km = mile * 1.6;
        System.out.println(mile + " miles is " + Math.floor(km * 100) / 100 + " kilometers");
    }
}