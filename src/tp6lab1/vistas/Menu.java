/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp6lab1.vistas;

import java.util.TreeSet;
import tp6lab1.Entidades.Producto;

/**
 *
 * @author IGNACIO
 */
public class Menu extends javax.swing.JFrame {

    private TreeSet<Producto> productos = new TreeSet<>();

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiGdp = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmConsultas = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supermercado DeTodo S.A.");

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );

        jMenu1.setText("Administración");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jmiGdp.setText("Gestión de productos");
        jmiGdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiGdpActionPerformed(evt);
            }
        });
        jMenu1.add(jmiGdp);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jmConsultas.setText("Consulta por rubro");
        jmConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultasActionPerformed(evt);
            }
        });
        jMenu2.add(jmConsultas);

        jMenuItem3.setText("Consulta por nombre");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Consulta por precio");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO adndling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jmiGdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiGdpActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        GestionDeProductos gdp = new GestionDeProductos(productos);
        gdp.setVisible(true);

        int escritorioAncho = jDesktopPane1.getWidth();
        int escritorioAlto = jDesktopPane1.getHeight();
        int ventanitaAncho = gdp.getWidth();
        int ventanitaAlto = gdp.getHeight();

        int x = (escritorioAncho - ventanitaAncho) / 2;
        int y = (escritorioAlto - ventanitaAlto) / 2;

        gdp.setLocation(x, y);

        jDesktopPane1.add(gdp);
    }//GEN-LAST:event_jmiGdpActionPerformed

    private void jmConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultasActionPerformed

        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ConsultaPorRubro cpr = new ConsultaPorRubro(productos);
        cpr.setVisible(true);

        int escritorioAncho = jDesktopPane1.getWidth();
        int escritorioAlto = jDesktopPane1.getHeight();
        int ventanitaAncho = cpr.getWidth();
        int ventanitaAlto = cpr.getHeight();

        int x = (escritorioAncho - ventanitaAncho) / 2;
        int y = (escritorioAlto - ventanitaAlto) / 2;

        cpr.setLocation(x, y);

        jDesktopPane1.add(cpr);
    }//GEN-LAST:event_jmConsultasActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:

        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ConsultaPorNombre cpn = new ConsultaPorNombre(productos);
        cpn.setVisible(true);

        int escritorioAncho = jDesktopPane1.getWidth();
        int escritorioAlto = jDesktopPane1.getHeight();
        int ventanitaAncho = cpn.getWidth();
        int ventanitaAlto = cpn.getHeight();

        int x = (escritorioAncho - ventanitaAncho) / 2;
        int y = (escritorioAlto - ventanitaAlto) / 2;

        cpn.setLocation(x, y);

        jDesktopPane1.add(cpn);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ConsultaPorPrecio cpp = new ConsultaPorPrecio(productos);
        cpp.setVisible(true);

        int escritorioAncho = jDesktopPane1.getWidth();
        int escritorioAlto = jDesktopPane1.getHeight();
        int ventanitaAncho = cpp.getWidth();
        int ventanitaAlto = cpp.getHeight();

        int x = (escritorioAncho - ventanitaAncho) / 2;
        int y = (escritorioAlto - ventanitaAlto) / 2;

        cpp.setLocation(x, y);

        jDesktopPane1.add(cpp);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jmConsultas;
    private javax.swing.JMenuItem jmiGdp;
    // End of variables declaration//GEN-END:variables
}
