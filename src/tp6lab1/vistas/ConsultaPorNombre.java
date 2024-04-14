package tp6lab1.vistas;


 // @author ovied

import java.util.TreeSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import tp6lab1.Entidades.Producto;


public class ConsultaPorNombre extends javax.swing.JInternalFrame {

private TreeSet<Producto> productos;
private DefaultTableModel modelo=new DefaultTableModel();
    
    public ConsultaPorNombre() {
        initComponents();
    }

        public ConsultaPorNombre(TreeSet<Producto> productos) {
        initComponents();
        this.productos=productos;
        armarCabecera();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlRubro = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLista = new javax.swing.JTable();
        jtfConsulta = new javax.swing.JTextField();

        setClosable(true);

        jlRubro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlRubro.setText("Seleccione un rubro:");

        jlTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlTitulo.setText("PRODUCTOS POR RUBRO");

        jtLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descripción", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtLista);

        jtfConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfConsultaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jlTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jlRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfConsultaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfConsultaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfConsultaKeyReleased


        
     private void armarCabecera(){
       
         modelo.addColumn("Codigo");
         modelo.addColumn("Descripcion");
         modelo.addColumn("Precio");
         modelo.addColumn("Stock");
         jtLista.setModel(modelo);
     }
     
     private void borrarFilas(){
     
         int filas=modelo.getRowCount()-1;
         for(int f=filas;f >= 0;f--){
         
             modelo.removeRow(f);
         }
     }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlRubro;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTable jtLista;
    private javax.swing.JTextField jtfConsulta;
    // End of variables declaration//GEN-END:variables
}
