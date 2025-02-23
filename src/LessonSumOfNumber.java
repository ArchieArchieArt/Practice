/**
 * Дано некоторое число:
 * 12345
 * Найдите сумму цифр этого числа.
 */
import java.util.Scanner;

public class LessonSumOfNumber {

    public static void main(String[] args) {

        System.out.print("Input number, please: ");
        Scanner newScanner = new Scanner(System.in);

        int number = newScanner.nextInt();
        System.out.println("Got number: '" + number +"'");

        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Result is: " + sum);
    }
}