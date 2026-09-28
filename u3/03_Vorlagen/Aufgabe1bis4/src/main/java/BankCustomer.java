public class BankCustomer {
    private String firstName;
    private String lastName;
    private String address;
    private float age;
    private BankManager bankManager;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public BankManager getBankManager() {
        return bankManager;
    }

    public void setBankManager(BankManager bankManager) {
        this.bankManager = bankManager;
    }

    public BankAccount openNewAccount(long number) {
        return new BankAccount(number);
    }

    public void print() {
        IO.println(
                "===========================\n" +
                "BankCustomer " + this.firstName + " " + this.lastName + ":\n" +
                "address = " + this.address + "\n" +
                "age = " + this.age + "\n" +
                "bankManager = "
        );
        bankManager.print();
        IO.println("===========================\n");
    }
}
