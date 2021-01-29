/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentepractica1;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.JTextField;


public class ComponenteColor extends JTextField implements Serializable{
    private Tono tono;
    
        public ComponenteColor() {
    }
    

    public Tono getTono() {
        return tono;
    }

    public void setTono(Tono tono) {
        this.tono = tono;
    }

 
}
