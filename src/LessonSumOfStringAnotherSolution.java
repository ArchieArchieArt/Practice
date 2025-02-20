/**
 * Даны три строки:
 * String str1 = "123";
 * String str2 = "456";
 * String str3 = "789";
 * Сложите значения этих строк как целые числа.
 */
import java.util.Arrays;
//ПРЕОБРАЗОВАТЬ СТРОКУ В ИНТ МЕТОДОМ ПЕРВОДА В БАЙТЫ И ИХ ПЕРЕСТАНОВКУ
public class LessonSumOfStringAnotherSolution {

    public static void main(String[] args) {

        String str1 = "123";
        String str2 = "456";
        String str3 = "789";

        //преобразовываем строку в массив байтов
        byte[] bytes1 = str1.getBytes();
        Arrays.toString(bytes1);





        int int1 = Integer.parseInt(str1);
        int int2 = Integer.parseInt(str2);
        int int3 = Integer.parseInt(str3);

        int sum = int1 + int2 + int3;

        System.out.println(bytes1);
    }
}