/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Archivos;
import Clases.Operacion;
import Estructuras.Cola;
import Estructuras.Pila;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Rodrigo
 */
public class Ventana extends javax.swing.JFrame {

        Operacion o=new Operacion();
        Archivos ar = new Archivos();
        String signo="";
        int a=0;
        int b=0;
        int contador=0;
        int cont=-1;
        int con=0;
        int cont1=-1;
        int resultado=0;
        Pila<String> pila = new Pila();
        Pila<String> pila1 = new Pila();
        Pila<String> pila2 = new Pila();
        Pila<String> pila3 = new Pila();
        Pila<String> pila4 = new Pila();
        Cola<Object> cola = new Cola();
        File archivo;
        JFileChooser seleccion = new JFileChooser();
    
    public Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cargar Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reporte HTML");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Reporte Personalizado");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (seleccion.showDialog(null, null)==JFileChooser.APPROVE_OPTION) {
            archivo=seleccion.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt"));
                    String direccion=archivo.getAbsolutePath();
                    String entrada = ar.abrirArchivo(direccion);
                    String[] result = entrada.split(",");
                    
                    con=result.length;
                    
                    while(con>0){
                        con--;
                        cont++;
                        String nu = result[cont];
                        
                        if (!Archivos.isNumeric(nu)) {
                            if (result[cont].equals("+")|| result[cont].equals("-") || result[cont].equals("*") || result[cont].equals("/")) {
                                
                            }else{
                                cola.Queue(nu);
                                cont1++;
                                if (cont1>0) {
                                    cola.Queue(pila.Pop());
                                }
                            }
                        }
                        if (!result[cont].equals("+") || !result[cont].equals("-") || !result[cont].equals("*") || !result[cont].equals("/")) {
                            pila.Push(result[cont]);
                        }
                        
                        if (result[cont].equals("+")) {
                            signo = pila.Pop();
                            b = Integer.parseInt(pila.Pop());
                            a = Integer.parseInt(pila.Pop());
                            resultado = o.Ope(a, b, signo);
                            pila.Push(Integer.toString(resultado));
                        }
                        if (result[cont].equals("-")) {
                            signo = pila.Pop();
                            b = Integer.parseInt(pila.Pop());
                            a = Integer.parseInt(pila.Pop());
                            resultado = o.Ope(a, b, signo);
                            pila.Push(Integer.toString(resultado));
                        }
                        if (result[cont].equals("*")) {
                            signo = pila.Pop();
                            b = Integer.parseInt(pila.Pop());
                            a = Integer.parseInt(pila.Pop());
                            resultado = o.Ope(a, b, signo);
                            pila.Push(Integer.toString(resultado));
                        }
                        if (result[cont].equals("/")) {
                            signo = pila.Pop();
                            b = Integer.parseInt(pila.Pop());
                            a = Integer.parseInt(pila.Pop());
                            resultado = o.Ope(a, b, signo);
                            pila.Push(Integer.toString(resultado));
                        }
                        
                        
                        
                    }
            }else{
            }
        }
        //System.out.println(pila.Peek());
        //System.out.println(pila.toString());
        //System.out.println(cola.toString());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ar.crearArchivoPlano(cola.toString());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ar.crearArchivoPlano1(o.ToHTML());
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
