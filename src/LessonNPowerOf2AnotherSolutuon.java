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
        System.out.println("The 0 power of 2 is 1");

        int a = 1;
        for(int i = 0; i <= N; i++){
            a = a << 1;
            System.out.println("The " + i + " power of 2 is " + a);
        }
    }
}