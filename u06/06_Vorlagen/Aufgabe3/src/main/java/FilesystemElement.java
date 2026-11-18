import java.util.Objects;

public class FilesystemElement {
    private String name;

    public FilesystemElement(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public long getSize() {
        throw new IllegalArgumentException("Cant getSize of Baseclass");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FilesystemElement that = (FilesystemElement) o;
        return this.name.equals(that.name);
    }
}
