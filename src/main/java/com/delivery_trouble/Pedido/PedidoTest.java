package com.delivery_trouble.Pedido;

import static org.junit.Assert.assertTrue;
import org.junit.*;
import com.delivery_trouble.Calificacion.Calificacion;

public class PedidoTest {
    
    /*@BeforeClass
    public void setup(){
        @SuppressWarnings("unused")
        Pedido pedido = new Pedido();
    }*/

    @Test
public void testCalificacion() {
    // Arrange
    Pedido pedido = new Pedido("Felipe");
    Calificacion calificacionTest = new Calificacion(4.5, "Muy buen lugar");

    // Act
    pedido.finalizarPedido(calificacionTest);
    double calificacion = pedido.getCalificacion().getEstrellas();

    // Assert
    assertTrue(calificacion == 4.5);
}
}
