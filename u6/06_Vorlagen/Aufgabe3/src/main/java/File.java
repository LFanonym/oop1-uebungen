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
}
