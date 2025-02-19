/**
 * Напишите код, который выведет первые N степеней двойки.
 */
import java.util.Scanner;

public class LessonNDegreesOf2 {

    public static void main(String[] args) {

        System.out.print("Input degree of N, please: ");
        Scanner newScanner = new Scanner(System.in);

        int degreeOfN = newScanner.nextInt();
        System.out.println("Got number: '" + degreeOfN +"'");

        int a = 2;

        for(int two = 2; a <= degreeOfN; a++){
            two = two * 2;
            System.out.println("The number is " + two);
        }
    }
}