/**
 * Найдите среднее арифметическое всех целых чисел от 1 до 100.
 */
public class LessonArithmeticMeanSumFrom1to100 {

    public static void main(String[] args) {

        int number;
        int sum = 0;

        for (number = 1; number <= 100; number++) {
            sum += number;
        }
        System.out.println(sum / 100);
    }
}