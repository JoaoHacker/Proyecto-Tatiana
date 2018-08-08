/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import Tipos.TelevisoresVideo;
import Tipos.Tipo;

/**
 *
 * @author MAURICIO RUIZ
 */
public class SonyBravia extends Producto{
    
    public SonyBravia(){
        Tipo tv = new TelevisoresVideo();
        this.setAncho(923);
        this.setBajoPedido("no");
        this.setCantidad(5);
        this.setCantidadPermitida(1);
        this.setDescripcion("Televisor Sony Bravia de 48 pulgadas");
        this.setFabricante("Sony");
        this.setGarantia(12);
        this.setId(1);
        this.setImagen("C:/Users/MAURICIO RUIZ/Dropbox/Proyecto final tatiana/MercaUdi/src/src/SonyBravia.jpg");
        this.setLargo(567);
        this.setNombre("TV Sony Bravia");
        this.setNumSerie("001");
        this.setPais("USA");
        this.setPeso(6);
       //this.setProveedor(); falta proveedor
        this.setTipo(tv);
        
    }
    
}
