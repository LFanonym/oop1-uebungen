package util;

public class SimpleIO {
    public static String readString(String prompt) {
        return IO.readln(prompt);
    }

    public static int readInt(String prompt) {
        return Integer.parseInt(SimpleIO.readString(prompt));
    }
}
