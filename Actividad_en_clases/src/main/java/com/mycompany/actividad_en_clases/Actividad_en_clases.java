
package com.mycompany.actividad_en_clases;

import java.util.Scanner;

public class Actividad_en_clases {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Datos de la categoría
        System.out.print("ID de la categoria: ");
        int id = sc.nextInt();
        sc.nextLine(); // Limpiar buffer
        System.out.print("Nombre de la categoria: ");
        String nombreCategoria = sc.nextLine();

        Categoria categoria = new Categoria(id, nombreCategoria);

        // Datos del producto
        System.out.print("Codigo del producto: ");
        String codigo = sc.nextLine();
        System.out.print("Nombre del producto: ");
        String nombreProducto = sc.nextLine();
        System.out.print("Precio del producto: ");
        double precio = sc.nextDouble();

        Producto producto = new Producto(codigo, nombreProducto, precio, categoria);

        // Mostrar resumen
        System.out.println("Resumen del producto:");
        producto.mostrarResumen();
        
        sc.close();
    }
}
