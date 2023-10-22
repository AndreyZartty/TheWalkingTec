/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoborrador;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author XPC
 */
public class ThreadDisparo extends Thread {
    private boolean running = true;
    private boolean paused = false;
    private Char atacante;
    private Char atacado;
    private int disparoX;
    private int disparoY;
    private JLabel disparo = new JLabel();
    private JPanel gui;

    public ThreadDisparo(Char atacante, Char atacado, JPanel gui) {
        this.atacante = atacante;
        this.atacado = atacado;
        this.gui = gui;
        disparoX = atacante.getPosX();
        disparoY = atacante.getPosY();
        disparo.setPreferredSize(new Dimension(10, 10));
        disparo.setLocation(disparoX, disparoY);
        disparo.setText("o");
        gui.add(disparo);
    }
    
    @Override
    public void run() {
        disparo.setVisible(true);
        while (running){
            
            try {
                if (atacado.getPosX() == disparoX && atacado.getPosY() == disparoY){
                    // gif de ataque
                    atacado.setVida(atacado.getVida()-atacante.getGolpe());
                    disparo.setVisible(false);
                    detener();
                }
                else{
                    if (Math.sqrt(((atacante.getPosX()-atacado.getPosX())^2) +((atacante.getPosY() -atacado.getPosY())^2)) <= 20){
                        sleep(200);
                        if (atacado.getPosX() > disparoX && atacado.getPosY() > disparoY){
                            disparoX++;
                            disparoY++;
                        }
                        else if (atacado.getPosX() > disparoX && atacado.getPosY() < disparoY){
                            disparoX++;
                            disparoY--;
                        }
                        else if (atacado.getPosX() < disparoX && atacado.getPosY() > disparoY){
                            disparoX--;
                            disparoY++;
                        }
                        else if (atacado.getPosX() < disparoX && atacado.getPosY() < disparoY){
                            disparoX--;
                            disparoY--;
                        }
                        else if (atacado.getPosX() == disparoX && atacado.getPosY() > disparoY){
                            disparoY++;
                        }
                        else if (atacado.getPosX() == disparoX && atacado.getPosY() < disparoY){
                            disparoY--;
                        }   
                        else if (atacado.getPosX() > disparoX && atacado.getPosY() == disparoY){
                            disparoX++;
                        }
                        else if (atacado.getPosX() < disparoX && atacado.getPosY() == disparoY){
                            disparoX--;
                        }
                        disparo.setLocation(disparoX, disparoY);
                        gui.repaint();

                    }
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
