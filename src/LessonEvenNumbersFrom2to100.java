public class LessonEvenNumbersFrom2to100 {

    public static void main(String[] args) {

        int count;
        for(count = 1; count <= 100; count++){

            int number;
            number= count % 2;
            if (number == 0) {

                System.out.println(count);
          }
      }
    }
}