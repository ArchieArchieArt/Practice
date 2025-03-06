/**
 * Напишите программу, которая узнает, сколько секунд содержится в сутках.
 */
public class LessonSecondsInDay {

    public static void main(String[] args) {

        int days = 1;
        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;

        System.out.println("One day contain this quantity of seconds: " + seconds);
    }
}