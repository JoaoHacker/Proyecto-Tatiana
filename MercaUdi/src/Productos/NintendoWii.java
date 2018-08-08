/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;
import Tipos.Videojuegos;
import Tipos.Tipo;

/**
 *
 * @author Tatiana
 */
public class NintendoWii extends Producto {
    public NintendoWii() 
       {
        Tipo Videojuegos = new Videojuegos();
        this.setAncho(95);
        this.setBajoPedido("no");
        this.setCantidad(5);
        this.setCantidadPermitida(1);
        this.setDescripcion("Videojuego Nintendo Wii");
        this.setFabricante("Nintendo");
        this.setGarantia(12);
        this.setId(2);
        this.setImagen("C:/Users/MAURICIO RUIZ/Dropbox/Proyecto final tatiana/MercaUdi/src/src/XboxOne.jpg");
        this.setLargo(565);
        this.setNombre("Wii ");
        this.setNumSerie("004");
        this.setPais("Japon");
        this.setPeso(7);
        this.setPrecio(1100000);
        //this.setProveedor(); falta proveedor
        this.setTipo(Videojuegos);
    }
}
