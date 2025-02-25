/**
 * Даны три символа:
 * char chr1 = '1';
 * char chr2 = '2';
 * char chr3 = '3';
 * Слейте эти символы в число:
 * int 123
 */
public class LessonIntOfChar {

    public static void main(String[] args) {

        char chr1 = '1';
        char chr2 = '2';
        char chr3 = '3';

        int int1 = chr1 - '0';
        int int2 = chr2 - '0';
        int int3 = chr3 - '0';

        int z = (int1 * 100) + (int2 * 10) + int3;
        System.out.println(z);
    }
}