package org.CS5800.Composition;
class File {
    private String name;
    public File(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println("File: " + name);
    }
}