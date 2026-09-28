public class BankManager {
    private String name;
    private int managerId;

    public void print() {
        IO.println(
                "===========================\n" +
                "BankManager " + this.managerId + ":\n" +
                "name = " + this.name + "\n" +
                "===========================\n"
        );
    }
}
