/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentepractica1;

import java.awt.Color;
import java.io.Serializable;


public class Tono implements Serializable {

    private Color colorFondo = new Color(0,0,0);
    private Color colorTexto = new Color(255,255,255);

    public Tono() {
    }

    public Tono(Color colorFondo, Color colorTexto) {
        this.colorFondo = colorFondo;
        this.colorTexto = colorTexto;
    }

    public Color getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
    }

    public Color getColorTexto() {
        return colorTexto;
    }

    public void setColorTexto(Color colorTexto) {
        this.colorTexto = colorTexto;
    }

    
    

}
