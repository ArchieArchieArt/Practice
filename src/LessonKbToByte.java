public class LessonKbToByte {

    public static void main(String[] args) {

        int kb = 35;
        int bytes = kb * 1024;
        byte b = (byte) bytes;

        System.out.println(b);
    }
}