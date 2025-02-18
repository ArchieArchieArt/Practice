public class LessonCharsToString {

    public static void main(String[] args) {

        char chr1 = 'a';
        char chr2 = 'b';
        char chr3 = 'c';

        String str1 = Character.toString(chr1);
        String str2 = Character.toString(chr2);
        String str3 = Character.toString(chr3);

        String fullString = str1 + str2 + str3;

        System.out.println(fullString);
    }
}