
package com.mycompany.actividad_en_clases;

public class Categoria {
    private int id;
    private String nombre;

    public Categoria(int id, String nombre) {
        setId(id);
        setNombre(nombre);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la categoría no puede estar vacío.");
        }
        this.nombre = nombre;
    }
}
