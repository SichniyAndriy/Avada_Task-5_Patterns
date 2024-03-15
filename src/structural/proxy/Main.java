package structural.proxy;

import structural.proxy.model.File;
import structural.proxy.model.RealFileProxy;

public class Main {
    public static void main(String[] args) {
        File file1 = new RealFileProxy("filename1");
        File file2 = new RealFileProxy("filename2");
        File file3 = new RealFileProxy("filename3");

        file1.display();
        file2.display();
        file3.display();
        file1.display();
        file2.display();
        file3.display();
    }
}
