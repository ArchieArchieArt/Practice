/**
 * Напишите программу, которая узнает, сколько секунд содержится в году.
 */
public class LessonSecondsInYear {

    public static void main(String[] args) {

        int year = 1;
        int days = year * 365;
        int hours = days * 24;
        int minutes = hours * 60;
        int seconds = minutes * 60;

        System.out.println("One day contain this quantity of seconds: " + seconds);
    }
}