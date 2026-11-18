import java.util.Arrays;

public class ArrayFunctions {
    public static void print(int[] values) {
        IO.println(Arrays.toString(values));
    }

    public static int[] revert(int[] initial) {
        int[] result = new int[initial.length];
        int targetSpot = initial.length - 1;
        for (int member: initial) {
            result[targetSpot] = member;
            targetSpot--;
        }
        return result;
    }

    public static boolean isAscendinglySorted(int[] input) {
        if (input.length == 0) {
            return true;
        }
        int lastElement = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] < lastElement) {
                return false;
            }
            lastElement = input[i];
        }
        return true;
    }

    public static boolean isDescendinglySorted(int[] input) {
        if (input.length == 0) {
            return true;
        }
        int lastElement = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] > lastElement) {
                return false;
            }
            lastElement = input[i];
        }
        return true;    }
}
