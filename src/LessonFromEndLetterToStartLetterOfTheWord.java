public class LessonFromEndLetterToStartLetterOfTheWord {

    public static void main(String[] args) {

        String word = "abcde";

        for(int symbol = 1; symbol <= 5; symbol++){

            char output = word.charAt(word.length() - symbol);
            System.out.println(output);
        }
    }
}
