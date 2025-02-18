public class LessonFirstSymbolIsEqual {

    public static void main(String[] args) {

        String wordOne = "in";
        String wordTwo = "inside";
        char firstSymbolOne = wordOne.charAt(wordOne.length() - 1);
        char firstSymbolTwo = wordTwo.charAt(wordTwo.length() - 2);
        if (firstSymbolOne == firstSymbolTwo) {

            System.out.println("Symbols are equal");
                } else {
                    System.out.println("Symbols are not equal");
        }
    }
}
