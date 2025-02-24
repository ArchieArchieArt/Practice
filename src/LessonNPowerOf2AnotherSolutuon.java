/**
 * Напишите код, который выведет первые N степеней двойки.
 */
import java.util.Scanner;

public class LessonNPowerOf2AnotherSolutuon {

    public static void main(String[] args) {

        System.out.print("Input power of N, please: ");
        Scanner newScanner = new Scanner(System.in);

        int powerOfN = newScanner.nextInt();
        System.out.println("Got number: '" + powerOfN +"'");

        int number = 1 << powerOfN;

        for(int i = number; i >= number; powerOfN /= 2){
            System.out.println(i);
        }

    }
}