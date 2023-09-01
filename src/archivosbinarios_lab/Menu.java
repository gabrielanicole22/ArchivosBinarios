/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package archivosbinarios_lab;

import java.awt.Color;
import java.awt.Cursor;

/**
 *
 * @author Gabriela Mejía
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    EmpleadosManager empleadosClase;
    

    public Menu() {
        initComponents();
        this.empleadosClase = new EmpleadosManager();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Color backgroundColor = new Color(66, 84, 87);
        getContentPane().setBackground(backgroundColor);
    }
    Color SELECT_COLOR = new Color(144, 210, 216);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAgregarEmpleado = new javax.swing.JLabel();
        btnListar = new javax.swing.JLabel();
        btnAgregarVenta = new javax.swing.JLabel();
        btnPagar = new javax.swing.JLabel();
        btnDespedir = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MENÚ");

        btnAgregarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarEmpleado.setText("1- Agregar Empleado");
        btnAgregarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarEmpleadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarEmpleadoMouseExited(evt);
            }
        });

        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setText("2- Listar Empleados No Despedidos  ");
        btnListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListarMouseExited(evt);
            }
        });

        btnAgregarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarVenta.setText("3- Agregar Venta a Empleado  ");
        btnAgregarVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarVentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarVentaMouseExited(evt);
            }
        });

        btnPagar.setForeground(new java.awt.Color(255, 255, 255));
        btnPagar.setText("4- Pagar Empleado  ");
        btnPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPagarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPagarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPagarMouseExited(evt);
            }
        });

        btnDespedir.setForeground(new java.awt.Color(255, 255, 255));
        btnDespedir.setText("5- Despedir Empleado  ");
        btnDespedir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDespedirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDespedirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDespedirMouseExited(evt);
            }
        });

        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("6- Salir  ");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnListar)
                    .addComponent(btnAgregarEmpleado)
                    .addComponent(btnAgregarVenta)
                    .addComponent(btnPagar)
                    .addComponent(btnDespedir)
                    .addComponent(btnSalir)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(122, 122, 122)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(btnAgregarEmpleado)
                .addGap(18, 18, 18)
                .addComponent(btnListar)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarVenta)
                .addGap(18, 18, 18)
                .addComponent(btnPagar)
                .addGap(18, 18, 18)
                .addComponent(btnDespedir)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoMouseClicked
        // TODO add your handling code here:
        AgregarEmpleado addempleado = new AgregarEmpleado(empleadosClase);
        addempleado.setVisible(true);
    }//GEN-LAST:event_btnAgregarEmpleadoMouseClicked

    private void btnAgregarEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoMouseEntered
        // TODO add your handling code here:
        btnAgregarEmpleado.setForeground(SELECT_COLOR);
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnAgregarEmpleadoMouseEntered

    private void btnAgregarEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoMouseExited
        // TODO add your handling code here:
        btnAgregarEmpleado.setForeground(Color.white);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnAgregarEmpleadoMouseExited

    private void btnListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseClicked
        Listar_Empleados_No_Despedidos addempleado = new Listar_Empleados_No_Despedidos(empleadosClase);
        addempleado.setVisible(true);
    }//GEN-LAST:event_btnListarMouseClicked

    private void btnListarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseEntered
        // TODO add your handling code here:
        btnListar.setForeground(SELECT_COLOR);
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnListarMouseEntered

    private void btnListarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseExited
        // TODO add your handling code here:
        btnListar.setForeground(Color.white);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnListarMouseExited

    private void btnAgregarVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarVentaMouseClicked
        // TODO add your handling code here:
        AgregarVentas addventas = new AgregarVentas(empleadosClase);
        addventas.setVisible(true);
    }//GEN-LAST:event_btnAgregarVentaMouseClicked

    private void btnAgregarVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarVentaMouseEntered
        // TODO add your handling code here:
        btnAgregarVenta.setForeground(SELECT_COLOR);
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnAgregarVentaMouseEntered

    private void btnAgregarVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarVentaMouseExited
        // TODO add your handling code here:
        btnAgregarVenta.setForeground(Color.white);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnAgregarVentaMouseExited

    private void btnPagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagarMouseClicked
          Pagar_Empleado addventas = new Pagar_Empleado(empleadosClase);
        addventas.setVisible(true);
    }//GEN-LAST:event_btnPagarMouseClicked

    private void btnPagarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagarMouseEntered
        // TODO add your handling code here:
        btnPagar.setForeground(SELECT_COLOR);
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnPagarMouseEntered

    private void btnPagarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagarMouseExited
        // TODO add your handling code here:
        btnPagar.setForeground(Color.white);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnPagarMouseExited

    private void btnDespedirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDespedirMouseClicked
          Despedir_Empleado addventas = new Despedir_Empleado(empleadosClase);
        addventas.setVisible(true);

    }//GEN-LAST:event_btnDespedirMouseClicked

    private void btnDespedirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDespedirMouseEntered
        // TODO add your handling code here:
        btnDespedir.setForeground(SELECT_COLOR);
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnDespedirMouseEntered

    private void btnDespedirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDespedirMouseExited
        // TODO add your handling code here:
        btnDespedir.setForeground(Color.white);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnDespedirMouseExited

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        // TODO add your handling code here:
        btnSalir.setForeground(SELECT_COLOR);
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        // TODO add your handling code here:
        btnSalir.setForeground(Color.white);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnSalirMouseExited

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
    private javax.swing.JLabel btnAgregarEmpleado;
    private javax.swing.JLabel btnAgregarVenta;
    private javax.swing.JLabel btnDespedir;
    private javax.swing.JLabel btnListar;
    private javax.swing.JLabel btnPagar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
