/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoborrador;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DropTarget;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;
import javax.swing.border.Border;
import static proyectoborrador.FileManager.readObject;


/**
 *
 * @author Lenovo
 */
public class MatrixGUI extends javax.swing.JFrame {
    public ArrayList<Zombie> Zombies;
    public ArrayList<Arma> Armas;


    /**
     * Creates new form MatrixGUI
     */
    public MatrixGUI() {
       Zombies = new ArrayList<Zombie>();
       Armas = new ArrayList<Arma>();
        initComponents();
        
        
    jPanelConMatriz.setLayout(new GridLayout(25, 25));
    jPanelConMatriz.setTransferHandler(new TransferHandler("icon"));
    jPanelConMatriz.setDropTarget(new DropTarget());
    Border border = BorderFactory.createLineBorder(java.awt.Color.BLACK);

    JLabel[][] matrizDeEtiquetas = new JLabel[25][25];

    for (int i = 0; i < 25; i++) {
        for (int j = 0; j < 25; j++) {
            matrizDeEtiquetas[i][j] = new JLabel("dd" + i + j);
            matrizDeEtiquetas[i][j].setText("");
            matrizDeEtiquetas[i][j].setBorder(border);
            matrizDeEtiquetas[i][j].addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
        JLabel etiquetaClickeada = (JLabel) e.getSource();

        // Comprueba si hay una imagen en el portapapeles (arrastrada desde jPanelDrag)
        Transferable transferable = getToolkit().getSystemClipboard().getContents(this);

        if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.imageFlavor)) {
            try {
                // Obtiene la imagen del portapapeles
                ImageIcon imagenArrastrada = (ImageIcon) transferable.getTransferData(DataFlavor.imageFlavor);

                // Clona la imagen
                ImageIcon imagenClonada = new ImageIcon(imagenArrastrada.getImage());

                // Configura la imagen clonada en la etiqueta de la matriz
                etiquetaClickeada.setIcon(imagenClonada);

                // Opcionalmente, puedes mantener la imagen original en jPanelDrag
                // para futuros arrastres
                JLabel labelOrigen = (JLabel) jPanelDrag.getComponent(0);  // El primer componente es el JLabel
                labelOrigen.setIcon(imagenArrastrada);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
});
            jPanelConMatriz.add(matrizDeEtiquetas[i][j]);
        }
    }

    // Establecer el panelConMatriz como el componente central de la ventana
    getContentPane().add(jPanelConMatriz, BorderLayout.CENTER);

    //JPanel panelArrastrarSoltar = new JPanel();
    
    // Agrega componentes y funcionalidad de arrastrar y soltar a este panel

    getContentPane().add(jPanelDrag, BorderLayout.NORTH);  // Opcionalmente, puedes cambiar el layout para el panel de arrastrar y soltar

    
    agregarObjects();
    agregarArmas();
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
        jPanel2 = new javax.swing.JPanel();
        jPanelConMatriz = new javax.swing.JPanel();
        jPanelDrag = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelConMatriz.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanelConMatrizLayout = new javax.swing.GroupLayout(jPanelConMatriz);
        jPanelConMatriz.setLayout(jPanelConMatrizLayout);
        jPanelConMatrizLayout.setHorizontalGroup(
            jPanelConMatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanelConMatrizLayout.setVerticalGroup(
            jPanelConMatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelConMatriz, java.awt.BorderLayout.LINE_END);

        jPanelDrag.setBackground(new java.awt.Color(204, 255, 255));
        jPanelDrag.setLayout(new java.awt.GridLayout());
        getContentPane().add(jPanelDrag, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MatrixGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatrixGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatrixGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatrixGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatrixGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelConMatriz;
    private javax.swing.JPanel jPanelDrag;
    // End of variables declaration//GEN-END:variables

public void agregarObjects (){
    String folderPath = "C:\\Users\\Lenovo\\Desktop\\POO\\objetos"; 
        

        File folder = new File(folderPath);

        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".dat")) {
                        
                        Object obj = readObject(file.getAbsolutePath());

                        if (obj != null && obj instanceof Zombie) {
                            Zombie ZombieLeido = (Zombie) obj;
                            Zombies.add(ZombieLeido);
                            System.out.println("Objeto leído y agregado al ArrayList: " + obj);
                        } 
                        if(obj != null && obj instanceof Arma){
                            Arma ArmaLeida = (Arma) obj;
                            Armas.add(ArmaLeida);
                            System.out.println("Objeto leído y agregado al ArrayList: " + obj);
                            
                            
                            
                        }else {
                            System.out.println("No se pudo leer el objeto desde el archivo: " + file.getName());
                        }
                    }
                }
            }
        } else {
            System.out.println("La carpeta no existe o no es una carpeta válida.");
        }

        // En este punto, todos los objetos en objectList, en teoria xd.
    }


public void agregarArmas(){
    jPanelDrag.setLayout(new FlowLayout(FlowLayout.LEFT));
    for (Arma arma : Armas) {
        System.out.println(arma.getGif());
    // Obtén la ruta de la imagen de tu objeto Arma
    String rutaImagen = arma.getGif();

    // Cargar la imagen y redimensionarla
ImageIcon icon = new ImageIcon(new ImageIcon(rutaImagen).getImage().getScaledInstance(250, 200, Image.SCALE_SMOOTH));

// Crear el JLabel con el ImageIcon
JLabel labelArma = new JLabel(icon);

    // Establece un TransferHandler en el JLabel para permitir el arrastre
    labelArma.setTransferHandler(new TransferHandler("icon") {
        @Override
        protected Transferable createTransferable(JComponent c) {
            return new DataHandler(c, DataFlavor.imageFlavor.getMimeType());
            
        }
    });
    System.out.println("holaaaaaa");

    // Agrega un MouseListener para iniciar el arrastre
    labelArma.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            JComponent c = (JComponent) e.getSource();
            TransferHandler handler = c.getTransferHandler();
            handler.exportAsDrag(c, e, TransferHandler.COPY);
        }
    });

    // Agrega el JLabel al panel de arrastre (paneldrag)
    jPanelDrag.add(labelArma);
       

}
}






}
