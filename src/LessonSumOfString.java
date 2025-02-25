/**
 * Даны три строки:
 * String str1 = "123";
 * String str2 = "456";
 * String str3 = "789";
 * Сложите значения этих строк как целые числа.
 */
public class LessonSumOfString {

    public static void main(String[] args) {

        String str1 = "123";
        String str2 = "456";
        String str3 = "789";

        int int1 = ((str1.charAt(0) - '0') * 100) + ((str1.charAt(1) - '0') * 10) + (str1.charAt(2) - '0');
        int int2 = ((str2.charAt(0) - '0') * 100) + ((str2.charAt(1) - '0') * 10) + (str2.charAt(2) - '0');
        int int3 = ((str3.charAt(0) - '0') * 100) + ((str3.charAt(1) - '0') * 10) + (str3.charAt(2) - '0');

        int sum = (int1 + int2 + int3);
        System.out.println(sum);
    }
}