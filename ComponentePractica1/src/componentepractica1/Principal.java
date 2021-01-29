/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentepractica1;
import java.awt.Color;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;


public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        ponAyuda();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        componenteColor2 = new componentepractica1.ComponenteColor();
        componenteColor3 = new componentepractica1.ComponenteColor();
        componenteColor4 = new componentepractica1.ComponenteColor();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        componenteColor2.setText("2");
        componenteColor2.setTono(new Tono(new Color(0,0,0),new Color(0,0,0)));
        componenteColor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                componenteColor2KeyPressed(evt);
            }
        });

        componenteColor3.setText("3");
        componenteColor3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                componenteColor3KeyTyped(evt);
            }
        });

        componenteColor4.setText("4");
        componenteColor4.setTono(new Tono(new Color(0,0,255),new Color(255,0,0)));
        componenteColor4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                componenteColor4KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(componenteColor3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(componenteColor2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(componenteColor4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(componenteColor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(componenteColor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(componenteColor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void componenteColor2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_componenteColor2MouseClicked
       
    }//GEN-LAST:event_componenteColor2MouseClicked

    private void componenteColor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_componenteColor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_componenteColor2ActionPerformed

    private void componenteColor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_componenteColor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_componenteColor3ActionPerformed

    private void componenteColor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_componenteColor4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_componenteColor4ActionPerformed

    private void componenteColor4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_componenteColor4KeyPressed
          componenteColor4.setBackground(Color.BLUE);
         componenteColor4.setForeground(Color.BLACK);
    }//GEN-LAST:event_componenteColor4KeyPressed

    private void componenteColor3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_componenteColor3KeyTyped
         componenteColor3.setBackground(Color.RED);
         componenteColor3.setForeground(Color.GREEN);
    }//GEN-LAST:event_componenteColor3KeyTyped

    private void componenteColor2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_componenteColor2KeyPressed
           componenteColor2.setBackground(Color.YELLOW);
         componenteColor2.setForeground(Color.GRAY);
    }//GEN-LAST:event_componenteColor2KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
     private void ponAyuda(){
        try 
        {
         
            File fichero = new File("help"+File.separator+"help_set.hs");
            URL hsURL = fichero.toURI().toURL();

    
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();

     
          //f1
            hb.enableHelpKey(getRootPane(),"aplicacion",helpset);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentepractica1.ComponenteColor componenteColor2;
    private componentepractica1.ComponenteColor componenteColor3;
    private componentepractica1.ComponenteColor componenteColor4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
