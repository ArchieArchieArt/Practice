import java.util.Scanner;

public class LessonMinuteAndHourtime {

    public static void main(String[] args) {

        System.out.print("Input number of minute, please: ");
        Scanner newScanner = new Scanner(System.in);

        byte numberOfMinute = newScanner.nextByte();
        System.out.println("Got minute: '" + numberOfMinute +"'");

        if (numberOfMinute < 0 ) {
            System.out.println("You have to enter positive value or zero");
        } else if ((numberOfMinute >= 1) && (numberOfMinute <= 15)) {
            System.out.println("First quarter of an hour");
        } else if ((numberOfMinute >= 16) && (numberOfMinute <= 30)) {
            System.out.println("Second quarter of an hour");
        } else if ((numberOfMinute >= 31) && (numberOfMinute <= 45)) {
            System.out.println("Third quarter of an hour");
        } else if ((numberOfMinute >= 46) && (numberOfMinute <= 59) || (numberOfMinute == 0)) {
            System.out.println("Fourth quarter of an hour");
        } else {
            System.out.println("You have to enter value less than 60");
        }
    }
}