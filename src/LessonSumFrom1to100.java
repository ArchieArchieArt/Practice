/**
 * Найдите сумму всех целых чисел от 1 до 100.
 */
public class LessonSumFrom1to100 {

    public static void main(String[] args) {

        int sum = 0;
        int i = 0;

        while (i < 100) {
            i++;
            sum += i;
        }
        System.out.println(sum);
    }
}