public class MyArrayBasedList {
    private static final int INITIAL_CAPACITY = 8;
    private Object[] elements = new Object[INITIAL_CAPACITY];
    private int size = 0;

    public void add(Object element) {
        if (size == elements.length) {
            increase();
        }
        elements[size] = element;
        size++;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return elements[index];
    }

    public boolean contains(Object element) {
        for (int index = 0; index < size; index++) {
            if (elements[index].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void remove(Object element) {
        int index = 0;
        while (index < size && !elements[index].equals(element)) {
            index++;
        }
        while (index + 1 < size) {
            elements[index] = elements[index + 1];
            index++;
        }
        if (index < size) {
            elements[index] = null;
            size--;
        }
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return elements.length;
    }

    private void increase() {
        int newSize = size * 3 / 2; // exponential growth
        var newElements = new Object[newSize];
        for (int index = 0; index < size; index++) {
            newElements[index] = elements[index];
        }
        elements = newElements;
    }
}
