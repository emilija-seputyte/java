
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int FirstNum = Integer.parseInt(scan.nextLine());
        System.out.println("Give the second number:");
        int SecNum = Integer.parseInt(scan.nextLine());

        if (FirstNum > SecNum) {
            System.out.println("Greater number is " + FirstNum);
        } else if (SecNum > FirstNum) {
            System.out.println("Greater number is " + SecNum);
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}
