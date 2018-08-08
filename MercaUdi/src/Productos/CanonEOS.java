/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import Tipos.Camaras;
import Tipos.Tipo;

/**
 *
 * @author MAURICIO RUIZ
 */
public class CanonEOS extends Producto{
    
    public CanonEOS(){
       Tipo camara = new Camaras();
        this.setAncho(10);
        this.setBajoPedido("no");
        this.setCantidad(5);
        this.setCantidadPermitida(1);
        this.setDescripcion("Cámara digital, réflex de lente único AF/AE, con flash integrado");
        this.setFabricante("Canon");
        this.setGarantia(12);
        this.setId(6);
        this.setImagen("C:/Users/MAURICIO RUIZ/Dropbox/Proyecto final tatiana/MercaUdi/src/src/CamaraNikon.jpg");
        this.setLargo(12);
        this.setNombre("Camara Canon EOS");
        this.setNumSerie("007");
        this.setPais("Japon");
        this.setPeso(7);
       //this.setProveedor(); falta proveedor
        this.setTipo(camara);
        
    }
    
}
