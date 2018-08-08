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
public class BarraDeSonidoLG extends Producto{

    private static BarraDeSonidoLG b = new BarraDeSonidoLG();

    public static BarraDeSonidoLG getB() {
        return b;
    }

    
    private BarraDeSonidoLG() {
        Tipo audio = new Audio();
        this.setAncho(95);
        this.setBajoPedido("no");
        this.setCantidad(5);
        this.setCantidadPermitida(1);
        this.setDescripcion("Barra de sonido LG 4K - 2.1 Ch SJ5\n SJ5");
        this.setFabricante("LG");
        this.setGarantia(12);
        this.setId(2);
        this.setImagen("/src/BarraDeSonidoLG.jpg");
        this.setLargo(565);
        this.setNombre("Barra de Sonido LG");
        this.setNumSerie("004");
        this.setPais("Corea del Sur");
        this.setPeso(7);
        this.setPrecio(450000);
        //this.setProveedor(); falta proveedor
        this.setTipo(audio);

    }
}
