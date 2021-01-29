/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentepractica1;

import java.awt.Color;
import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author Dams2
 */
public class ColorPropertyEditorSupport extends PropertyEditorSupport{

    
    
    private TonoPanel tonoPanel = new TonoPanel();
    
    /**
     * Este método tiene que devolver true siempre si queremos que haya un editor
     * de propiedades personalizado
     * @return true
     */
    @Override
    public boolean supportsCustomEditor() {
        return true;
    }
    
    /**
     * Este método devuelve una instancia del panel a mostrar.
     * @return panel a mostrar
     */
    @Override
    public Component getCustomEditor() {
        return tonoPanel;
    }
    
    
    /**
     * En este método nos tenemos que arreglar para devolver un string que inicialize
     * la propiedad y que irá insertado en el setter dentro del initcomponents.
     * @return un string con la propiedad inicializada
     */
    @Override
    public String getJavaInitializationString() {
        Color texto = tonoPanel.getValue().getColorTexto();
        Color fondo = tonoPanel.getValue().getColorFondo();
      
         
        return "new Tono(" + "new Color(" + fondo.getRed() + "," +  fondo.getGreen() + ","  + fondo.getBlue()  + ")"
                +","+
                "new Color(" + texto.getRed() + "," +  texto.getGreen() + ","  + texto.getBlue() + ")" + ")";
    }
    
     /**
     * Recuperamos el valor del panel y lo devolvemos.
     * @return 
     */
    @Override
    public Object getValue() {
        return tonoPanel.getValue();
    }

    
}
