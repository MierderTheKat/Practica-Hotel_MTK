package U2_Ejercicio_Hotel_Interfaz;
/**
 *
 * @author MierderTheKat
 */
public class Pantalla_Info extends javax.swing.JFrame {
    
    public Pantalla_Info(){
        initComponents();
        
        ocultar_1();
        ocultar_2();
        if(Pantalla_Inicial.Array.isEmpty())
        {
            B_Tabla.setVisible(false);
        }
        else
        {
            B_Tabla.setVisible(true);
        }
    }
    
    public void ocultar_1()
    {
        L_P_SI.setVisible(false);
        TF_Puesto1.setVisible(false);
    }
    public void ocultar_2()
    {
        L_P_Extra.setVisible(false);
        TF_R_Extra.setVisible(false);
    }
    public void mostrar_1()
    {
        L_P_SI.setVisible(true);
        TF_Puesto1.setVisible(true);
    }
    public void mostrar_2()
    {
        L_P_Extra.setVisible(true);
        TF_R_Extra.setVisible(true);
    }
    
    public void Buscar_ID(String ID)
    {
        int a = 0;
        System.out.println("----ID's----");
        for(int i=0; i<Pantalla_Inicial.Array.size(); i++)
        {
            System.out.println(Pantalla_Inicial.Array.get(i).getId_Empleado()); // Imprimir ID's en Consola
            if(Pantalla_Inicial.Array.get(i).getId_Empleado().equals(ID))
            {
                a = i;
            }
        }
        System.out.println("------------");
        
        if(Pantalla_Inicial.Array.get(a).getId_Empleado().equals(ID))
        {
            TF_Informacion.setText("ID Encontrado");
            TF_Nombre.setText(Pantalla_Inicial.Array.get(a).getNombre());
            TF_FecNac.setText(Pantalla_Inicial.Array.get(a).getFech_Nac());
            TF_Sueldo.setText(Pantalla_Inicial.Array.get(a).getSueldo()+"$");
            TF_Puesto.setText(Pantalla_Inicial.Array.get(a).getPuesto());
            
            String empleado = Pantalla_Inicial.Array.get(a).getPuesto();
            switch(empleado)
            {
                case "Recepcionista":
                    mostrar_1();
                    ocultar_2();
                    L_P_SI.setText("Turno nocturno:");
                    if(Pantalla_Inicial.Array.get(a).getNoche() == true)
                    {
                        TF_Puesto1.setText("SI");
                    }
                    else
                    {
                        TF_Puesto1.setText("NO");
                    }
                    break;
                case "Portero":
                    mostrar_1();
                    ocultar_2();
                    L_P_SI.setText("Edad Avanzada:");
                    if(Pantalla_Inicial.Array.get(a).getEdad_Avanz() == true)
                    {
                        TF_Puesto1.setText("SI");
                    }
                    else
                    {
                        TF_Puesto1.setText("NO");
                    }
                    break;
                case "Botones":
                    mostrar_2();
                    ocultar_1();
                    L_P_Extra.setText("Peso soportado:");
                    TF_R_Extra.setText(Pantalla_Inicial.Array.get(a).getPeso()+"Kg");
                    break;
                case "Mucama":
                    ocultar_1();
                    ocultar_2();
                    break;
                case "Cocinero":
                    mostrar_1();
                    mostrar_2();
                    L_P_SI.setText("Titulo Universitario:");
                    if(Pantalla_Inicial.Array.get(a).getTitulo() == true)
                    {
                        TF_Puesto1.setText("SI");
                    }
                    else
                    {
                        TF_Puesto1.setText("NO");
                    }
                    L_P_Extra.setText("Especialidad:");
                    TF_R_Extra.setText(Pantalla_Inicial.Array.get(a).getEspecialidad());
                    break;
                default:

                    break;
            }
        }
        else
        {
            TF_Informacion.setText("No se encontro el ID");
            TF_Puesto.setText("");
            TF_Nombre.setText("");
            TF_FecNac.setText("");
            TF_Sueldo.setText("");
            TF_ID.setText("");
            TF_Puesto1.setText("");
            TF_R_Extra.setText("");
            ocultar_1();
            ocultar_2();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_Titulo = new javax.swing.JLabel();
        L_ID = new javax.swing.JLabel();
        TF_ID = new javax.swing.JTextField();
        L_Puesto = new javax.swing.JLabel();
        TF_Puesto = new javax.swing.JTextField();
        L_Nom = new javax.swing.JLabel();
        TF_Nombre = new javax.swing.JTextField();
        L_FechaNacimiento = new javax.swing.JLabel();
        TF_FecNac = new javax.swing.JTextField();
        L_Sueldo = new javax.swing.JLabel();
        TF_Sueldo = new javax.swing.JTextField();
        L_Informacion = new javax.swing.JLabel();
        TF_Informacion = new javax.swing.JTextField();
        Regresar = new javax.swing.JButton();
        Comprobar = new javax.swing.JButton();
        L_P_SI = new javax.swing.JLabel();
        TF_Puesto1 = new javax.swing.JTextField();
        L_P_Extra = new javax.swing.JLabel();
        TF_R_Extra = new javax.swing.JTextField();
        B_Tabla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        L_Titulo.setFont(new java.awt.Font("Lemon", 1, 24)); // NOI18N
        L_Titulo.setText("Info de los empleados");
        L_Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        L_ID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_ID.setText("Ingresa el ID:");

        TF_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        L_Puesto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Puesto.setText("Puesto:");

        TF_Puesto.setEditable(false);
        TF_Puesto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        L_Nom.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Nom.setText("Nombre:");

        TF_Nombre.setEditable(false);
        TF_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        L_FechaNacimiento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_FechaNacimiento.setText("Nacimiento:");

        TF_FecNac.setEditable(false);
        TF_FecNac.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        L_Sueldo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_Sueldo.setText("Sueldo:");

        TF_Sueldo.setEditable(false);
        TF_Sueldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        L_Informacion.setText("Informacion:");

        TF_Informacion.setEditable(false);
        TF_Informacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        Comprobar.setText("Comprobar");
        Comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprobarActionPerformed(evt);
            }
        });

        L_P_SI.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_P_SI.setText("Si o No:");

        TF_Puesto1.setEditable(false);
        TF_Puesto1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        L_P_Extra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_P_Extra.setText("Pregunta Extra:");

        TF_R_Extra.setEditable(false);
        TF_R_Extra.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        B_Tabla.setText("Ir a la Tabla");
        B_Tabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_TablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(L_Informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_Informacion, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Regresar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(L_P_Extra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_R_Extra, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(L_Titulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(L_Puesto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TF_Puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(L_FechaNacimiento))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(L_Nom)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(L_Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(B_Tabla)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(L_P_SI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TF_FecNac, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                            .addComponent(TF_Sueldo)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(TF_Puesto1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(L_ID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Comprobar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_ID)
                    .addComponent(TF_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Comprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Puesto)
                    .addComponent(TF_Puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_FechaNacimiento)
                    .addComponent(TF_FecNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_Nom)
                    .addComponent(L_Sueldo)
                    .addComponent(TF_Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_Puesto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L_P_SI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B_Tabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_R_Extra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_P_Extra))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regresar)
                    .addComponent(TF_Informacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_Informacion))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        Pantalla_Inicial inicial = new Pantalla_Inicial();
        inicial.setVisible(true); //Se hace visible
        inicial.setLocationRelativeTo(null);//Se centra
        inicial.setResizable(false);//Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void ComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobarActionPerformed
        if(Pantalla_Inicial.Array.isEmpty())
        {
            TF_Informacion.setText("No hay empleados registrados");
            
        }
        else if(TF_ID.getText().isEmpty())
        {
            TF_Informacion.setText("Ingresa el ID");
            TF_Puesto.setText("");
            TF_Nombre.setText("");
            TF_FecNac.setText("");
            TF_Sueldo.setText("");
        }
        else
        {
            Buscar_ID(TF_ID.getText());
        }
    }//GEN-LAST:event_ComprobarActionPerformed

    private void B_TablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_TablaActionPerformed
        Pantalla_Info_Tabla tabla = new Pantalla_Info_Tabla();
        tabla.setVisible(true); //Se hace visible
        tabla.setLocationRelativeTo(null);//Se centra
        tabla.setResizable(false);//Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_B_TablaActionPerformed
    
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
            java.util.logging.Logger.getLogger(Pantalla_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Tabla;
    private javax.swing.JButton Comprobar;
    private javax.swing.JLabel L_FechaNacimiento;
    private javax.swing.JLabel L_ID;
    private javax.swing.JLabel L_Informacion;
    private javax.swing.JLabel L_Nom;
    private javax.swing.JLabel L_P_Extra;
    private javax.swing.JLabel L_P_SI;
    private javax.swing.JLabel L_Puesto;
    private javax.swing.JLabel L_Sueldo;
    private javax.swing.JLabel L_Titulo;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField TF_FecNac;
    private javax.swing.JTextField TF_ID;
    private javax.swing.JTextField TF_Informacion;
    private javax.swing.JTextField TF_Nombre;
    private javax.swing.JTextField TF_Puesto;
    private javax.swing.JTextField TF_Puesto1;
    private javax.swing.JTextField TF_R_Extra;
    private javax.swing.JTextField TF_Sueldo;
    // End of variables declaration//GEN-END:variables
}
