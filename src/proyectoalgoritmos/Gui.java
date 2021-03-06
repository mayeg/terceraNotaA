package proyectoalgoritmos;

import java.io.File;
import javax.swing.JFileChooser;
import proyectoalgoritmos.Negocio;

/**
 *
 * @author Alejandra Bohorquez 1151109
 */
public class Gui extends javax.swing.JFrame {

    private Negocio negocio;

    public Gui() {
        initComponents();
        this.negocio = new Negocio();
        this.setTitle("Tercera Nota");
        this.setLocationRelativeTo(null);
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
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrar = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        secuenciaMayor2 = new javax.swing.JButton();
        secuenciaCero = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        secuenciaMayor1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 148, 488, 10));

        mostrar.setColumns(20);
        mostrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mostrar.setRows(5);
        jScrollPane1.setViewportView(mostrar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 164, 488, 120));

        jLabel1.setFont(new java.awt.Font("Raavi", 1, 18)); // NOI18N
        jLabel1.setText("ANALISIS DE ALGORITMOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Aharoni", 1, 12)); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 69, -1, -1));

        jLabel3.setFont(new java.awt.Font("Aharoni", 1, 12)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 110, -1, -1));

        secuenciaMayor2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        secuenciaMayor2.setText("Hallar la Subsecuencia mas larga RECURSIVA");
        secuenciaMayor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secuenciaMayor2ActionPerformed(evt);
            }
        });
        jPanel1.add(secuenciaMayor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 310, -1));

        secuenciaCero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        secuenciaCero.setText("Hallar las Subsecuencias sum-zero");
        secuenciaCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secuenciaCeroActionPerformed(evt);
            }
        });
        jPanel1.add(secuenciaCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 120, 310, -1));

        salir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 0, -1, -1));

        secuenciaMayor1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        secuenciaMayor1.setText("Hallar la Subsecuencia mas larga ITERATIVA");
        secuenciaMayor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secuenciaMayor1ActionPerformed(evt);
            }
        });
        jPanel1.add(secuenciaMayor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 310, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void secuenciaMayor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secuenciaMayor2ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser(".");
        int status = fileChooser.showOpenDialog(null);// Da un entero
        // Si apretamos en aceptar ocurrirá esto
        if (status == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String ruta = selectedFile.getPath();
            String resultado = this.negocio.hallarSubsecuenciaLargaRecursiva(ruta);
            this.mostrar.setText(resultado);
            // Si apretamos en cancelar o cerramos la ventana ocurrirá esto
        } else if (status == JFileChooser.CANCEL_OPTION) {
            this.mostrar.setText("No ha escogido Archivo.");
        }
        this.negocio = new Negocio();

    }//GEN-LAST:event_secuenciaMayor2ActionPerformed

    private void secuenciaCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secuenciaCeroActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser(".");
        int status = fileChooser.showOpenDialog(null);// Da un entero
        // Si apretamos en aceptar ocurrirá esto
        if (status == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String ruta = selectedFile.getPath();
            String resultado = this.negocio.hallarSubsecuenciaCero(ruta);
            this.mostrar.setText(resultado);
            // Si apretamos en cancelar o cerramos la ventana ocurrirá esto
        } else if (status == JFileChooser.CANCEL_OPTION) {
            this.mostrar.setText("No ha escogido Archivo.");
        }
        this.negocio = new Negocio();

    }//GEN-LAST:event_secuenciaCeroActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void secuenciaMayor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secuenciaMayor1ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser(".");
        int status = fileChooser.showOpenDialog(null);// Da un entero
        // Si apretamos en aceptar ocurrirá esto
        if (status == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String ruta = selectedFile.getPath();
            String resultado = this.negocio.hallarSubsecuenciaLargaIterativa(ruta);
            this.mostrar.setText(resultado);
            // Si apretamos en cancelar o cerramos la ventana ocurrirá esto
        } else if (status == JFileChooser.CANCEL_OPTION) {
            this.mostrar.setText("No ha escogido Archivo.");
        }
        this.negocio = new Negocio();
    }//GEN-LAST:event_secuenciaMayor1ActionPerformed

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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea mostrar;
    private javax.swing.JButton salir;
    private javax.swing.JButton secuenciaCero;
    private javax.swing.JButton secuenciaMayor1;
    private javax.swing.JButton secuenciaMayor2;
    // End of variables declaration//GEN-END:variables
}
