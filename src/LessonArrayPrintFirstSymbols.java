/**
 * Дан массив со строками:
 * String[] arr = {"ab", "cd", "ef"};
 * Выведите в консоль первые символы элементов этого массива.
 */
public class LessonArrayPrintFirstSymbols {

    public static void main(String[] args) {

        String[] arr = {"ab", "cd", "ef"};

        System.out.println(arr[0].charAt(0));
        System.out.println(arr[1].charAt(0));
        System.out.println(arr[2].charAt(0));
    }
}