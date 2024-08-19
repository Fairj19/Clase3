package edu.uca.productos;

public abstract class Productos {
    private int id;
    private String nombre;
    private double precio;

    public Productos(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    public double getPrecioFinal() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{id=" + id + ", nombre='" + nombre + "', precio=" + precio;
    }


}
