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
public class LGSmartTV extends Producto{
    
    public LGSmartTV(){
        Tipo tv = new TelevisoresVideo();
        this.setAncho(926);
        this.setBajoPedido("no");
        this.setCantidad(5);
        this.setCantidadPermitida(1);
        this.setDescripcion("Televisor LG Smart TV de 48 pulgadas");
        this.setFabricante("LG");
        this.setGarantia(12);
        this.setId(2);
        this.setImagen("C:/Users/MAURICIO RUIZ/Dropbox/Proyecto final tatiana/MercaUdi/src/src/LG Smart TV.jpg");
        this.setLargo(565);
        this.setNombre("TV LG Smart TV");
        this.setNumSerie("002");
        this.setPais("Corea del Sur");
        this.setPeso(6);
       //this.setProveedor(); falta proveedor
        this.setTipo(tv);
        
    }
    
}

