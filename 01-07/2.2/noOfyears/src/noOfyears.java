import java.util.Scanner;

public class noOfyears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of minutes:");
        int minute = Integer.parseInt(scanner.nextLine());
        int years = minute / 60 / 24 / 365;
        int days = minute / 60 / 24 % 365;
        System.out.println(minute + " minutes is approximately " + years + " years and " + days + " days");

    }
}