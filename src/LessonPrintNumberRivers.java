/**
 * Дано некоторое целое число:
 * int num = 12345;
 * Выведите в консоль все его цифры с конца.
 */

public class LessonPrintNumberRivers {

    public static void main(String[] args) {
        int num = 12345;

        while(num >= 1) {
            int a = num % 10;
            num /= 10;
            System.out.println(a);
        }
    }
}