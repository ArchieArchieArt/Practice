/**
 * Напишите код, который выведет первые N степеней двойки.
 */
import java.util.Scanner;

public class LessonNPowerOf2 {

    public static void main(String[] args) {

        System.out.print("Input power of N, please: ");
        Scanner newScanner = new Scanner(System.in);

        int N = newScanner.nextInt();
        System.out.println("Got number: '" + N +"'");

        if (N == 0) {
            System.out.println("Zero is not acceptable!");
            System.exit(0);
        }

        int j = 1;

        for(int i = 1; i <= N; i++){
            j *= 2;
            System.out.println("The number is " + j);
        }
    }
}