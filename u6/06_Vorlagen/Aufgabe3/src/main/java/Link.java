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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Link that = (Link) o;
        return this.target.equals(that.getTarget()) && this.getName().equals(that.getName());
    }
}
