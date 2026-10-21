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
}
