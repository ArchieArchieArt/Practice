/**
 * Дано некоторое целое число:
 * byte num = 12;
 * Найдите факториал этого числа.
 */
public class LessonFactorialOfNumber {

    public static void main(String[] args) {
        byte num = 12;
        int prd = 1;

        while(num >= 1) {
            int a = num % 10;
            num /= 10;
            prd = prd * a;
        }
        System.out.println(prd);
    }
}