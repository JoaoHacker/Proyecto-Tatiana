/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import Tipos.ElectroHogar;
import Tipos.Tipo;

/**
 *
 * @author Tatiana
 */
public class Nevera extends Producto{
     public Nevera() 
       {
        Tipo ElectroHogar = new ElectroHogar();
        this.setAncho(95);
        this.setBajoPedido("no");
        this.setCantidad(5);
        this.setCantidadPermitida(1);
        this.setDescripcion("Nevera Challenger  ");
        this.setFabricante("Challenger");
        this.setGarantia(12);
        this.setId(2);
        this.setImagen("C:/Users/MAURICIO RUIZ/Dropbox/Proyecto final tatiana/MercaUdi/src/src/nevera.jpg");
        this.setLargo(565);
        this.setNombre("Nevera ");
        this.setNumSerie("004");
        this.setPais("Colombia");
        this.setPeso(7);
        this.setPrecio(1000000);
        //this.setProveedor(); falta proveedor
        this.setTipo(ElectroHogar);
       }
}
