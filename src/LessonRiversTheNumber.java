/**
 * Дано некоторое число:
 * 12345
 * Переверните его:
 * 54321
 */
public class LessonRiversTheNumber {

    public static void main(String[] args) {

        int i = 12345;

        String str = String.valueOf(i);
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();

        int result = Integer.parseInt(builder.toString());
        System.out.println("Result is: " + result);
    }
}