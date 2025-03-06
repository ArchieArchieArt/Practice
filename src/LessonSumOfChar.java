/**
 * Даны три символа:
 * char chr1 = '1';
 * char chr2 = '2';
 * char chr3 = '3';
 * Сложите значения этих символов как целые числа.
 */
public class LessonSumOfChar {

    public static void main(String[] args) {

        char chr1 = '1';
        char chr2 = '2';
        char chr3 = '3';

        int int1 = chr1 - '0';
        int int2 = chr2 - '0';
        int int3 = chr3 - '0';

        int sum = int1 + int2 + int3;

        System.out.println(sum);
    }
}