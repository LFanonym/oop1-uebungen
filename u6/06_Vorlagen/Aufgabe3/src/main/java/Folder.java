import jdk.jshell.spi.ExecutionControl;

public class Folder extends FilesystemElement {
    private final MyArrayBasedList entries = new MyArrayBasedList();

    public Folder(String name) {
        super(name);
    }

    public void addEntry(FilesystemElement entry) {
        entries.add(entry);
    }

    public long getSize() {
        long size = 0;
        for (int i = 0; i < entries.size(); i++) {
            size += ((FilesystemElement) entries.get(i)).getSize();
        }
        return size;
    }
}
