package com.cuatrovientos.factura;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class ProductoTest {
	private static final float DELTA = 0.0001f;
    @Test
    void testNuevo() {
        Producto p = new Producto("pan", 0.50f, 1);

        assertEquals("pan", p.getNombre());
        assertEquals(0.50f, p.getPrecio(), DELTA);
        assertEquals(1, p.getCantidad());
    }

    @Test
    void testPrecioTotal() {
        // 3 panes a 0.50 € = 1.50 €
        Producto p = new Producto("pan", 0.50f, 3);
        assertEquals(1.50f, p.precioTotal(), DELTA);

        // 5 leches a 1.20 € = 6.00 €
        Producto leche = new Producto("leche", 1.20f, 5);
        assertEquals(6.00f, leche.precioTotal(), DELTA);
    }
}
