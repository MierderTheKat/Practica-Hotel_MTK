package U2_Ejercicio_Hotel_Interfaz;

/**
 *
 * @author MierderTheKat
 */
public class Pantalla_Info_Tabla extends javax.swing.JFrame {
    
    public Pantalla_Info_Tabla() {
        initComponents();
        
        String matriz [] [] = new String [Pantalla_Inicial.Array.size()] [7];
        
        for(int i=0; i<Pantalla_Inicial.Array.size(); i++)
        {
            String empleado = Pantalla_Inicial.Array.get(i).getPuesto();
            switch(empleado)
            {
                case "Recepcionista":
                    Agregar(matriz,i);
                    if(Pantalla_Inicial.Array.get(i).getNoche() == true)
                    {
                        matriz [i] [5] = " SI";
                    }
                    else
                    {
                        matriz [i] [5] = " NO";
                    }
                    matriz [i] [6] = "    --";
                    break;
                case "Portero":
                    Agregar(matriz,i);
                    if(Pantalla_Inicial.Array.get(i).getEdad_Avanz() == true)
                    {
                        matriz [i] [5] = " SI";
                    }
                    else
                    {
                        matriz [i] [5] = " NO";
                    }
                    matriz [i] [6] = "    --";
                    break;
                case "Botones":
                    Agregar(matriz,i);
                    matriz [i] [5] = "    --";
                    matriz [i] [6] = " " + Pantalla_Inicial.Array.get(i).getPeso()+"Kg";
                    break;
                case "Mucama":
                    Agregar(matriz,i);
                    matriz [i] [5] = "    --";
                    matriz [i] [6] = "    --";
                    break;
                case "Cocinero":
                    Agregar(matriz,i);
                    if(Pantalla_Inicial.Array.get(i).getTitulo() == true)
                    {
                        matriz [i] [5] = " SI";
                    }
                    else
                    {
                        matriz [i] [5] = " NO";
                    }
                    matriz [i] [6] = " " + Pantalla_Inicial.Array.get(i).getEspecialidad();
                    break;
                default:

                    break;
            }
            
            T_Empleados.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "ID", "Nombre", "Nacimiento", "Sueldo", "Puesto", "Pregunta Si/No", "Pregunta abierta"
            }
           ){

            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
            });
        }
    }
    
        public void Agregar(String[][] matriz, int i)
        {
            matriz [i] [0] = " " + Pantalla_Inicial.Array.get(i).getId_Empleado();
            matriz [i] [1] = " " + Pantalla_Inicial.Array.get(i).getNombre();
            matriz [i] [2] = " " + Pantalla_Inicial.Array.get(i).getFech_Nac();
            matriz [i] [3] = " " + Pantalla_Inicial.Array.get(i).getSueldo() + "$";
            matriz [i] [4] = " " + Pantalla_Inicial.Array.get(i).getPuesto();
        }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_Empleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        T_Empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Nacimiento", "Sueldo", "Puesto", "Pregunta Si/No", "Pregunta abierta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        T_Empleados.setRowHeight(25);
        jScrollPane1.setViewportView(T_Empleados);
        if (T_Empleados.getColumnModel().getColumnCount() > 0) {
            T_Empleados.getColumnModel().getColumn(0).setResizable(false);
            T_Empleados.getColumnModel().getColumn(0).setPreferredWidth(12);
            T_Empleados.getColumnModel().getColumn(1).setResizable(false);
            T_Empleados.getColumnModel().getColumn(2).setResizable(false);
            T_Empleados.getColumnModel().getColumn(3).setResizable(false);
            T_Empleados.getColumnModel().getColumn(4).setResizable(false);
            T_Empleados.getColumnModel().getColumn(5).setResizable(false);
            T_Empleados.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Regresar)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Regresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        Pantalla_Info info = new Pantalla_Info();
        info.setVisible(true); //Se hace visible
        info.setLocationRelativeTo(null);//Se centra
        info.setResizable(false);//Evita que estiren la pantalla
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed
    
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
            java.util.logging.Logger.getLogger(Pantalla_Info_Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Info_Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Info_Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Info_Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Info_Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar;
    private javax.swing.JTable T_Empleados;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
