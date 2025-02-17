public class LessonLastSymbolOrPreLastSymbol {

    public static void main(String[] args) throws Exception {
        System.out.print("Input your word, please: ");
        byte[] input = new byte[256];
        if(System.in.read(input) == 0)
            System.exit(0);
        String wordOne = (new String(input)).trim();
        System.out.println("Got string: '" + wordOne +"'");

        if (wordOne.isEmpty()) {
            System.out.println("There is no symbols");
        } else if (wordOne.length() == 1) {
            char lastSymbolOne = wordOne.charAt(0);
            System.out.println("Last symbol is - " + lastSymbolOne);
        } else {
            char lastSymbolTwo = wordOne.charAt(wordOne.length() - 2);
            System.out.println("Last but one symbol is - " + lastSymbolTwo);
        }
    }
}