/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author MAURICIO RUIZ
 */
public class Imagen extends JPanel {

    String ruta;

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Imagen(String ruta) {
        this.setSize(300, 400); //se selecciona el tamaño del panel
        this.setRuta(ruta);
    }

//Se crea un método cuyo parámetro debe ser un objeto Graphics
    public void paint(Graphics grafico) {
        Dimension height = getSize();

//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
System.out.println(ruta);
        ImageIcon Img = new ImageIcon(getClass().getResource(ruta));

//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
        grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

        setOpaque(false);
        super.paintComponent(grafico);
    }
}
