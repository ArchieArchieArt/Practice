public class ZeroOrNot {
    public static void main(String[] args) {

        int number = 1;
        String message = "";

        if (number == 0) {
            message = "equal zero";
        } else if (number > 0) {
            message = "more than zero";
        } else if (number < 0) {
            message = "less than zero";
        }
        System.out.println("Number is " + message);
    }
}
