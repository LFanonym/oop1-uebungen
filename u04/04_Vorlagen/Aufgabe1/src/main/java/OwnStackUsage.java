public class OwnStackUsage {
    void main() {
        var stack = new OwnStack(5);
        IO.println("isEmpty?: " + stack.isEmpty());

        stack.push("Mirko");
        stack.push("Michael");
        stack.push("Peter");
        stack.push("Adrian");
        stack.push("Farhad");

        IO.println("Size: " + stack.size());
        IO.println("isFull?: " + stack.isFull());

        IO.println("pop: " + stack.pop());
    }
}