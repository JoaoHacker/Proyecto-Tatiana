/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercaudi;

import Productos.Producto;
import java.util.ArrayList;

/**
 *
 * @author MAURICIO RUIZ
 */
public class Venta {
    
    int id;
    double subtotal,total, iva;

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
    Cliente cliente;
    String fecha, hora, estatus;
    private static ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    private static ArrayList<Integer> cantidadProductos = new ArrayList<Integer>();

    public static ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public static ArrayList<Integer> getCantidadProductos() {
        return cantidadProductos;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    
    
    
}
