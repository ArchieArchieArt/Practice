/**
 * Дано целое число, содержащее количество килобайт:
 * int kb = 35;
 * Переведите это значение в байты.
 */
public class LessonKbToByte {

    public static void main(String[] args) {

        int kb = 35;
        int bytes = kb * 1024;

        System.out.println(bytes);
    }
}