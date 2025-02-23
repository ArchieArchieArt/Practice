/**
 * Напишите код, который выведет первые N степеней двойки.
 */
import java.util.Scanner;

public class LessonNPowerOf2 {

    public static void main(String[] args) {

        System.out.print("Input power of N, please: ");
        Scanner newScanner = new Scanner(System.in);

        int powerOfN = newScanner.nextInt();
        System.out.println("Got number: '" + powerOfN +"'");

        int a = 1;

        for(int two = 1; a <= powerOfN; a++){
            two = two * 2;

            if(a == powerOfN){
                System.out.println("The number is " + two);
            }
        }
    }
}