package U2_Ejercicio_Hotel_Interfaz;

import U2_Ejercicio_Hotel.*;

/**
 *
 * @author MierderTheKat
 */
public class Pantalla_EmpleadoNuevo extends javax.swing.JFrame {
        
    public Pantalla_EmpleadoNuevo(){
        initComponents();

        ocultar1();
        ocultar2();
        Agregar.setVisible(false);
    }
    
    public void ocultar1()
    {
        L_P_SI.setVisible(false);
        CB_SI.setVisible(false);
    }
    public void ocultar2()
    {
        L_P_Extra.setVisible(false);
        TF_R_Extra.setVisible(false);
    }
    public void mostrar_1()
    {
        L_P_SI.setVisible(true);
        CB_SI.setVisible(true);
        Agregar.setVisible(true);
    }
    public void mostrar_2()
    {
        L_P_Extra.setVisible(true);
        TF_R_Extra.setVisible(true);
        Agregar.setVisible(true);
    }
    
    public int ID_Automatico(String Puesto)
    {
        int a = 0;
        if(Pantalla_Inicial.Array.isEmpty()){}
        else
        {
            for(int i=0; i<Pantalla_Inicial.Array.size(); i++)
            {
                if(Pantalla_Inicial.Array.get(i).getPuesto().equals(Puesto))
                {
                    a++;
                }
            }
        }
        return a+1;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_Titulo = new javax.swing.JLabel();
        L_Puesto = new javax.swing.JLabel();
        CB_Puestos = new javax.swing.JComboBox<>();
        L_Nombre = new javax.swing.JLabel();
        TF_Nombre = new javax.swing.JTextField();
        L_FecNac = new javax.swing.JLabel();
        TF_FecNac = new javax.swing.JTextField();
        Regresar = new javax.swing.JButton();
        L_Informacion = new javax.swing.JLabel();
        TF_Informacion = new javax.swing.JTextField();
        L_P_SI = new javax.swing.JLabel();
        CB_SI = new javax.swing.JCheckBox();
        L_P_Extra = new javax.swing.JLabel();
        TF_R_Extra = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        L_Titulo.setFont(new java.awt.Font("Lemon", 1, 24)); // NOI18N
        L_Titulo.setText("Empleado nuevo");
        L_Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        L_Puesto.setText("Puesto");

        CB_Puestos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir", "Recepcionista", "Portero", "Botones", "Mucama", "Cocinero" }));
        CB_Puestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_PuestosActionPerformed(evt);
            }
        });

        L_Nombre.setText("Ingresa el Nombre:");

        TF_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        L_FecNac.setText("Ingresa la Fecha de Nacimiento:");

        TF_FecNac.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        L_Informacion.setText("Informacion:");

        TF_Informacion.setEditable(false);
        TF_Informacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        L_P_SI.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_P_SI.setText("Pregunta Boolean Extra");

        CB_SI.setText("Si");

        L_P_Extra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        L_P_Extra.setText("Pregunta String Extra");

        TF_R_Extra.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
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
                        .addComponent(L_Informacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TF_Informacion, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Regresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(L_FecNac)
                                            .addComponent(L_Puesto, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(L_P_SI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                            .addComponent(L_P_Extra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(L_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Agregar)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TF_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                        .addComponent(TF_FecNac, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                        .addComponent(CB_Puestos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CB_SI))
                                    .addComponent(TF_R_Extra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(L_Titulo))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(L_Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_Nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_FecNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_FecNac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_Puestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_Puesto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_P_SI, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_SI, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_R_Extra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_P_Extra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regresar)
                    .addComponent(TF_Informacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_Informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void CB_PuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_PuestosActionPerformed
        
        CB_SI.setSelected(false);
        TF_R_Extra.setText("");
        int a = CB_Puestos.getSelectedIndex();
        
        if(TF_Nombre.getText().isEmpty() || TF_FecNac.getText().isEmpty())
        {
            TF_Informacion.setText("Ingresa primero los datos");
            CB_Puestos.setSelectedIndex(0);
            ocultar1();
            ocultar2();
            Agregar.setVisible(false);
        }
        else
        {
            switch(a)
            {
                case 1:
                    //---Recepcionista---
                    mostrar_1();
                    ocultar2();
                    L_P_SI.setText("¿Tendra turno nocturno?");
                    break;
                case 2:
                    //---Portero---
                    mostrar_1();
                    ocultar2();
                    L_P_SI.setText("¿Tiene edad avanzada?");
                    break;
                case 3:
                    //---Botones---
                    mostrar_2();
                    ocultar1();
                    L_P_Extra.setText("Peso soportado:");
                    break;
                case 4:
                    //---Mucama---
                    ocultar1();
                    ocultar2();
                    Agregar.setVisible(true);
                    break;
                case 5:
                    //---Cocinero---
                    mostrar_1();
                    mostrar_2();
                    L_P_SI.setText("¿Tiene titulo?");
                    L_P_Extra.setText("Especialidad:");
                    break;
                default:
                    System.out.println("");
                    ocultar1();
                    ocultar2();
                    TF_Nombre.setText("");
                    TF_FecNac.setText("");
                    TF_R_Extra.setText("");
                    CB_SI.setContentAreaFilled(false);
                    Agregar.setVisible(false);
                    break;
            }
        }
    }//GEN-LAST:event_CB_PuestosActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        
        String Nombre, ID, FechNac;
        int a = CB_Puestos.getSelectedIndex();
        int b = 0;

        if(TF_Nombre.getText().isEmpty() || TF_FecNac.getText().isEmpty())
        {
            TF_Informacion.setText("Ingresa primero los datos");
            CB_Puestos.setSelectedIndex(0);
        }
        else
        {
            switch(a)
            {
                case 1:
                System.out.println("---Recepcionista---");

                b = ID_Automatico("Recepcionista");
                ID = "R-" + b;
                System.out.println("ID: "+ID); //ID del empleado

                System.out.println("Nombre: "+TF_Nombre.getText()); //Nombre
                Nombre = TF_Nombre.getText();
                System.out.println("Fecha: "+TF_FecNac.getText()); //Fecha de nacimiento
                FechNac = TF_FecNac.getText();
                System.out.println("Nocturno : "+CB_SI.isSelected()); //Turno nocturno
                boolean noche = CB_SI.isSelected();

                //Ingresar datos al objeto
                Empleados R = new E3_Recepcionistas(ID, Nombre, FechNac, "Recepcionista", "8", noche);
                Pantalla_Inicial.Array.add(R);

                CB_Puestos.setSelectedIndex(0);
                TF_Informacion.setText(R.getNombre() + " fue añadido/a     con ID: "+ID);
                break;
                case 2:
                System.out.println("---Portero---");

                b = ID_Automatico("Portero");
                ID = "P-" + b;
                System.out.println("ID: "+ID); //ID del empleado

                System.out.println("Nombre: "+TF_Nombre.getText()); //Nombre
                Nombre = TF_Nombre.getText();
                System.out.println("Fecha: "+TF_FecNac.getText()); //Fecha de nacimiento
                FechNac = TF_FecNac.getText();
                System.out.println("Edad Avanzada: "+CB_SI.isSelected()); //Edad Avanzada
                boolean Edad_Avanz = CB_SI.isSelected();

                //Ingresar datos al objeto
                Empleados P = new E4_Porteros(ID, Nombre, FechNac, "Portero", "4", Edad_Avanz);
                Pantalla_Inicial.Array.add(P);

                CB_Puestos.setSelectedIndex(0);
                TF_Informacion.setText(P.getNombre() + " fue añadido/a     con ID: "+ID);
                break;
                case 3:
                //System.out.println("---Botones---");

                if(TF_R_Extra.getText().isEmpty())
                {
                    TF_Informacion.setText("Ingresa todos los datos");
                }
                else if(Integer.parseInt(TF_R_Extra.getText()) < 6 || Integer.parseInt(TF_R_Extra.getText()) > 80 )
                {
                    if(Integer.parseInt(TF_R_Extra.getText()) < 6)
                    {
                        TF_Informacion.setText("Peso de carga insuficiente");
                    }
                    else
                    {
                        TF_Informacion.setText("Peso de carga inhumano");
                    }
                    TF_R_Extra.setText("");
                }
                else
                {
                    System.out.println("---Botones---");

                    b = ID_Automatico("Botones");
                    ID = "B-" + b;
                    System.out.println("ID: "+ID); //ID del empleado

                    System.out.println("Nombre: "+TF_Nombre.getText()); //Nombre
                    Nombre = TF_Nombre.getText();
                    System.out.println("Fecha: "+TF_FecNac.getText()); //Fecha de nacimiento
                    FechNac = TF_FecNac.getText();
                    System.out.println("Peso: "+TF_R_Extra.getText()+"Kg"); //Peso que carga
                    int peso = Integer.parseInt(TF_R_Extra.getText());
                    //Ingresar datos al objeto
                    Empleados B = new E1_Botones(ID, Nombre, FechNac, "Botones", "6", peso);
                    Pantalla_Inicial.Array.add(B);

                    CB_Puestos.setSelectedIndex(0);
                    TF_Informacion.setText(B.getNombre() + " fue añadido/a     con ID: "+ID);
                }
                break;
                case 4:
                System.out.println("---Mucama---");

                b = ID_Automatico("Mucama");
                ID = "M-" + b;
                System.out.println("ID: "+ID); //ID del empleado

                System.out.println("Nombre: "+TF_Nombre.getText()); //Nombre
                Nombre = TF_Nombre.getText();
                System.out.println("Fecha: "+TF_FecNac.getText()); //Fecha de nacimiento
                FechNac = TF_FecNac.getText();

                //Ingresar datos al objeto
                Empleados M = new E2_Mucamas(ID, Nombre, FechNac, "Mucama", "6");
                Pantalla_Inicial.Array.add(M);

                CB_Puestos.setSelectedIndex(0);
                TF_Informacion.setText(M.getNombre() + " fue añadido/a     con ID: "+ID);
                break;
                case 5:
                //System.out.println("---Cocinero---");

                if(TF_R_Extra.getText().isEmpty())
                {
                    TF_Informacion.setText("Ingresa la especialidad");
                    TF_R_Extra.setText("");
                }
                else
                {
                    System.out.println("---Cocinero---");

                    b = ID_Automatico("Cocinero");
                    ID = "C-" + b;
                    System.out.println("ID: "+ID); //ID del empleado

                    System.out.println("Nombre: "+TF_Nombre.getText()); //Nombre
                    Nombre = TF_Nombre.getText();
                    System.out.println("Fecha: "+TF_FecNac.getText()); //Fecha de nacimiento
                    FechNac = TF_FecNac.getText();
                    System.out.println("Especialidad: "+TF_R_Extra.getText()); //Especialidad
                    String Especialidad = TF_R_Extra.getText();
                    System.out.println("Titulo: "+CB_SI.isSelected()); //Titulo
                    boolean Titulo = CB_SI.isSelected();

                    //Ingresar datos al objeto
                    Empleados C = new E5_Cocineros(ID, Nombre, FechNac, "Cocinero", "8", Especialidad, Titulo);
                    Pantalla_Inicial.Array.add(C);

                    CB_Puestos.setSelectedIndex(0);
                    TF_Informacion.setText(C.getNombre() + " fue añadido/a     con ID: "+ID);
                }
                break;
                default:
                System.out.println("");
                ocultar1();
                ocultar2();
                TF_Nombre.setText("");
                TF_FecNac.setText("");
                CB_SI.setContentAreaFilled(false);
                Agregar.setVisible(false);
                break;
            }
        }
    }//GEN-LAST:event_AgregarActionPerformed
    
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
            java.util.logging.Logger.getLogger(Pantalla_EmpleadoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_EmpleadoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_EmpleadoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_EmpleadoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_EmpleadoNuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JComboBox<String> CB_Puestos;
    private javax.swing.JCheckBox CB_SI;
    private javax.swing.JLabel L_FecNac;
    private javax.swing.JLabel L_Informacion;
    private javax.swing.JLabel L_Nombre;
    private javax.swing.JLabel L_P_Extra;
    private javax.swing.JLabel L_P_SI;
    private javax.swing.JLabel L_Puesto;
    private javax.swing.JLabel L_Titulo;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField TF_FecNac;
    private javax.swing.JTextField TF_Informacion;
    private javax.swing.JTextField TF_Nombre;
    private javax.swing.JTextField TF_R_Extra;
    // End of variables declaration//GEN-END:variables
}
