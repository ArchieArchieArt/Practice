/**
 * Дано некоторое число:
 * float num = 12345;
 * Делите его на два столько раз, пока результат не будет меньше 10. Сколько итераций для этого потребуется?
 */
public class LessonDivisorsOfFloat {

    public static void main(String[] args) {

        float num = 12345;
        int i = 0;

        while (num >= 10) {
            num = num / 2;
            i += 1;
        }
        System.out.println("Number of iteration: " + i);
    }
}