package edu.elenasoft.composite;

public class LinkFile implements File{

    private final String name;
    private final String linkPath;
    
    public LinkFile(String name, String linkPath) {
        this.name = name;
        this.linkPath = linkPath;
    }

    @Override
    public void print() {
        System.out.printf("- %s (%s)%n", this.name, this.linkPath);
    }

}
