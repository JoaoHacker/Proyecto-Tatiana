/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import Tipos.Celulares;
import Tipos.Tipo;

/**
 *
 * @author MAURICIO RUIZ
 */
public class MotoG extends Producto{
    
    public MotoG() {
        Tipo Celulares = new Celulares();
        this.setAncho(5);
        this.setBajoPedido("no");
        this.setCantidad(5);
        this.setCantidadPermitida(1);
        this.setDescripcion("Es la nueva apuesta de Motorola para lograr el balance ideal entre precio y prestaciones. Con precios que arrancan desde los 180 dólares, el Moto G ofrece una pantalla 720p de 4.5 pulgadas");
        this.setFabricante("Motorola");
        this.setGarantia(12);
        this.setId(2);
        this.setImagen("C:/Users/MAURICIO RUIZ/Dropbox/Proyecto final tatiana/MercaUdi/src/src/Moto G.jpg");
        this.setLargo(10);
        this.setNombre("Moto G");
        this.setNumSerie("009");
        this.setPais("USA");
        this.setPeso(8);
        //this.setProveedor(); falta proveedor
        this.setTipo(Celulares);

    }
    
}
