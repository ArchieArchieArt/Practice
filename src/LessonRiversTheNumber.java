/**
 * Дано некоторое число:
 * 12345
 * Переверните его:
 * 54321
 */
public class LessonRiversTheNumber {

    public static void main(String[] args) {
        int a = 12345;

        while (a >= 1) {
            int z = a % 10;
            a = a / 10;
            System.out.print(z);
        }
    }
}