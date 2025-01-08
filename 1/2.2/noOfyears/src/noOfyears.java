import java.util.Scanner;

public class noOfyears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of minutes:");
        int minute = Integer.parseInt(scanner.nextLine());
        int year = Math.divideExact(minute, 365);
        System.out.println(year);

    }
}