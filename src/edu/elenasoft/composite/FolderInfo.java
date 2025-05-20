package edu.elenasoft.composite;

import java.util.ArrayList;
import java.util.List;

public class FolderInfo implements FileSystemComponent{
    
    private String nombre;
    private  List<FileSystemComponent> fileSystemComponents;

    public FolderInfo(String nombre) {
        this.nombre = nombre;
        this.fileSystemComponents = new ArrayList<>();
    }

    public void add(FileSystemComponent fileSystemComponent) {
        this.fileSystemComponents.add(fileSystemComponent);
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent component : fileSystemComponents){
            totalSize = totalSize + component.getSize();
        }

        return totalSize;
    }

    @Override
    public void showDetails() {
        for (FileSystemComponent component : fileSystemComponents){
            component.showDetails();
        }
    
        System.out.println("Carpeta: " + nombre + ", Tamaño Total: " + getSize() + "KB");
    }

}
