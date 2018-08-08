/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import Tipos.Audio;
import Tipos.Tipo;

/**
 *
 * @author MAURICIO RUIZ
 */
public class TeatroKalley extends Producto {
    
    private static TeatroKalley instance = new TeatroKalley();

    public static TeatroKalley getInstance() {
        return instance;
    }

    public TeatroKalley() {
        Tipo audio = new Audio();
        this.setAncho(29);
        this.setBajoPedido("no");
        this.setCantidad(5);
        this.setCantidadPermitida(1);
        this.setDescripcion("Teatro en casa Kalley K-APT38NBT 2.1");
        this.setFabricante("Kalley");
        this.setGarantia(12);
        this.setId(3);
        this.setImagen("/src/Teatro Kalley.jpg");
        this.setLargo(40);
        this.setNombre("Teatro en casa Kalley");
        this.setNumSerie("003");
        this.setPais("Colombia");
        this.setPeso(10);
        //this.setProveedor(); falta proveedor
        this.setTipo(audio);

    }
}
