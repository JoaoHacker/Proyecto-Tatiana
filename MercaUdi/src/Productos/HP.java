/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;
import Tipos.ComputadoresTablets;
import Tipos.Tipo;
/**
 *
 * @author Tatiana
 */
public class HP extends Producto {
       public HP() 
       {
        Tipo ComputadoresTablets = new ComputadoresTablets();
        this.setAncho(95);
        this.setBajoPedido("no");
        this.setCantidad(5);
        this.setCantidadPermitida(1);
        this.setDescripcion("Computador portatil HP 15.6' Intel Core i3 15-BS010LA");
        this.setFabricante("HP");
        this.setGarantia(12);
        this.setId(2);
        this.setImagen("C:/Users/MAURICIO RUIZ/Dropbox/Proyecto final tatiana/MercaUdi/src/src/hp.jpg");
        this.setLargo(565);
        this.setNombre("Computador portatil HP");
        this.setNumSerie("004");
        this.setPais("USA");
        this.setPeso(7);
        this.setPrecio(1050000);
        //this.setProveedor(); falta proveedor
        this.setTipo(ComputadoresTablets);
    }
}
