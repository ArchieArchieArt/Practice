import java.util.Scanner;

public class LessonConditions {

    public static void main(String[] args) {

        System.out.print("Input number, please: ");
        Scanner newScanner = new Scanner(System.in);

        String stringOne = (newScanner.nextLine()).trim();
        if (stringOne.isEmpty()) {
            System.out.println("You have to enter number");
            System.exit(0);
        }

        int number = Integer.parseInt (stringOne);
        System.out.println("Got number: '" + number +"'");

        System.out.print(((number >= -4) && (number <= 11)) || ((number >= 13) && (number <= 15)) || (number == 20));
    }
}