

import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String FirstStr = scan.nextLine();
        System.out.println("Enter the second string:");
        String SecStr = scan.nextLine();
        if (FirstStr.equals(SecStr)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
