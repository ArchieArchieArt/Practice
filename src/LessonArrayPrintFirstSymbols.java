/**
 * Дан массив со строками:
 * String[] arr = {"ab", "cd", "ef"};
 * Выведите в консоль первые символы элементов этого массива.
 */

public class LessonArrayPrintFirstSymbols {

    public static void main(String[] args) {

        String[] arr = {"ab", "cd", "ef"};

        String str1 = arr[0] ;
        String str2 = arr[1];
        String str3 = arr[2];

        System.out.println(str1.charAt(0));
        System.out.println(str2.charAt(0));
        System.out.println(str3.charAt(0));
    }
}