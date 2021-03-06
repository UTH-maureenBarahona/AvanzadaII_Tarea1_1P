/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.tarea1_1p.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author maureen
 */
public class pnlRetiros extends javax.swing.JPanel {

    /**
     * Creates new form pnlRetiros
     */
    Ferreteria ferre;
    int contador = 0;

    public pnlRetiros(Ferreteria ferre) {
        initComponents();

        if (ferre.cm.getCantRetiros() > 0) {
            contador = ferre.cm.getCantRetiros();
        }
        this.ferre = ferre;
        jTxtRetiro.setText(0 + "");
        jblCapacidadLibre.setText((((ferre.cm.getCantMaxCemento() - ferre.cm.getIngresoCemento()) + ferre.cm.getRetiroCemento()) + ""));
        jlbInventarioActual.setText(ferre.cm.getInventario() + "");
        jLabel5.setText(ferre.cm.getCantRetiros() + "");

    }

    public pnlRetiros() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTxtRetiro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlbInventarioActual = new javax.swing.JLabel();
        jblCapacidadLibre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(208, 194, 194));

        jLabel1.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel1.setText("Retiro");

        jLabel2.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        jLabel2.setText("Cantidad de Bolsas a retirar:");

        jTxtRetiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtRetiroKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-guardar-16.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        jLabel3.setText("Inventario actual del almacen: ");

        jLabel4.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        jLabel4.setText("Capacidad libre del almacen:");

        jlbInventarioActual.setText("jLabel5");

        jblCapacidadLibre.setText("jLabel6");

        jLabel5.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTxtRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlbInventarioActual, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                    .addComponent(jblCapacidadLibre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTxtRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlbInventarioActual))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jblCapacidadLibre))
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTxtRetiroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtRetiroKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_jTxtRetiroKeyTyped

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (Integer.parseInt(jTxtRetiro.getText()) > 0) {
            if (ferre.cm.getInventario() < Integer.parseInt(jTxtRetiro.getText())) {
                JOptionPane.showMessageDialog(null, "No se puede retirar mas de lo que esta en existencia", "Almacen Vacio",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {

                ferre.cm.setRetiroCemento(Integer.parseInt(jTxtRetiro.getText()));

                contador++;
                ferre.cm.setCantRetiros(contador);
                ferre.cm.setInventario(ferre.cm.getInventario() - ferre.cm.getRetiroCemento());
                jlbInventarioActual.setText(ferre.cm.getInventario() + "");

                jLabel5.setText(ferre.cm.getCantRetiros() + "");

                jblCapacidadLibre.setText((((ferre.cm.getCantMaxCemento() - ferre.cm.getIngresoCemento()) + ferre.cm.getRetiroCemento()) + ""));
            }

        }
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTxtRetiro;
    private javax.swing.JLabel jblCapacidadLibre;
    private javax.swing.JLabel jlbInventarioActual;
    // End of variables declaration//GEN-END:variables
}
