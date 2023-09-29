/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoborrador;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class VentanaDelMenu extends javax.swing.JFrame {

    /**
     * Creates new form VentanaDelMenu
     */
    public VentanaDelMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        lblArma = new javax.swing.JLabel();
        lblZombie = new javax.swing.JLabel();
        lblResistencia = new javax.swing.JLabel();
        lblTipo1 = new javax.swing.JLabel();
        lblGolpe = new javax.swing.JLabel();
        lblAparicion = new javax.swing.JLabel();
        lblCampo = new javax.swing.JLabel();
        lblgif = new javax.swing.JLabel();
        lblgif1 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        txtTipo1 = new javax.swing.JTextField();
        txtResistencia = new javax.swing.JTextField();
        txtResistencia1 = new javax.swing.JTextField();
        txtGolpe = new javax.swing.JTextField();
        txtGolpe1 = new javax.swing.JTextField();
        txtAparicion = new javax.swing.JTextField();
        txtAparicion1 = new javax.swing.JTextField();
        txtGIF1Arma = new javax.swing.JTextField();
        txtGIF1Zombie = new javax.swing.JTextField();
        txtCampo = new javax.swing.JTextField();
        txtGIF2Arma = new javax.swing.JTextField();
        txtGIF2Zombie = new javax.swing.JTextField();
        btnCrearZombie = new javax.swing.JButton();
        btnCrearArma = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtNombre1 = new javax.swing.JTextField();
        txtCampo1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 234, 246));
        jPanel1.setForeground(new java.awt.Color(102, 255, 204));

        lblArma.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lblArma.setText("arma lol");

        lblZombie.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lblZombie.setText("ZOMBIEEEE");

        lblResistencia.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lblResistencia.setText("Resistencia");

        lblTipo1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lblTipo1.setText("Tipo");

        lblGolpe.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lblGolpe.setText("Golpe");

        lblAparicion.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lblAparicion.setText("Aparición");

        lblCampo.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lblCampo.setText("Campo");

        lblgif.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lblgif.setText("GIF 1");

        lblgif1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lblgif1.setText("GIF 2");

        btnCrearZombie.setBackground(new java.awt.Color(0, 0, 204));
        btnCrearZombie.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        btnCrearZombie.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearZombie.setText("Crear Zombieeee");
        btnCrearZombie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearZombieActionPerformed(evt);
            }
        });

        btnCrearArma.setBackground(new java.awt.Color(0, 0, 204));
        btnCrearArma.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        btnCrearArma.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearArma.setText("Crear Arma");
        btnCrearArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearArmaActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        lblNombre.setText("Nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrearZombie, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnCrearArma, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo1)
                    .addComponent(lblResistencia)
                    .addComponent(lblGolpe)
                    .addComponent(lblAparicion)
                    .addComponent(lblCampo)
                    .addComponent(lblgif)
                    .addComponent(lblgif1)
                    .addComponent(lblNombre))
                .addGap(114, 114, 114)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblZombie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblArma)
                        .addGap(61, 61, 61))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                        .addComponent(txtTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtResistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtResistencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtGIF2Zombie, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGIF2Arma, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtGIF1Zombie, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGIF1Arma, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtAparicion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAparicion1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtGolpe, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGolpe1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZombie)
                    .addComponent(lblArma))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblTipo1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResistencia)
                    .addComponent(txtResistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResistencia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGolpe)
                    .addComponent(txtGolpe, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGolpe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAparicion)
                        .addComponent(txtAparicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtAparicion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblgif)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblgif1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGIF1Arma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGIF1Zombie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(txtGIF2Arma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(txtGIF2Zombie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCampo)
                    .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearZombie)
                    .addComponent(btnCrearArma))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    private void btnCrearZombieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearZombieActionPerformed
    String nombre = txtNombre.getText().trim(); //el trim quita los espacios
    String tipo = txtTipo.getText().trim(); 
    String Strresistencia = txtResistencia.getText().trim(); 
    String Strgolpe = txtGolpe.getText().trim();
    String Straparicion = txtAparicion.getText().trim(); 
    String Gif = txtGIF1Zombie.getText().trim();
    String Gif2 = txtGIF2Zombie.getText().trim();
    String StrCampo = txtCampo.getText().trim();
    
    
    int resistencia = Integer.parseInt(Strresistencia);
    int golpe = Integer.parseInt(Strgolpe);
    int aparicion = Integer.parseInt(Straparicion);
    int campo = Integer.parseInt(StrCampo);
    
    zombie zombie1 = new zombie(nombre, tipo, resistencia, golpe, aparicion, Gif, Gif2, campo);
    
    String nombreObject = nombre + ".dat";
    System.out.println(nombreObject);
    
    
    FileManager.writeObject(zombie1, nombreObject);
    
    
    
    System.out.println(zombie1);
        
    
    JOptionPane.showMessageDialog(rootPane, zombie1, "zombie creado", JOptionPane.OK_OPTION);
    
    
    
    }//GEN-LAST:event_btnCrearZombieActionPerformed

    private void btnCrearArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearArmaActionPerformed
    String nombre = txtNombre1.getText().trim(); //el trim quita los espacios
    String tipo = txtTipo1.getText().trim(); 
    String Strresistencia = txtResistencia1.getText().trim(); 
    String Strgolpe = txtGolpe1.getText().trim();
    String Straparicion = txtAparicion1.getText().trim(); 
    String Gif = txtGIF1Arma.getText().trim();
    String Gif2 = txtGIF1Arma.getText().trim();
    String StrCampo = txtCampo1.getText().trim();
    
    
    int resistencia = Integer.parseInt(Strresistencia);
    int golpe = Integer.parseInt(Strgolpe);
    int aparicion = Integer.parseInt(Straparicion);
    int campo = Integer.parseInt(StrCampo);
    
    
    arma arma1 = new arma(nombre, tipo, resistencia, golpe, aparicion, Gif, Gif2, campo);
    
    String nombreObject = nombre + ".dat";
    
    
    
    FileManager.writeObject(arma1, nombreObject);
    
    System.out.println(arma1);
        
    
    JOptionPane.showMessageDialog(rootPane, arma1, "Arma creada", JOptionPane.OK_OPTION);
    }//GEN-LAST:event_btnCrearArmaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaDelMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDelMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDelMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDelMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaDelMenu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearArma;
    private javax.swing.JButton btnCrearZombie;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAparicion;
    private javax.swing.JLabel lblArma;
    private javax.swing.JLabel lblCampo;
    private javax.swing.JLabel lblGolpe;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblResistencia;
    private javax.swing.JLabel lblTipo1;
    private javax.swing.JLabel lblZombie;
    private javax.swing.JLabel lblgif;
    private javax.swing.JLabel lblgif1;
    private javax.swing.JTextField txtAparicion;
    private javax.swing.JTextField txtAparicion1;
    private javax.swing.JTextField txtCampo;
    private javax.swing.JTextField txtCampo1;
    private javax.swing.JTextField txtGIF1Arma;
    private javax.swing.JTextField txtGIF1Zombie;
    private javax.swing.JTextField txtGIF2Arma;
    private javax.swing.JTextField txtGIF2Zombie;
    private javax.swing.JTextField txtGolpe;
    private javax.swing.JTextField txtGolpe1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtResistencia;
    private javax.swing.JTextField txtResistencia1;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtTipo1;
    // End of variables declaration//GEN-END:variables
}
