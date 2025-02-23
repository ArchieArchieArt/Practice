/**
 * Дана некоторая строка:
 * "abcde"
 * Переберите и выведите в консоль по очереди все символы с конца строки.
 */
public class LessonRiversOutput {

    public static void main(String[] args) throws Exception {

        System.out.print("Input your word, please: ");
        byte[] input = new byte[256];
        if(System.in.read(input) == 0)
            System.exit(0);

        String wordOne = (new String(input)).trim();
        System.out.println("Got string: '" + wordOne +"'");

        int lengthOfWordOne = wordOne.length();

        for (int lengthOfWordOneMinusOne = lengthOfWordOne - 1; lengthOfWordOneMinusOne > -1; lengthOfWordOneMinusOne--) {
            char oneChar = wordOne.charAt(lengthOfWordOneMinusOne);
            System.out.println("Result is: " + oneChar);
        }
    }
}