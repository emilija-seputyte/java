
import java.util.ArrayList;
//import java.util.Objects;
import java.util.Objects;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }
        System.out.print("Search for? ");
        String name = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(list.get(i), name)) {
                System.out.println(name + " was found!");
                return;
            }
        }
        System.out.println(name + " was not found!");
    }
}
