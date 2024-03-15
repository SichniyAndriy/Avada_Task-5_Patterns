package structural.proxy.model;

public class RealFileProxy implements File {
    private final String name;
    private RealFile realFile;

    public RealFileProxy(String fileName) {
        this.name = fileName;
    }

    @Override
    public void display() {
        if (realFile == null) {
            realFile = new RealFile(name);
        }
        realFile.display();
    }
}
