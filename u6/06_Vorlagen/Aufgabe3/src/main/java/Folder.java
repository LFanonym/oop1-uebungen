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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Folder that = (Folder) o;
        return entries.equals(that.entries) && this.getName().equals(that.getName());
    }
}
