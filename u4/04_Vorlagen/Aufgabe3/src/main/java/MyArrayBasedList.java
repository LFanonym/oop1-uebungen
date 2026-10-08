import java.util.Arrays;

public class MyArrayBasedList {
    private int pointer = 0;
    private Object[] list = new Object[5];

    public void add(Object element) {
        if (pointer >= list.length) {
            list = Arrays.copyOf(list, (int) Math.round(list.length * 1.5));
        }
        list[pointer] = element;
        pointer++;
    }

    public void remove(Object element) {
        boolean found = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].equals(element)) {
                found = true;
                pointer--;
            }
            if (found) {
                if (i == list.length-1) {
                    list[i] = null;
                    return;
                }
                list[i] = list[i+1];
            }
        }
    }

    public boolean contains(Object element) {
        for (Object item: list) {
            if (item != null && item.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public Object get(int index) {
        if (index > list.length - 1) {
            return null;
        }
        return list[index];
    }

    public int size() {
        return pointer;
    }
}
