package com.delivery_trouble.Pedido;

import java.util.Queue;

import com.delivery_trouble.Calificacion.Calificacion;
import com.delivery_trouble.Factura.Factura;
import com.delivery_trouble.Precio.Precio;
import com.delivery_trouble.Producto.Producto;
import com.delivery_trouble.Restaurante.Restaurante;

public class Pedido {
    private String cliente;
    private Restaurante restaurante;
    private Queue<Producto> productos;
    private Factura factura;
    private Precio precio;
    private boolean pedidoFinalizado;
    private Calificacion calificacion;


    public Pedido(String cliente){
        this.cliente = cliente;     
    }

    public Pedido(){
    }

    public String getCliente(){
        return cliente;
    }
    
    public String visualizarPedido(){
        return null;
    }
    
    public void agregarProducto(){
        
    }
    
    public void personalizarProducto(){
        
    }
    
    public void agregarCombo(){
        
    }
    
    public void finalizarPedido(Calificacion calificacionUsuario){
        pedidoFinalizado = true;
        calificacion = calificacionUsuario;
    }

    public Calificacion getCalificacion(){
        return calificacion;
    }
}
