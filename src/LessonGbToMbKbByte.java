/**
 * Дано дробное число, содержащее количество гигабайт:
 * float gb = 35.24;
 * Переведите это значение в мегабайты, килобайты и байты.
 */
//WHERE IS f IN THE END OF THE 35.24?
public class LessonGbToMbKbByte {

    public static void main(String[] args) {

        float gb = 35.24f;
        double mb = gb * 1024;
        double kb = gb * 1024 * 1024;
        double bytes = gb * 1024 * 1024 * 1024;

        System.out.println(mb);
        System.out.println(kb);
        System.out.println(bytes);
    }
}