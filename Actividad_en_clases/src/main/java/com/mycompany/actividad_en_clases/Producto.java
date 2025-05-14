package com.mycompany.actividad_en_clases;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private Categoria categoria;

    public Producto(String codigo, String nombre, double precio, Categoria categoria) {
        setCodigo(codigo);
        setNombre(nombre);
        setPrecio(precio);
        setCategoria(categoria);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que 0.");
        }
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        if (categoria == null) {
            throw new IllegalArgumentException("El producto debe tener una categoría.");
        }
        this.categoria = categoria;
    }

    // Método adicional: mostrarResumen
    public void mostrarResumen() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Categoría: " + categoria.getNombre());
    }
}