public class MyArrayBasedListUsage {
    void main() {

        checkEmptyList();

        performInsertAndRemove();
    }

    private static void checkEmptyList() {
        var list = new MyArrayBasedList();
        IO.println("correct empty size? " + (list.size() == 0));
        IO.println("null on invalid index? " + (list.get(0) == null));
        IO.println("nothing contained in empty list? " + !list.contains(42));
    }

    private static void performInsertAndRemove() {
        final int amount = 1000;
        var list = createAndInitializeList(amount);
        IO.println("list size matches? " + (list.size() == amount));
        for (int i = 0; i < amount; i++) {
            if (!list.get(i).equals("Test" + i)) {
                IO.println("!!Incorrect list entry!!");
            }
            if (!list.contains("Test" + i)) {
                IO.println("!!Incorrect list contains!!");
            }
        }
        for (int i = 0; i < amount; i++) {
            list.remove("Test" + i);
            for (int k = 0; k < amount - i - 1; k++) {
                if (!list.get(k).equals("Test" + (i + k + 1))) {
                    IO.println("!!Incorrect list entry after remove!!" + list.get(k) + ("Test" + (i + k + 1)));
                }
            }
        }
        IO.println("correct final size? " + (list.size() == 0));
    }

    private static MyArrayBasedList createAndInitializeList(int amount) {
        var list = new MyArrayBasedList();
        for (int i = 0; i < amount; i++) {
            list.add("Test" + i);
        }
        return list;
    }
}
