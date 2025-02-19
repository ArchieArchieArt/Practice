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

        int int1 = Character.getNumericValue(chr1);
        int int2 = Character.getNumericValue(chr2);
        int int3 = Character.getNumericValue(chr3);

        int sum = int1 + int2 + int3;

        System.out.println(sum);
    }
}