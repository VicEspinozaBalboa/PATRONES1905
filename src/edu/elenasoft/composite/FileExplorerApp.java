package edu.elenasoft.composite;

public class FileExplorerApp {

    public void print() {
      /* 
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
      */

      //KATA 1
      FileInfo  file1 = new FileInfo("file1.txt", 10);
      FileInfo  file2 = new FileInfo("file2.txt", 20);
      FileInfo  file3 = new FileInfo("file3.txt", 20);

      FolderInfo folder1 = new FolderInfo("Folder");
      folder1.add(file1);
      folder1.add(file2);
      folder1.add(file3);


      folder1.showDetails();

      //KATA 3
      Employee employe1 = new IndividualEmployee("Pedro", 1000);
      Employee  employe2 = new IndividualEmployee("Juan", 2000);

      Manager manager1 = new Manager("Alicia");
      manager1.add(employe1);
      manager1.add(employe2);

      manager1.showDetails();

    }
  }
