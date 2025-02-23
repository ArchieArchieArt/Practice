/**
 * Выведите в консоль все целые числа от 100 до 1.
 */
import java.util.Scanner;

public class LessonOutputNumbers {

    public static void main(String[] args) {

        System.out.print("Input positive number, please: ");
        Scanner newScanner = new Scanner(System.in);

        int number = newScanner.nextInt();
        System.out.println("Got number: '" + number +"'");

        if(number < 1){
            System.out.println("I need positive number!");
        }

        int a;
        for(a = number; a > 0; a--){
            System.out.println("Result is: " + a);
        }
    }
}