
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            numbers.add(number);
        }
        System.out.print("From where? ");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("To where? ");
        int lastNumber = Integer.parseInt(scanner.nextLine());
        for (int i = firstNumber; i <= lastNumber; i++) {
            System.out.println(numbers.get(i));
        }
    }
}

//            if (i > firstNumber && i < lastNumber) {
//                System.out.println(numbers.size());






