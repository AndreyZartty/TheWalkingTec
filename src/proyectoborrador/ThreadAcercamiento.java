/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoborrador;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author XPC
 */
public class ThreadAcercamiento extends Thread{
    private boolean running = true;
    private boolean paused = false;
    private Char atacante;
    private Char atacado;
    private JPanel gui;
    private JLabel zombie = new JLabel();
    private JFrame frame;



    public ThreadAcercamiento(Char atacante, Char atacado, JPanel gui) {
        this.atacante = atacante;
        this.atacado = atacado;
        this.gui = gui;
        ImageIcon icon = new ImageIcon(new ImageIcon(atacante.getGif()).getImage().getScaledInstance(45, 30, Image.SCALE_SMOOTH));
        zombie.setPreferredSize(new Dimension(45, 30));
        zombie.setLocation(atacante.getPosX(), atacante.getPosY());
        zombie.setVisible(false);
        gui.add(zombie);
        
    }
    
    @Override
    public void run() {
        while (running){
            try {
                if(atacante.getTipo().equals("AContacto")){
                    if (atacante.getPosX() == atacado.getPosX() && atacante.getPosY() == atacado.getPosY()){
                        if (atacante.getVida()> 0 || atacado.getVida()> 0){
                            sleep(1000);
                            atacado.setVida(atacado.getVida()-atacante.getGolpe());
                        }else{
                            detener();
                        }
                    }
                }else if (atacante.getTipo().equals("Contacto")){
                    zombie.setVisible(true);
                    if (atacante.getPosX() == atacado.getPosX() && atacante.getPosY() == atacado.getPosY()){
                        if (atacante.getVida()> 0 || atacado.getVida()> 0){
                            sleep(1000);
                            atacado.setVida(atacado.getVida()-atacante.getGolpe());
                        }else{
                            detener();
                        }
                    }
                    else{
                        sleep(1000);
                        if (atacante.getPosX() > atacado.getPosX() && atacante.getPosY() > atacado.getPosY()){
                            atacante.setPosX(atacante.getPosX()-1);
                            atacante.setPosY(atacante.getPosY()-1);
                        }
                        else if (atacante.getPosX() > atacado.getPosX() && atacante.getPosY() < atacado.getPosY()){
                            atacante.setPosX(atacante.getPosX()-1);
                            atacante.setPosY(atacante.getPosY()+1);
                        }
                        else if (atacante.getPosX() < atacado.getPosX() && atacante.getPosY() > atacado.getPosY()){
                            atacante.setPosX(atacante.getPosX()+1);
                            atacante.setPosY(atacante.getPosY()-1);
                        }
                        else if (atacante.getPosX() < atacado.getPosX() && atacante.getPosY() < atacado.getPosY()){
                            atacante.setPosX(atacante.getPosX()+1);
                            atacante.setPosY(atacante.getPosY()+1);
                        }
                        else if (atacante.getPosX() == atacado.getPosX() && atacante.getPosY() > atacado.getPosY()){
                            atacante.setPosY(atacante.getPosY()-1);
                        }
                        else if (atacante.getPosX() == atacado.getPosX() && atacante.getPosY() < atacado.getPosY()){
                            atacante.setPosY(atacante.getPosY()+1);
                        }
                        else if (atacante.getPosX() > atacado.getPosX() && atacante.getPosY() == atacado.getPosY()){
                            atacante.setPosX(atacante.getPosX()-1);
                        }
                        else if (atacante.getPosX() < atacado.getPosX() && atacante.getPosY() == atacado.getPosY()){
                            atacante.setPosX(atacante.getPosX()+1);
                        }
                    }
                    zombie.setLocation(atacante.getPosX(), atacante.getPosY());
                    gui.repaint();
                }else if (atacante.getTipo().equals("Choque")){
                    zombie.setVisible(true);
                    if (atacante.getPosX() == atacado.getPosX() && atacante.getPosY() == atacado.getPosY()){
                        detener();

                    }
                    else{
                        sleep(1000);
                        if (atacante.getPosX() > atacado.getPosX() && atacante.getPosY() > atacado.getPosY()){
                            atacante.setPosX(atacante.getPosX()+1);
                            atacante.setPosY(atacante.getPosY()+1);
                        }
                        else if (atacante.getPosX() > atacado.getPosX() && atacante.getPosY() < atacado.getPosY()){
                            atacante.setPosX(atacante.getPosX()+1);
                            atacante.setPosY(atacante.getPosY()-1);
                        }
                        else if (atacante.getPosX() < atacado.getPosX() && atacante.getPosY() > atacado.getPosY()){
                            atacante.setPosX(atacante.getPosX()-1);
                            atacante.setPosY(atacante.getPosY()+1);
                        }
                        else if (atacante.getPosX() < atacado.getPosX() && atacante.getPosY() < atacado.getPosY()){
                            atacante.setPosX(atacante.getPosX()-1);
                            atacante.setPosY(atacante.getPosY()-1);
                        }
                        else if (atacante.getPosX() == atacado.getPosX() && atacante.getPosY() > atacado.getPosY()){
                            atacante.setPosY(atacante.getPosY()+1);
                        }
                        else if (atacante.getPosX() == atacado.getPosX() && atacante.getPosY() < atacado.getPosY()){
                            atacante.setPosY(atacante.getPosY()-1);
                        }
                        else if (atacante.getPosX() > atacado.getPosX() && atacante.getPosY() == atacado.getPosY()){
                            atacante.setPosX(atacante.getPosX()+1);
                        }
                        else if (atacante.getPosX() < atacado.getPosX() && atacante.getPosY() == atacado.getPosY()){
                            atacante.setPosX(atacante.getPosX()-1);
                        }
                    }
                    zombie.setLocation(atacante.getPosX(), atacante.getPosY());
                    gui.repaint();
                    
                }
                else if(atacante.getTipo().equals("MedianoA") || atacante.getTipo().equals("Multiple") || atacante.getTipo().equals("Aereo")){
                    zombie.setVisible(true);
                    sleep(1000);
                    if (Math.sqrt(((atacante.getPosX()-atacado.getPosX())^2) +((atacante.getPosY() -atacado.getPosY())^2)) <= 20){ // cambiar a rango de alcance
                        zombie.setLocation(atacante.getPosX(), atacante.getPosY());
                        //gui.repaint();
                        detener();

                    }
                    else{
                        if (atacante.getPosX() > atacado.getPosX() && atacante.getPosY() > atacado.getPosY()){
                            atacante.setPosX(atacante.getPosX()+1);
                            atacante.setPosY(atacante.getPosY()+1);
                        }
                        else if (atacante.getPosX() > atacado.getPosX() && atacante.getPosY() < atacado.getPosY()){
                            atacante.setPosX(atacante.getPosX()+1);
                            atacante.setPosY(atacante.getPosY()-1);
                        }
                        else if (atacante.getPosX() < atacado.getPosX() && atacante.getPosY() > atacado.getPosY()){
                            atacante.setPosX(atacante.getPosX()-1);
                            atacante.setPosY(atacante.getPosY()+1);
                        }
                        else if (atacante.getPosX() < atacado.getPosX() && atacante.getPosY() < atacado.getPosY()){
                            atacante.setPosX(atacante.getPosX()-1);
                            atacante.setPosY(atacante.getPosY()-1);
                        }
                        else if (atacante.getPosX() == atacado.getPosX() && atacante.getPosY() > atacado.getPosY()){
                            atacante.setPosY(atacante.getPosY()+1);
                        }
                        else if (atacante.getPosX() == atacado.getPosX() && atacante.getPosY() < atacado.getPosY()){
                            atacante.setPosY(atacante.getPosY()-1);
                        }
                        else if (atacante.getPosX() > atacado.getPosX() && atacante.getPosY() == atacado.getPosY()){
                            atacante.setPosX(atacante.getPosX()+1);
                        }
                        else if (atacante.getPosX() < atacado.getPosX() && atacante.getPosY() == atacado.getPosY()){
                            atacante.setPosX(atacante.getPosX()-1);
                        }
                    }
                    zombie.setLocation(atacante.getPosX(), atacante.getPosY());
                    gui.repaint();
                    
                }
                

            } catch (InterruptedException ex) {
                
            }       
        }
    }
    
    /**
     * Metodo para verificar el estado del hilo
     * @return boolean
     */
    public boolean isRunning() {
        return running;
    }
    
    /**
     * Metodo para detener el hilo
     */
    public void detener(){
        this.running = false;
    }
    
}
