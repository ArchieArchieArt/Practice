/**
 * Напишите код, который выведет первые N степеней двойки.
 */
import java.util.Scanner;

public class LessonNPowerOf2AnotherSolutuon {

    public static void main(String[] args) {

        System.out.print("Input power of N, please: ");
        Scanner newScanner = new Scanner(System.in);

        int N = newScanner.nextInt();
        System.out.println("Got number: '" + N +"'");

        if (N == 0) {
            System.out.println("Zero is not acceptable!");
            System.exit(0);
        }

        int a = 1 << N;

        for(int i = 2; i <= a; i = i * 2){
            System.out.println(i);
        }
    }
}