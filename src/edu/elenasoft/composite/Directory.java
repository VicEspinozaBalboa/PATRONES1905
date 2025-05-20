package edu.elenasoft.composite;

import java.util.ArrayList;
import java.util.List;

// Composite
public class Directory implements File {

  private final String name;
  // Leaf
  private final List<File> files;

  public Directory(String name) {
    this.name = name;
    this.files = new ArrayList<>();
  }

  public void add(File file) {
    this.files.add(file);
  }

  @Override
  public void print() {
    System.out.println("+ " + name);
    this.files.forEach(File::print);
  }
}
