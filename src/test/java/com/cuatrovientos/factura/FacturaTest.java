package com.cuatrovientos.factura;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class FacturaTest {
	private static final float DELTA = 0.0001f;

    private Factura factura;

    @BeforeEach
    void setUp() {
        factura = new Factura();
        factura.meterProducto(new Producto("pan",    0.50f, 2));
        factura.meterProducto(new Producto("leche",  1.20f, 3));
        factura.meterProducto(new Producto("huevos", 2.00f, 1));
    }

    @Test
    void testTotalFactura() {
        assertEquals(6.60f, factura.totalFactura(), DELTA);
    }

    @Test
    void testAplicarIva() {
        assertEquals(7.986f, factura.aplicarIva(0.21f), DELTA);

        assertEquals(7.26f, factura.aplicarIva(0.10f), DELTA);
    }
}
