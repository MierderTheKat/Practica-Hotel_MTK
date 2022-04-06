package U2_Ejercicio_Hotel_Interfaz;

import U2_Ejercicio_Hotel.*;
import java.util.ArrayList;
/**
 *
 * @author MierderTheKat
 */
public class Pantalla_Inicial extends javax.swing.JFrame {
    
    public static ArrayList<Empleados> Array = new ArrayList(); //creo el array list
    
    public Pantalla_Inicial() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Menu_Principal = new javax.swing.JMenuBar();
        Información = new javax.swing.JMenu();
        Info_Empleados = new javax.swing.JMenu();
        Sueldos_Empleados = new javax.swing.JMenu();
        Horas_Trabajo = new javax.swing.JMenu();
        Obligaciones = new javax.swing.JMenu();
        Pago = new javax.swing.JMenu();
        NuevoEmpleado = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label_Titulo.setFont(new java.awt.Font("Lemon", 1, 24)); // NOI18N
        Label_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo.setText("Hotel \"El Titan Colosal\"");
        Label_Titulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Label_Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/U2_Ejercicio_Hotel_Imagenes/Titan Colosal.jpg"))); // NOI18N

        Menu_Principal.setName(""); // NOI18N

        Información.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Información.setText("Información");

        Info_Empleados.setText("Información de empleados");
        Info_Empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Info_EmpleadosMouseClicked(evt);
            }
        });
        Información.add(Info_Empleados);

        Sueldos_Empleados.setText("Sueldos por Puesto");
        Sueldos_Empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sueldos_EmpleadosMouseClicked(evt);
            }
        });
        Información.add(Sueldos_Empleados);

        Horas_Trabajo.setText("Horas de Trabajo por Puesto");
        Horas_Trabajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Horas_TrabajoMouseClicked(evt);
            }
        });
        Información.add(Horas_Trabajo);

        Obligaciones.setText("Obligaciones por Puestos");
        Obligaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ObligacionesMouseClicked(evt);
            }
        });
        Información.add(Obligaciones);

        Menu_Principal.add(Información);

        Pago.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pago.setText("Pago");
        Pago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PagoMouseClicked(evt);
            }
        });
        Menu_Principal.add(Pago);

        NuevoEmpleado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NuevoEmpleado.setText("Empleado Nuevo");
        NuevoEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NuevoEmpleadoMouseClicked(evt);
            }
        });
        Menu_Principal.add(NuevoEmpleado);

        setJMenuBar(Menu_Principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(Label_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Info_EmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Info_EmpleadosMouseClicked
        Pantalla_Info info = new Pantalla_Info();
        info.setVisible(true); //Se hace visible  
        info.setLocationRelativeTo(null);//Se centra
        info.setResizable(false);//Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_Info_EmpleadosMouseClicked

    private void Sueldos_EmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sueldos_EmpleadosMouseClicked
        Pantalla_Sueldos sueldo = new Pantalla_Sueldos();
        sueldo.setVisible(true); //Se hace visible  
        sueldo.setLocationRelativeTo(null);//Se centra
        sueldo.setResizable(false);//Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_Sueldos_EmpleadosMouseClicked

    private void Horas_TrabajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Horas_TrabajoMouseClicked
        Pantalla_Hrs_Puesto horas = new Pantalla_Hrs_Puesto();
        horas.setVisible(true); //Se hace visible  
        horas.setLocationRelativeTo(null);//Se centra
        horas.setResizable(false);//Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_Horas_TrabajoMouseClicked

    private void PagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PagoMouseClicked
        Pantalla_Pagos pago = new Pantalla_Pagos();
        pago.setVisible(true); //Se hace visible  
        pago.setLocationRelativeTo(null);//Se centra
        pago.setResizable(false);//Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_PagoMouseClicked

    private void NuevoEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoEmpleadoMouseClicked
        Pantalla_EmpleadoNuevo nuevo = new Pantalla_EmpleadoNuevo();
        nuevo.setVisible(true); //Se hace visible  
        nuevo.setLocationRelativeTo(null);//Se centra
        nuevo.setResizable(false);//Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_NuevoEmpleadoMouseClicked

    private void ObligacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ObligacionesMouseClicked
        Pantalla_Obligaciones nuevo = new Pantalla_Obligaciones();
        nuevo.setVisible(true); //Se hace visible  
        nuevo.setLocationRelativeTo(null);//Se centra
        nuevo.setResizable(false);//Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_ObligacionesMouseClicked

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
            java.util.logging.Logger.getLogger(Pantalla_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Horas_Trabajo;
    private javax.swing.JMenu Info_Empleados;
    private javax.swing.JMenu Información;
    private javax.swing.JLabel Label_Titulo;
    private javax.swing.JMenuBar Menu_Principal;
    private javax.swing.JMenu NuevoEmpleado;
    private javax.swing.JMenu Obligaciones;
    private javax.swing.JMenu Pago;
    private javax.swing.JMenu Sueldos_Empleados;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
