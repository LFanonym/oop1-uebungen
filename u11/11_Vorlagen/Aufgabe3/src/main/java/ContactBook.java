import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ContactBook {
    private static final String FILE_NAME = "contactBook.bin";
    private Map<String, Contact> contactBook = new HashMap<>();

    @SuppressWarnings("unchecked")
    public void load() throws ContactBookException {
        // TODO implement
    }

    public void save() throws ContactBookException {
        // TODO implement
    }

    public void addContact(Contact contact) {
        if (contactBook.containsKey(contact.getName())) {
            throw new IllegalArgumentException("Name already exists");
        }
        contactBook.put(contact.getName(), contact);
    }

    public void addContact(String name, String address) {
        if (contactBook.containsKey(name)) {
            throw new IllegalArgumentException("Name already exists");
        }
        contactBook.put(name, new Contact(name, address));
    }

    public void addNumber(String name, String number, String description) {
        if (!contactBook.containsKey(name)) {
            throw new IllegalArgumentException("Name does not exist");
        }
        Contact contact = contactBook.get(name);
        contact.addPhoneEntry(new PhoneEntry(number, description));
    }

    public Contact findContact(String name) {
        return contactBook.get(name);
    }

    public Collection<Contact> getContacts() {
        return contactBook.values();
    }
}