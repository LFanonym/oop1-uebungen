public class OwnStack {
    int stackpointer;
    String[] stack;

    public OwnStack(int capacity) {
        stack = new String[capacity];
    }

    public void push(String element) {
        if (this.isFull()) {
            throw new StackOverflowError();
        }
        stack[stackpointer] = element;
        stackpointer++;
    }

    public String pop() {
        if (stackpointer == 0) {
            return null;
        }
        stackpointer--;
        String value = stack[stackpointer];
        stack[stackpointer] = null;
        return value;
    }

    public int size() {
        return stackpointer;
    }

    public boolean isEmpty() {
        return stackpointer == 0;
    }

    public boolean isFull() {
        return stackpointer == stack.length;
    }
}