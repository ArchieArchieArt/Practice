/**
 * Найдите сумму всех целых нечётных чисел от 1 до 100.
 */
public class LessonSumOddFrom1to100 {

    public static void main(String[] args) {

        int number;
        int sum = 0;

        for (number = 1; number <= 100; number++) {

            if(number % 2 != 0){
                sum += number;
            }

            if(number == 100){
                System.out.println(sum);
            }
        }
    }
}