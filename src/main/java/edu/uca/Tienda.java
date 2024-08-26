package edu.uca;

import edu.uca.productos.Productos;
import edu.uca.productos.Ropa;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Productos> inventario = new ArrayList<>();

    public int getSize(){
        return inventario.size();
    }

    public void agregarProducto(Productos producto) {
        inventario.add(producto);
    }

    public void agregarRopa(Ropa ropa){
        inventario.add(ropa);
    }

    public void mostrarInventario() {
        System.out.println("Inventario: ");
        for (Producto producto : inventario) {
            System.out.println(producto);
        }

    }

}
