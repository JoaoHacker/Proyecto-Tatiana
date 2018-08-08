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
public class HornoMicroondas extends Producto{
    public HornoMicroondas() 
       {
        Tipo ElectroHogar = new ElectroHogar();
        this.setAncho(95);
        this.setBajoPedido("no");
        this.setCantidad(5);
        this.setCantidadPermitida(1);
        this.setDescripcion("Horno microondas Whirpool ");
        this.setFabricante("Whirlpool");
        this.setGarantia(12);
        this.setId(2);
        this.setImagen("C:/Users/MAURICIO RUIZ/Dropbox/Proyecto final tatiana/MercaUdi/src/src/hornomicroondas.jpg");
        this.setLargo(565);
        this.setNombre("Hornomicroondas ");
        this.setNumSerie("004");
        this.setPais("USA");
        this.setPeso(7);
        this.setPrecio(300000);
        //this.setProveedor(); falta proveedor
        this.setTipo(ElectroHogar);
       }
}
