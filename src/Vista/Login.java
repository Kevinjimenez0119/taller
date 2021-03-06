/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import javax.swing.JOptionPane;
import Modelo.Metodossql;
import Modelo.Usuario;
import Modelo.Validaciones;

/**
 *
 * @author USUARIO
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Usuario n1;
    Metodossql n2;
    Validaciones n3;
    String mecanico;
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.n1=new Usuario();
        this.n2=new Metodossql();
        this.n3=new Validaciones();
        b2.setEnabled(false);
        validar();
    }
    public Login(Usuario n1, Metodossql n2, Validaciones n3)
    {
        this.n1=n1;
        this.n2=n2;
        this.n3=n3;
       
    }
    public void validar()
{
    if(t1.getText().isEmpty())
    {
        l1.setText("**");
    }else{
        l1.setText("");
    }
    
    if(t1.getText().isEmpty())
    {
        b2.setEnabled(false);
    }else
    {
        b2.setEnabled(true);
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

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        c1 = new javax.swing.JComboBox<>();
        t2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("DOCUMENTO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t1KeyReleased(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 107, 196, 33));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("CONTRASEÑA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        l1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 24, -1, -1));

        l2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 42, -1, -1));

        b2.setText("Iniciar sesion");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Mecanico", "Administrador", " " }));
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 301, 36));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 199, 196, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/7d514ce90eed62493f6938af1c26a477.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 1, 670, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyReleased
        validar();
    }//GEN-LAST:event_t1KeyReleased

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        Menuempleados obj=new Menuempleados(this);
        Escogervehiculo obj1=new Escogervehiculo(this);
        Menuadministrador obj2=new Menuadministrador(this);
        mecanico=t1.getText();
        if(c1.getSelectedItem().toString().equals("Empleado"))
        {
        String b = n2.buscarempleado(t1.getText(), t2.getText());
         if(b.equals("encontrado"))
        {
            JOptionPane.showMessageDialog(this, "Bienvenido");
            obj.setVisible(true);
            this.dispose();
        }else
        {
            JOptionPane.showMessageDialog(this, "No registrado");
        }}else if(c1.getSelectedItem().toString().equals("Mecanico"))
        {
            String b2 = n2.buscarmecanico(t1.getText(), t2.getText());
            if(b2.equals("encontrado"))
        {
            JOptionPane.showMessageDialog(this, "Bienvenido");
            obj1.mostrar(mecanico);
            obj1.setVisible(true);
            this.dispose();
        }else
        {
            JOptionPane.showMessageDialog(this, "No registrado");
        }
        }else if(c1.getSelectedItem().toString().equals("Administrador"))
        {
            if(t1.getText().equals("root") && t2.getText().equals("root"))
        {
            JOptionPane.showMessageDialog(this, "Bienvenido como administrador");
            obj2.setVisible(true);
            this.dispose();
        }else
        {
            JOptionPane.showMessageDialog(this, "No registrado");
        }
        }
    }//GEN-LAST:event_b2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b2;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    // End of variables declaration//GEN-END:variables
}
