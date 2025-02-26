/**
 * Дано число:
 * int num = 12345;
 * Найдите сумму первой и последней цифры этого числа.
 */
public class LessonSumOfFirstAndLast {

    public static void main(String[] args) {
        int num = 12345;
        int b = num;
        int sum = 0;

        while(num >= 1) {
            int a = num % 10;

            if(num == b || num < 10) {
                sum = sum + a;
            }

            num /= 10;
        }
        System.out.println(sum);
    }
}