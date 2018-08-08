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
 * @author MAURICIO RUIZ
 */
public class Asus extends Producto{
    

    
    public Asus() {
        Tipo ComputadoresTablets = new ComputadoresTablets();
        this.setAncho(95);
        this.setBajoPedido("no");
        this.setCantidad(5);
        this.setCantidadPermitida(1);
        this.setDescripcion("Computador portatil Asus X555yi-x0103 Amd A8-7410");
        this.setFabricante("Asus");
        this.setGarantia(12);
        this.setId(2);
        this.setImagen("C:/Users/MAURICIO RUIZ/Dropbox/Proyecto final tatiana/MercaUdi/src/src/asus.jpg");
        this.setLargo(565);
        this.setNombre("Computador portatil Asus");
        this.setNumSerie("004");
        this.setPais("Corea del Sur");
        this.setPeso(7);
        this.setPrecio(1550000);
        //this.setProveedor(); falta proveedor
        this.setTipo(ComputadoresTablets);

    }
}

    

