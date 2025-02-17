import java.util.Scanner;

public class LessonMonthAndYeartime {

    public static void main(String[] args) {

        System.out.print("Input number of month, please: ");
        Scanner newScanner = new Scanner(System.in);

        String stringOne = (newScanner.nextLine()).trim();
        if (stringOne.isEmpty()) {
            System.out.println("You have to enter month");
            System.exit(0);
        }

        int numberOfMonth = Integer.parseInt (stringOne);
        System.out.println("Got number: '" + numberOfMonth +"'");

        if (numberOfMonth < 1 ) {
            System.out.println("You have to enter positive value");
        } else if (numberOfMonth == 1 ) {
            System.out.println("Time of year is WINTER");
        } else if (numberOfMonth == 2) {
            System.out.println("Time of year is WINTER");
        } else if (numberOfMonth == 3) {
            System.out.println("Time of year is SPRING");
        } else if (numberOfMonth == 4) {
            System.out.println("Time of year is SPRING");
        } else if (numberOfMonth == 5) {
            System.out.println("Time of year is SPRING");
        } else if (numberOfMonth == 6) {
            System.out.println("Time of year is SUMMER");
        } else if (numberOfMonth == 7) {
            System.out.println("CTime of year is SUMMER");
        } else if (numberOfMonth == 8) {
            System.out.println("Time of year is SUMMER");
        } else if (numberOfMonth == 9) {
            System.out.println("Time of year is AUTUMN");
        } else if (numberOfMonth == 10) {
            System.out.println("Time of year is AUTUMN");
        } else if (numberOfMonth == 11) {
            System.out.println("Time of year is AUTUMN");
        } else if (numberOfMonth == 12) {
            System.out.println("Time of year is WINTER");
        } else {
            System.out.println("You have to enter value less than 13");
        }
    }
}