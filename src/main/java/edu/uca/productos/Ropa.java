package edu.uca.productos;

public class Ropa extends Productos {
    private int talle;
    private String marca;

    public Ropa(int id, String nombre, double precio, int talle, String marca) {
        super(id, nombre, precio);
        this.talle = talle;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return super.toString() + ", talle: " + talle + ", marca: " + marca + "}";
    }
}