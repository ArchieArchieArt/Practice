/**
 * Найдите среднее арифметическое всех целых чисел от 1 до 100.
 */
public class LessonArithmeticMeanFrom1to100 {

    public static void main(String[] args) {
        int fromNumber = 1;
        int toNumber = 100;
        double sum = 0;

        for (int a = fromNumber - 1; a <= toNumber; a++) {
            sum += a;
        }
        double average = sum / (toNumber - fromNumber + 1);
        System.out.println(average);
    }
}