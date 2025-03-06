/**
 * Дано целое число, содержащее количество мегабайт:
 * int mb = 35;
 * Переведите это значение в байты.
 */
public class LessonMbToByte {

    public static void main(String[] args) {

        int mb = 35;
        int bytes = mb * 1024 * 1024;

        System.out.println(bytes);
    }
}