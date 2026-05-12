package com.cuatrovientos.factura;
import java.util.Vector;

public class Factura {
	private Vector<Producto> productos;

    public Factura() {
        this.productos = new Vector<>();
    }


    public void meterProducto(Producto p) {
        productos.add(p);
    }

    public float totalFactura() {
        float total = 0f;
        for (Producto p : productos) {
            total += p.precioTotal();
        }
        return total;
    }

    public float aplicarIva(float iva) {
        return totalFactura() * (1 + iva);
    }

    public Vector<Producto> getProductos() {
        return productos;
    }
}
