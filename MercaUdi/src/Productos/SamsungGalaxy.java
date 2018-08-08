package Productos;

import Tipos.Celulares;
import Tipos.Tipo;
/**
 *
 * @author MAURICIO RUIZ
 */


public class SamsungGalaxy extends Producto {
   public SamsungGalaxy ()
           {
             Tipo Celulares = new Celulares();
        this.setAncho(95);
        this.setBajoPedido("no");
        this.setCantidad(5);
        this.setCantidadPermitida(1);
        this.setDescripcion("Telefono celular Samsung Galaxy  S6");
        this.setFabricante("Samsung");
        this.setGarantia(12);
        this.setId(2);
        this.setImagen("/src/GALAXY.jpg");
        this.setLargo(565);
        this.setNombre("Telefono celular Samsung Galaxy S6");
        this.setNumSerie("004");
        this.setPais("Corea del Sur y Seul");
        this.setPeso(7);
        this.setPrecio(1100000);
        //this.setProveedor(); falta proveedor
        this.setTipo(Celulares);
}
}
