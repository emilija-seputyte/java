
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            System.out.print("");

            int number = Integer.parseInt(scanner.nextLine());
            if (number < 0) {
                continue;
            }
            if (number > 0) {
                count = count + 1;
                sum = sum + number;
            } else System.out.println("Cannot calculate the average");
            if (number == 0) {
                break;
            }
        }

    }
}


//            if (number != 0) {
//                if (number > 0) {
//                    count = count + 1;
//                    sum = sum + number;
//                } else {
//                    System.out.println("Cannot calculate the average");
//                }
//            }
//            break;
//        }
//        double avg = (double) sum / count;
//    }
//}



