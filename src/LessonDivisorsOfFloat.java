/**
 * Дано некоторое число:
 * float num = 12345;
 * Делите его на два столько раз, пока результат не будет меньше 10. Сколько итераций для этого потребуется?
 */
public class LessonDivisorsOfFloat {

    public static void main(String[] args) {
        float num = 12345;

        for (int i = 0; i < num; i++) {
            num = num / 2;

            if(num < 10){
                System.out.println("Number of iteration: " + i);
            }
        }
    }
}