/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tp6lab1.vistas;

import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import tp6lab1.Entidades.Producto;
import tp6lab1.Entidades.Rubro;

/**
 *
 * @author IGNACIO
 */
public class GestionDeProductos extends javax.swing.JInternalFrame {
    private TreeSet<Producto> productos;
    private Producto auxiliar=null;

    public GestionDeProductos(TreeSet<Producto> productos) {
        initComponents();
        this.productos=productos;
        llenarCombo();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlbCodigo = new javax.swing.JLabel();
        jlbDescripcion = new javax.swing.JLabel();
        jlbPrecio = new javax.swing.JLabel();
        jlbRubro = new javax.swing.JLabel();
        jlbStock = new javax.swing.JLabel();
        jtxCodigo = new javax.swing.JTextField();
        jtxDescripcion = new javax.swing.JTextField();
        jtxPrecio = new javax.swing.JTextField();
        jtxStock = new javax.swing.JTextField();
        jcbRubro = new javax.swing.JComboBox<>();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setTitle("\"DeTodo S.A.\"");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("GESTIÓN DE PRODUCTOS");

        jlbCodigo.setText("Código:");

        jlbDescripcion.setText("Descripción:");

        jlbPrecio.setText("Precio:");

        jlbRubro.setText("Rubro:");

        jlbStock.setText("Stock:");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbStock)
                            .addComponent(jlbCodigo)
                            .addComponent(jlbDescripcion)
                            .addComponent(jlbPrecio)
                            .addComponent(jlbRubro)
                            .addComponent(jbNuevo))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxDescripcion)
                            .addComponent(jcbRubro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jtxCodigo)
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar))
                            .addComponent(jtxPrecio)
                            .addComponent(jtxStock, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbEliminar))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCodigo)
                    .addComponent(jtxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbDescripcion)
                    .addComponent(jtxDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbPrecio)
                    .addComponent(jtxPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbRubro)
                    .addComponent(jcbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbStock)
                    .addComponent(jtxStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbGuardar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed

        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        int codigo;
        String descripcion;
        double precio;
        Rubro rubro;
        int stock;
       
        if(validaEntero(jtxCodigo.getText())){
            codigo = Integer.parseInt(jtxCodigo.getText());
        }else {
        
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número en Código.");
            jtxCodigo.requestFocus();
            return;
        }
       
        if(validaEntero(jtxStock.getText())){
            stock = Integer.parseInt(jtxStock.getText());
        }else {
        
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número en Stock.");
            jtxStock.requestFocus();
            return;
        }
        
        if(validaReal(jtxPrecio.getText())){
            precio = Double.parseDouble(jtxPrecio.getText());
        }else {
        
            JOptionPane.showMessageDialog(this, "Por favor, ingrese el precio con decimales.");
            jtxPrecio.requestFocus();
            return;
        }
        
        if(!jtxDescripcion.getText().isEmpty()){
        
            descripcion = jtxDescripcion.getText();
        }else {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una descripción.");
            jtxDescripcion.requestFocus();
            return;
        }
         
         
       rubro = (Rubro)jcbRubro.getSelectedItem();
      
       Producto nvoProd=new Producto(codigo,descripcion,precio,rubro,stock);
       if(productos.add(nvoProd)){
           JOptionPane.showMessageDialog(this, "Su producto ha sido agregado.");
           limpiar();
       }else {
       
           JOptionPane.showMessageDialog(this, "Ya existe un producto con ese código");
       }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        int codigo;
        if(validaEntero(jtxCodigo.getText())){
            codigo = Integer.parseInt(jtxCodigo.getText());
        }else {
        
            JOptionPane.showMessageDialog(this, "Ingresar un número ");
            jtxCodigo.requestFocus();
            return;
        }
        
        for(Producto prod:productos){
 
            if(codigo==prod.getCodigo()){
            
                jtxDescripcion.setText(prod.getDescripcion());
                jtxPrecio.setText(prod.getPrecio()+"");
                jtxStock.setText(prod.getStock()+"");
                jcbRubro.setSelectedItem(prod.getRubro());
                jbEliminar.setEnabled(true);
                auxiliar=prod;
                return;
                
            }
        }
        
        JOptionPane.showMessageDialog(this, "Su código no existe");
        limpiar();
        
    
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
       
        int opcion=JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar el producto?", "Confirmación",JOptionPane.YES_NO_OPTION);
                if(opcion==JOptionPane.YES_OPTION){
                     productos.remove(auxiliar);
                    JOptionPane.showMessageDialog(this, "Producto Eliminado :) ");
                    limpiar();
                    auxiliar=null;
                }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
      limpiar();
    }//GEN-LAST:event_jbNuevoActionPerformed
  
     private void llenarCombo(){
    
        Rubro comestible=new Rubro(1,"Comestible");
        Rubro limpieza=new Rubro(2,"Limpieza");
        Rubro perfumeria=new Rubro(3,"Perfumería");
        
        jcbRubro.addItem(comestible);
        jcbRubro.addItem(limpieza);
        jcbRubro.addItem(perfumeria);
        
    } 
    
    private boolean validaEntero(String nro){
    
        Pattern patron=Pattern.compile("^[0-9]+$");
        Matcher m=patron.matcher(nro);
        return m.matches();
    }

    private boolean validaReal(String nro){
    Pattern patron=Pattern.compile("^[0-9]+.[0-9]{2}$");
        Matcher m=patron.matcher(nro);
        return m.matches();
        
    }
    private void limpiar(){
    
        jtxCodigo.setText("");
        jtxDescripcion.setText("");
        jtxPrecio.setText("");
        jtxStock.setText("");
        jcbRubro.setSelectedIndex(-1);
        jbEliminar.setEnabled(false);
        auxiliar=null;
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Rubro> jcbRubro;
    private javax.swing.JLabel jlbCodigo;
    private javax.swing.JLabel jlbDescripcion;
    private javax.swing.JLabel jlbPrecio;
    private javax.swing.JLabel jlbRubro;
    private javax.swing.JLabel jlbStock;
    private javax.swing.JTextField jtxCodigo;
    private javax.swing.JTextField jtxDescripcion;
    private javax.swing.JTextField jtxPrecio;
    private javax.swing.JTextField jtxStock;
    // End of variables declaration//GEN-END:variables
}
