import edu.uca.productos.Productos;
import edu.uca.Tienda;
import edu.uca.productos.Ropa;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void productToStringTest(){
        Ropa ropa = new Ropa(1, "producto de prueba", 200, 2, "Lacoste");
        System.out.println(ropa);
    }

//    @Test
//    public void tiendaAgregarProductoTest(){
//        Tienda tienda = new Tienda();
//        Productos producto = new Productos(1, "producto de prueba", 200);
//        tienda.agregarProducto(producto);
//        Assert.assertEquals(tienda.getSize(), 1);
//    }
//
//    @Test
//    public void mostrarInventarioTest(){
//        Tienda tienda = new Tienda();
//        Productos producto = new Productos(1, "producto de prueba", 200);
//        tienda.agregarProducto(producto);
//        tienda.mostrarInventario();
//    }
}
