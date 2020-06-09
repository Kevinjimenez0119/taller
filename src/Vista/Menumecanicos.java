/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class Menumecanicos extends javax.swing.JFrame {

    /**
     * Creates new form Menumecanicos
     */
    public final Escogervehiculo obj;
    String mecanico;
    String matricula;
    String cliente;
    String idasignado;
    public Menumecanicos(Escogervehiculo obj) {
       initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.obj=obj;
        mostrar();
        
    }
public void mostrar()
    {
        DefaultTableModel modelo=new DefaultTableModel();
        ResultSet re=obj.obj.n2.llenartabla("select * from repuestos");
        modelo.setColumnIdentifiers(new Object[]{"idrepuesto","marca","modelo","referencia","preciounidad","valor","cantidad","iddistribuidor"});
        try {
            while(re.next())
            {
                modelo.addRow(new Object[]{re.getString(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5),re.getString(6),re.getString(7),re.getString(8)});
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
        }
    }

 public void mostrar2(String id)
    {
        DefaultTableModel modelo=new DefaultTableModel();
        ResultSet re=obj.obj.n2.llenartabla("select * from repuestos where referencia ='"+id+"'");
        modelo.setColumnIdentifiers(new Object[]{"idrepuesto","marca","modelo","referencia","preciounidad","valor","cantidad","iddistribuidor"});
        try {
            while(re.next())
            {
                modelo.addRow(new Object[]{re.getString(1),re.getString(2),re.getString(3),re.getString(4),re.getString(5),re.getString(6)});
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
        }
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
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        t2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("DESCRIPCION:");

        jLabel2.setText("TIPO DE SERVICIO:");

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cambio", "reparacion", "diagnostico" }));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        t2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t2MouseClicked(evt);
            }
        });
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t2KeyReleased(evt);
            }
        });

        jLabel3.setText("REFERENCIA:");

        jButton2.setText("Generar reporte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t1)
                                    .addComponent(c1, 0, 214, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t2MouseClicked
        
    }//GEN-LAST:event_t2MouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
       
    }//GEN-LAST:event_tablaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int fila=tabla.getSelectedRow();
        String descripcion=t1.getText();
       String tipo=c1.getSelectedItem().toString();
       
                 String id2=(String.valueOf(tabla.getValueAt(fila, 0)));
                 String valor=(String.valueOf(tabla.getValueAt(fila, 5)));
                 String cantidad=(String.valueOf(tabla.getValueAt(fila, 6)));
                 int valorx=Integer.parseInt(valor);
                 int can=Integer.parseInt(cantidad);
        if(fila>=0)
        {
            if(can>0)
                 {
       if(!descripcion.isEmpty())
       {
          if(tipo.equals("cambio"))
           {
               
                 obj.obj.n2.guardarreporte(descripcion, tipo, id2, valorx, mecanico, matricula, cliente);
                 ResultSet re=obj.obj.n2.Buscarreporte();
                 try {
                 while(re.next())
            {
                obj.obj.n2.guardarcambio(descripcion, re.getInt(1), id2);
            }
                int id3=Integer.parseInt(idasignado);
                obj.obj.n2.eliminarasignado(id3);
                obj.obj.n2.actualizarrepuesto(id2, can);
                obj.mostrar(mecanico);
                obj.setVisible(true);
                this.dispose();
            
               } catch (Exception e) {
               }
                 
           
          
              
          }}}else
            {
                JOptionPane.showMessageDialog(this, "No hay repuestos de este tipo");
            }
        }else
        {
            if(tipo.equals("diagnostico"))
           {
               
               String no="0";
               int no2=0;
                 obj.obj.n2.guardarreporte(descripcion, tipo, no, no2, mecanico, matricula, cliente);
                 ResultSet re=obj.obj.n2.Buscarreporte();
                 try {
                   while(re.next())
            {
                obj.obj.n2.guardardiagnostico(descripcion, re.getInt(1));
            }
                int id=Integer.parseInt(idasignado);
                obj.obj.n2.eliminarasignado(id);
                obj.mostrar(mecanico);
                obj.setVisible(true);
                this.dispose();
            
               } catch (Exception e) {
               }
           }else if(tipo.equals("reparacion"))
           {
               String no="0";
               int no2=0;
               obj.obj.n2.guardarreporte(descripcion, tipo, no, no2, mecanico, matricula, cliente);
                 ResultSet re=obj.obj.n2.Buscarreporte();
                 try {
                   while(re.next())
            {
                obj.obj.n2.guardarreparacion(descripcion, re.getInt(1));
            }
                int id=Integer.parseInt(idasignado);
                obj.obj.n2.eliminarasignado(id);
                obj.mostrar(mecanico);
                obj.setVisible(true);
                this.dispose();
            
               } catch (Exception e) {
               }
           }else if(tipo.equals("cambio"))
           {
               JOptionPane.showMessageDialog(this, "Error");
           }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyReleased
        String ref=t2.getText();
        mostrar2(ref);
    }//GEN-LAST:event_t2KeyReleased

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}