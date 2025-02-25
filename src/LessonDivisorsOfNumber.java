/**
 * Дано некоторое целое число:
 * int num = 12;
 * Выведите в консоль все делители этого числа.
 */
public class LessonDivisorsOfNumber {

    public static void main(String[] args) {
        int num = 12;

        for (int i = 1; i < 13; i++) {
            if(num % i == 0){
                System.out.println(i);
            }
        }
    }
}