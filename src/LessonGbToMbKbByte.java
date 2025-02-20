/**
 * Дано дробное число, содержащее количество гигабайт:
 * float gb = 35.24;
 * Переведите это значение в мегабайты, килобайты и байты.
 */
//WHERE IS f IN THE END OF THE 35.24?
public class LessonGbToMbKbByte {

    public static void main(String[] args) {

        float gb = 35.24f;
        double dGB = Double.parseDouble(String.valueOf(gb));

        double mb = dGB * 1024;
        double kb = dGB * 1024 * 1024;
        double bytes = dGB * 1024 * 1024 * 1024;

        System.out.println(mb);
        System.out.println(kb);
        System.out.println(bytes);
    }
}