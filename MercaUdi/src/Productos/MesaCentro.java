/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import Tipos.Hogar;
import Tipos.Tipo;

/**
 *
 * @author Tatiana
 */
public class MesaCentro extends Producto{
    public MesaCentro() 
       {
        Tipo Hogar = new Hogar();
        this.setAncho(95);
        this.setBajoPedido("no");
        this.setCantidad(5);
        this.setCantidadPermitida(1);
        this.setDescripcion("Mesa de centro Amaretto  ");
        this.setFabricante("Falabella");
        this.setGarantia(12);
        this.setId(2);
        this.setImagen("C:/Users/MAURICIO RUIZ/Dropbox/Proyecto final tatiana/MercaUdi/src/src/mesacentro.jpg");
        this.setLargo(565);
        this.setNombre("Mesa centro ");
        this.setNumSerie("004");
        this.setPais("Colombia");
        this.setPeso(7);
        this.setPrecio(500000);
        //this.setProveedor(); falta proveedor
        this.setTipo(Hogar);
       }
}
