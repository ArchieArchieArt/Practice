/**
 * Найдите сумму всех целых чисел от 1 до 100.
 */
public class LessonSumFrom1to100 {

    public static void main(String[] args) {

        int number;
        int sum = 0;

        for (number = 1; number <= 100; number++) {
            sum += number;

            if(number == 100){
                System.out.println(sum);
            }
        }
    }
}