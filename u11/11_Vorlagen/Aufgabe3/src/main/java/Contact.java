import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;


public class Contact implements Serializable {

    private final String name;
    private final String address;
    private final Collection<PhoneEntry> numbers;

    public Contact(String name, String address) {
        this.name = name;
        this.address = address;
        this.numbers = new HashSet<PhoneEntry>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void addPhoneEntry(PhoneEntry entry) {
        numbers.add(entry);
    }

    public Collection<PhoneEntry> getPhoneEntries() {
        return numbers;
    }

    @Override
    public String toString() {
        return "Contact [name=" + name + ", address=" + address + ", numbers= "
                + numbers + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(address, contact.address) && Objects.equals(numbers, contact.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, numbers);
    }
}
