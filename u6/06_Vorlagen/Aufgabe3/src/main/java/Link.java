public class Link extends  FilesystemElement {
    private static int LINK_SIZE = 4000;
    private FilesystemElement target;

    public Link(String name, FilesystemElement target) {
        super(name);
        this.target = target;
    }

    public long getSize() {
        return LINK_SIZE;
    }

    public FilesystemElement getTarget() {
        return this.target;
    }
}
