/**
 * Дано некоторое число:
 * 12345
 * Найдите сумму цифр этого числа.
 */

public class LessonSumOfNumber {

    public static void main(String[] args) {

        int sum = 0;
        int i = 12345;

        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }
        System.out.println("Result is: " + sum);
    }
}