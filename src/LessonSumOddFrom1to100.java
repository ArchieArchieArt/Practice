/**
 * Найдите сумму всех целых чисел от 1 до 100.
 */
public class LessonSumOddFrom1to100 {

    public static void main(String[] args) {

        int sum = 0;
        int i = 0;

        while (i < 100) {
            i++;
            if (i % 2 != 0)
                continue;
            sum += i;
        }
        System.out.println(sum);
    }
}