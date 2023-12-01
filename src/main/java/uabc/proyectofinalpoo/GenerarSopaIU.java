/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uabc.proyectofinalpoo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase de interfaz grafica de usuario
 *
 * @author Leonel Araujo 1182833
 */
public class GenerarSopaIU extends javax.swing.JFrame {

    //Parametros 
    private ArrayList<String> listaTextos = new ArrayList<>();
    private ArrayList<String> listaTextos2 = new ArrayList<>();
    private ArrayList<String> palabras = new ArrayList<>();
    private char[][] sopa = new char[15][15];

    /**
     * Creates new form GenerarSopaIU
     */
    public GenerarSopaIU() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField1.setMaximumSize(new java.awt.Dimension(10, 1));
        jTextField1.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Generador de Sopas Numericas y Alfabeticas");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("Texto a Ingresar:");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 10)); // NOI18N
        jLabel3.setText("(0-10 caracteres sin espacios)");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("Elementos Ingresados");

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jButton1.setText("Generar Sopa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jButton2.setActionCommand("Guardar Sopa");
        jButton2.setLabel("Guardar Sopa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setText("Nombre archivo:");

        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField2.setMaximumSize(new java.awt.Dimension(10, 1));
        jTextField2.setMinimumSize(new java.awt.Dimension(0, 0));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 10)); // NOI18N
        jLabel8.setText("Para leer/guardar archivo");

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setFont(new java.awt.Font("Trebuchet MS", 2, 18)); // NOI18N
        jButton3.setText("Leer Sopa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Sopa De Letras"));
        jTextArea1.setPreferredSize(new java.awt.Dimension(330, 330));
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextArea2.setPreferredSize(new java.awt.Dimension(330, 330));
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5)
                                .addComponent(jLabel8)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton2))
                        .addGap(49, 49, 49))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método invocado cuando se realiza una acción en el componente jTextField1.
     * Captura el texto ingresado, lo convierte a mayúsculas y lo añade a la lista de palabras.
     * Si el texto tiene una longitud válida (entre 1 y 10 caracteres) y no contiene espacios,
     * actualiza el fondo del jTextField1 a verde y muestra el texto en el jTextArea2.
     * En caso contrario, marca el fondo del jTextField1 en rojo y muestra un mensaje en la consola.
     * Finalmente, reinicia el contenido del cuadro de texto jTextField1.
     * @param evt 
     */
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

        String textoIngresado = jTextField1.getText();
        textoIngresado = textoIngresado.toUpperCase();
        palabras.add(textoIngresado);

        if (textoIngresado.length() >= 1 && textoIngresado.length() <= 10 && !textoIngresado.contains(" ")) {
        // El texto tiene una longitud válida (entre 1 y 10 caracteres) y no contiene espacios
        jTextField1.setBackground(Color.green);

        listaTextos.add(textoIngresado);
        // Actualiza el jTextArea2 para mostrar los textos ingresados
        StringBuilder contenido = new StringBuilder();
        for (String texto : listaTextos) {
            contenido.append(texto).append("\n");
        }
        jTextArea2.setText(contenido.toString());
        System.out.println("Texto válido: " + textoIngresado);
    } else {
        jTextField1.setBackground(Color.red);
        // El texto no cumple con el rango de longitud deseado
        System.out.println("Texto no válido (longitud fuera de rango o contiene espacios).");
    }
    // Reinicia el cuadro de texto
    jTextField1.setText("");
    }//GEN-LAST:event_jTextField1ActionPerformed

    
    /**
     * Método invocado cuando se realiza una acción en el botón jButton1. Genera
     * una sopa de letras utilizando las palabras ingresadas en el campo de
     * texto jTextField1. Luego, muestra la sopa de letras generada en el
     * componente jTextArea1.
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        sopa = GenerarSopa.generarSopa(palabras);

        // Supongamos que tienes un JTextArea llamado 'jTextArea1'
        jTextArea1.setText(GenerarSopa.mostrarSopa(sopa));
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Metodo que solo existe para mantener un texto hasta que se use
     * @param evt 
     */
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        //Solo existe
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * Método invocado cuando se realiza una acción en el botón jButton2.
     * Captura el texto ingresado en el campo de texto jTextField2. Obtiene el
     * contenido actual del jTextArea1. Crea un ArrayList con el
     * contenido del JTextArea. Crea un archivo con el nombre proporcionado en
     * el campo de texto. Escribe el contenido actualizado del JTextArea en el
     * archivo. Finalmente, reinicia el contenido del campo de texto jTextField2.
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String textoIngresado = jTextField2.getText();
        
        String contenidoTextArea = jTextArea1.getText();

    // Crear un ArrayList con el contenido del JTextArea
    ArrayList<String> contenidoArrayList = new ArrayList<>(Arrays.asList(contenidoTextArea.split("\n")));
    
    //Crear archivo
    AdministrarArchivos.crearArchivo(textoIngresado);

    // Escribir el contenido actualizado en un archivo
    AdministrarArchivos.escribirArchivo(textoIngresado, contenidoArrayList, false);
        
    jTextField2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * Método invocado cuando se realiza una acción en el botón jButton3.
     * Captura el texto ingresado en el campo de texto jTextField2. Lee el
     * contenido de un archivo con el nombre proporcionado en el campo de texto.
     * Muestra el contenido del archivo en el JTextArea jTextArea1. Finalmente,
     * reinicia el contenido del campo de texto jTextField2.
     * @param evt 
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String textoIngresado = jTextField2.getText();
        
        
        jTextArea1.setText(AdministrarArchivos.leerArchivo(textoIngresado));
        jTextField2.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(GenerarSopaIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarSopaIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarSopaIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarSopaIU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerarSopaIU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
