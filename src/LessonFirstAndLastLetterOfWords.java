/**
 * Даны два слова. Проверьте, что последняя буква первого слова совпадает с первой буквой второго слова.
 */
public class LessonFirstAndLastLetterOfWords {

    public static void main(String[] args) throws Exception {

        System.out.print("Input first word, please: ");
        byte[] inputOne = new byte[256];
        if(System.in.read(inputOne) == 0)
            System.exit(0);
        String wordOne = (new String(inputOne)).trim();
        if (wordOne.isEmpty()) {
            System.out.println("You have to enter first word!");
            System.exit(0);
        }
        System.out.println("Got string: '" + wordOne +"'");

        System.out.print("Input second word, please: ");
        byte[] inputTwo = new byte[256];
        if(System.in.read(inputTwo) == 0)
            System.exit(0);
        String wordTwo = (new String(inputTwo)).trim();
        if (wordTwo.isEmpty()) {
            System.out.println("You have to enter second word!");
            System.exit(0);
        }
        System.out.println("Got string: '" + wordTwo +"'");

        int lengthOfWordOne = wordOne.length();
        int lengthOfWordOneMinusOne = lengthOfWordOne - 1;
        char charOne = wordOne.charAt(lengthOfWordOneMinusOne);

        char charTwo = wordTwo.charAt(0);

        if (charOne == charTwo) {
            System.out.println("Letters are equal!");
        } else {
            System.out.println("Letters are NOT equal!");
        }
    }
}