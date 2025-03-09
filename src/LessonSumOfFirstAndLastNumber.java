/**
 * Дано число:
 * int num = 12345;
 * Найдите сумму первой и последней цифры этого числа.
 */
public class LessonSumOfFirstAndLastNumber {

    public static void main(String[] args) {

        int num = 12345;
        String str1 = "" + num;

        int int1 = (str1.charAt(0) - '0');
        int int2 = (str1.charAt(4) - '0');

        int sum = (int1 + int2);
        System.out.println(sum);
    }
}