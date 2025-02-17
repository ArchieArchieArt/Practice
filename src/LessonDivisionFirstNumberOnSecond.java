import java.util.Scanner;

public class LessonDivisionFirstNumberOnSecond {

    public static void main(String[] args) {

        System.out.print("Input your numbers, please: ");
        Scanner newScanner = new Scanner(System.in);

        String stringOne = (newScanner.nextLine()).trim();
        if (stringOne.isEmpty()) {
            System.out.println("You have to enter dividend");
            System.exit(0);
        }

        int numberOne = Integer.parseInt (stringOne);
        System.out.println("Got number: '" + numberOne +"'");

        System.out.print("Input your numbers, please: ");

        String stringTwo = (newScanner.nextLine()).trim();
        if (stringTwo.isEmpty()) {
            System.out.println("You have to enter divisor");
            System.exit(0);
        }

        int numberTwo = Integer.parseInt (stringTwo);
        System.out.println("Got number: '" + numberTwo +"'");

        if (numberTwo == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            int numberThree = numberOne % numberTwo;
            System.out.println("Result of divide is - " + numberThree);
        }
    }
}