package tp6lab1.vistas;


 // @author ovied

import java.util.TreeSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import tp6lab1.Entidades.Producto;
import tp6lab1.Entidades.Rubro;

public class ConsultaPorRubro extends javax.swing.JInternalFrame {

private TreeSet<Producto> productos;
private DefaultTableModel modelo=new DefaultTableModel();
    
    public ConsultaPorRubro() {
        initComponents();
    }

        public ConsultaPorRubro(TreeSet<Producto> productos) {
        initComponents();
        this.productos=productos;
        llenarCombo();
        armarCabecera();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlRubro = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jcCategorias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLista = new javax.swing.JTable();

        setClosable(true);
        setTitle("\"DeTodo S.A.\"");

        jlRubro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlRubro.setText("Seleccione un rubro:");

        jlTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlTitulo.setText("PRODUCTOS POR RUBRO");

        jcCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCategoriasActionPerformed(evt);
            }
        });

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
                        .addGap(18, 18, 18)
                        .addComponent(jcCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jcCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCategoriasActionPerformed
   
        borrarFilas();
        Rubro rubro=(Rubro)jcCategorias.getSelectedItem();
       
        
        for(Producto prod:productos){
        
            if(rubro.equals(prod.getRubro())){
                            
              Vector renglon=new Vector<>();
              renglon.add(prod.getCodigo());
              renglon.add(prod.getDescripcion());
              renglon.add(prod.getPrecio());
              renglon.add(prod.getStock());

              modelo.addRow(renglon);
            }
        }   
    }//GEN-LAST:event_jcCategoriasActionPerformed


         private void llenarCombo(){
    
        Rubro comestible=new Rubro(1,"Comestible");
        Rubro limpieza=new Rubro(2,"Limpieza");
        Rubro perfumeria=new Rubro(3,"Perfumeria");
        
        jcCategorias.addItem(comestible);
        jcCategorias.addItem(limpieza);
        jcCategorias.addItem(perfumeria);
        
    }
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
    private javax.swing.JComboBox<Rubro> jcCategorias;
    private javax.swing.JLabel jlRubro;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTable jtLista;
    // End of variables declaration//GEN-END:variables
}
