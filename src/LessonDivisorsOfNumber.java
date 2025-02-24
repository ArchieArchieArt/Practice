/**
 * Дано некоторое целое число:
 * int num = 12;
 * Выведите в консоль все делители этого числа.
 */
public class LessonDivisorsOfNumber {

    public static void main(String[] args) {
        int i = 12;

        for (int a = 1; a <= 12; a++) {
            if(i % a == 0){
                System.out.println(a);
            }
        }
    }
}