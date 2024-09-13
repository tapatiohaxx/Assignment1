package org.CS5800.Composition;
public class FileSystemTest {
    public static void main(String[] args) {
        Folder php_demo1 = new Folder("php_demo1");
        Folder sourceFiles = new Folder("Source Files");
        Folder app = new Folder("app");
        Folder publicFolder = new Folder("public");
        File extraPHPFile = new File("index.php");
        File extraCSSFile = new File("style.css");
        php_demo1.addFolder(sourceFiles);
        php_demo1.addFolder(app);
        php_demo1.addFolder(publicFolder);
        sourceFiles.addFile(extraPHPFile);
        publicFolder.addFile(extraCSSFile);
        System.out.println("Initial structure:");
        php_demo1.print();
        php_demo1.deleteFolder("app");
        System.out.println("\nAfter deleting the 'app' folder:");
        php_demo1.print();
        php_demo1.deleteFolder("public");
        System.out.println("\nAfter deleting the 'public' folder:");
        php_demo1.print();
    }
}