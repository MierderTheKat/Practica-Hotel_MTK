package U2_Ejercicio_Hotel_Interfaz;

/**
 *
 * @author MierderTheKat
 */
public class Pantalla_Pagos extends javax.swing.JFrame {
    
    public Pantalla_Pagos(){
        initComponents();
        L_Hrs_E.setVisible(false);
        TF_Hrs_E.setVisible(false);
    }
        
    public int Buscar_ID(String ID)
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
        }
        else
        {
            TF_Informacion.setText("No se encontro el ID");
            TF_ID.setText("");
            TF_Hrs_E.setText("");
            TF_Pago.setText("");
            a = -1;
        }
        return a;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L_Titulo = new javax.swing.JLabel();
        L_Tiempo = new javax.swing.JLabel();
        L_ID = new javax.swing.JLabel();
        TF_ID = new javax.swing.JTextField();
        L_Hrs = new javax.swing.JLabel();
        TF_Hrs = new javax.swing.JTextField();
        Comprobar = new javax.swing.JButton();
        L_Hrs_E = new javax.swing.JLabel();
        TF_Hrs_E = new javax.swing.JTextField();
        L_Pago = new javax.swing.JLabel();
        TF_Pago = new javax.swing.JTextField();
        L_Informacion = new javax.swing.JLabel();
        TF_Informacion = new javax.swing.JTextField();
        Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        L_Titulo.setFont(new java.awt.Font("Lemon", 1, 24)); // NOI18N
        L_Titulo.setText("Pagos");
        L_Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        L_Tiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Tiempo.setText("a la semana");

        L_ID.setText("ID: ");

        TF_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        L_Hrs.setText("Horas trabajadas: ");

        TF_Hrs.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Comprobar.setText("Comprobar");
        Comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprobarActionPerformed(evt);
            }
        });

        L_Hrs_E.setText("Horas Extras: ");

        TF_Hrs_E.setEditable(false);
        TF_Hrs_E.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        L_Pago.setText("Pago:");

        TF_Pago.setEditable(false);
        TF_Pago.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        L_Informacion.setText("Informacion:");

        TF_Informacion.setEditable(false);
        TF_Informacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(L_Titulo)
                        .addGap(32, 160, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(L_ID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(L_Hrs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(L_Tiempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TF_Hrs, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(Comprobar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(L_Pago, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L_Informacion, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TF_Informacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Regresar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TF_Pago, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L_Hrs_E)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_Hrs_E, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(L_Titulo)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_ID)
                            .addComponent(TF_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_Hrs)
                            .addComponent(TF_Hrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Comprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_Tiempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Hrs_E, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_Hrs_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Pago, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_Pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void ComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobarActionPerformed
        
        L_Hrs_E.setVisible(false);
        TF_Hrs_E.setVisible(false);
        if(Pantalla_Inicial.Array.isEmpty())
        {
            TF_Informacion.setText("No hay empleados registrados");
        }
        else if(TF_ID.getText().isEmpty())
        {
            TF_Informacion.setText("Ingresa el ID");
            TF_Hrs_E.setText("");
            TF_Pago.setText("");
        }
        else if(TF_Hrs.getText().isEmpty())
        {
            TF_Informacion.setText("Ingresa las horas trabajadas");
            TF_Hrs_E.setText("");
            TF_Pago.setText("");
        }
        else if(Integer.parseInt(TF_Hrs.getText()) < 0 || Integer.parseInt(TF_Hrs.getText()) > 96)
        {// son 96 hrs por semana (6 dias) como maximo, para que tenga 8 hrs libres
            if(Integer.parseInt(TF_Hrs.getText()) < 0)
            {
                TF_Informacion.setText("Horas trabajadas menores a 0");
            }
            else
            {
                TF_Informacion.setText("Horas trabajadas inhumanas");
            }
            TF_Hrs_E.setText("");
            TF_Pago.setText("");
        }
        else
        {
            int N = Buscar_ID(TF_ID.getText());
            if(N >= 0)
            {
                System.out.println("--------------"+Pantalla_Inicial.Array.get(N).getPuesto()+"--------------");
                //Ingresar datos al objeto
                System.out.println(TF_Hrs.getText()); // imprime en consola
                
                Pantalla_Inicial.Array.get(N).Sueldo(Integer.parseInt(TF_Hrs.getText())); //llama el donde hace los calculos y se guarda
                TF_Pago.setText(Pantalla_Inicial.Array.get(N).getSueldo() + "$"); // lo pone en Text Field
                
                //para las horas extras
                int Extras = Integer.parseInt(TF_Hrs.getText()) - (Integer.parseInt(Pantalla_Inicial.Array.get(N).getJornada())*6);
                if (Extras > 0)
                {
                    L_Hrs_E.setVisible(true);
                    TF_Hrs_E.setVisible(true);
                    TF_Hrs_E.setText(Extras + "");
                }
                else
                {
                    L_Hrs_E.setVisible(false);
                    TF_Hrs_E.setVisible(false);
                    TF_Hrs_E.setText("0");
                }
                TF_Informacion.setText("Operacion Realizada");
            }
            else
            {
                TF_ID.setText("");
                TF_Hrs_E.setText("");
                TF_Pago.setText("");
                TF_Informacion.setText("No se encontro el ID");
            }
        }
    }//GEN-LAST:event_ComprobarActionPerformed
    
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
            java.util.logging.Logger.getLogger(Pantalla_Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Pagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comprobar;
    private javax.swing.JLabel L_Hrs;
    private javax.swing.JLabel L_Hrs_E;
    private javax.swing.JLabel L_ID;
    private javax.swing.JLabel L_Informacion;
    private javax.swing.JLabel L_Pago;
    private javax.swing.JLabel L_Tiempo;
    private javax.swing.JLabel L_Titulo;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField TF_Hrs;
    private javax.swing.JTextField TF_Hrs_E;
    private javax.swing.JTextField TF_ID;
    private javax.swing.JTextField TF_Informacion;
    private javax.swing.JTextField TF_Pago;
    // End of variables declaration//GEN-END:variables
}
