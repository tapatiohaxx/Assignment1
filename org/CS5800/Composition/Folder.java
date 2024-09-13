package org.CS5800.Composition;
import java.util.ArrayList;
import java.util.List;
class Folder {
    private String name;
    private List<Folder> subFolders;
    private List<File> files;

    public Folder(String name) {
        this.name = name;
        this.subFolders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addFile(File file) {
        files.add(file);
    }
    public void addFolder(Folder folder) {
        subFolders.add(folder);
    }
    public void deleteFolder(String folderName) {
        subFolders.removeIf(folder -> folder.getName().equals(folderName));
    }
    public void print() {
        System.out.println("Folder: " + name);
        for (File file : files)
            file.print();
        for (Folder folder : subFolders)
            folder.print();

    }
}