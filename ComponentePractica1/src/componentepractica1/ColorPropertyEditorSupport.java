/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentepractica1;

import java.awt.Color;
import java.awt.Component;
import java.beans.PropertyEditorSupport;


public class ColorPropertyEditorSupport extends PropertyEditorSupport{

    
    
    private TonoPanel tonoPanel = new TonoPanel();
    
 
    @Override
    public boolean supportsCustomEditor() {
        return true;
    }
    
  
    @Override
    public Component getCustomEditor() {
        return tonoPanel;
    }
    

    @Override
    public String getJavaInitializationString() {
        Color texto = tonoPanel.getValue().getColorTexto();
        Color fondo = tonoPanel.getValue().getColorFondo();
      
         
        return "new Tono(" + "new Color(" + fondo.getRed() + "," +  fondo.getGreen() + ","  + fondo.getBlue()  + ")"
                +","+
                "new Color(" + texto.getRed() + "," +  texto.getGreen() + ","  + texto.getBlue() + ")" + ")";
    }
    

    @Override
    public Object getValue() {
        return tonoPanel.getValue();
    }

    
}
