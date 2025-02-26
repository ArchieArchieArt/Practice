/**
 * Дано некоторое целое число:
 * int num = 12345;
 * Найдите сумму всех его четных цифр
 */
public class LessonSumOfEvenSymbolsInNumber {

    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        while(num >= 1) {
            int a = num % 10;
            num /= 10;

            if(a % 2 == 0) {
                sum = sum + a;
            }
        }
        System.out.println(sum);
    }
}