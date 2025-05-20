package edu.elenasoft.composite;

public class FileInfo implements FileSystemComponent{
    private  String nombre;
    private  int tamaño;

    public FileInfo(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamaño() {
        return tamaño;
    }
    
    @Override
    public int getSize() {
        return tamaño;
    }

    @Override
    public void showDetails() {
        System.out.println("Archivo: " + nombre + ", Tamaño: " + tamaño + "KB");
    }
}
