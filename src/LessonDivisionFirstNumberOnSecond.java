public class LessonDivisionFirstNumberOnSecond {

    public static void main(String[] args) {

        int inputOne = 14;
        int inputTwo = 5;

        if (inputTwo == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            int thirdNumber = inputOne % inputTwo;
            System.out.println("Result of divide is - " + thirdNumber);
        }
    }
}