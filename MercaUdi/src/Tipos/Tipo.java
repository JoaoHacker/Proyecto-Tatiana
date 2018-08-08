/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tipos;

/**
 *
 * @author MAURICIO RUIZ
 */
public abstract class Tipo {
    
    String nombre, descripcion;
    double importeIVA;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getImporteIVA() {
        return importeIVA;
    }

    public void setImporteIVA(double importeIVA) {
        this.importeIVA = importeIVA;
    }
    
    
}
