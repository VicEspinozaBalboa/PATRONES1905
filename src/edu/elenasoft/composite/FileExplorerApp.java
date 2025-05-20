package edu.elenasoft.composite;

public class FileExplorerApp {

    public void print() {
      var rootDirectory = new Directory("root");
      var file0 = new FileLeaf("zero");
      rootDirectory.add(file0);
  
      var subDirectory = new Directory("subDirectory");
      var file1 = new FileLeaf("one");
      var file2 = new FileLeaf("two");
      subDirectory.add(file1);
      subDirectory.add(file2);
  
      var subSubDirectory = new Directory("subSubDirectory");
      subSubDirectory.add(new FileLeaf("extra"));
      subDirectory.add(subSubDirectory);
  
      rootDirectory.add(subDirectory);
      rootDirectory.add(new LinkFile("webfiles", "/var/www"));
  
      rootDirectory.print();
  
      subDirectory.print();
  
      file1.print();
    }
  }
