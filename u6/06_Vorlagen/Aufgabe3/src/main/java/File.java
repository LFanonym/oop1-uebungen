import java.util.Objects;

public class File extends FilesystemElement {
    private long size;

    public File(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public long getSize() {
        return this.size;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return size == file.size && this.getName().equals(file.getName());
    }
}
