/**
 * Дано некоторое число:
 * 12345
 * Переверните его:
 * 54321
 */
import java.util.Scanner;

public class LessonRiversTheNumber {

    public static void main(String[] args) {

        System.out.print("Input number, please: ");
        Scanner newScanner = new Scanner(System.in);

        int number = newScanner.nextInt();
        System.out.println("Got number: '" + number +"'");

        String str = String.valueOf(number);
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();

        int result = Integer.valueOf(builder.toString());
        System.out.println("Result is: " + result);
    }
}