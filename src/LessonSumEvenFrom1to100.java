/**
 * Найдите сумму всех целых четных чисел в промежутке от 1 до 100.
 */
public class LessonSumEvenFrom1to100 {

    public static void main(String[] args) {

        int i;
        int sum = 0;

        for (i = 1; i <= 100; i++) {

            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}