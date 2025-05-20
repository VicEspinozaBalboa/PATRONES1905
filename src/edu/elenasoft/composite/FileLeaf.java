package edu.elenasoft.composite;

public class FileLeaf implements File {

    private final String name;
    
    public FileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("- " + name);
    }

}
