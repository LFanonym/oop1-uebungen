import java.io.Serializable;
import java.util.Objects;

public class PhoneEntry {
    private final String number;
    private final String description;

    public PhoneEntry(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PhoneEntry that = (PhoneEntry) o;
        return Objects.equals(number, that.number) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, description);
    }

    @Override
    public String toString() {
        return description + ": " + number;
    }
}
