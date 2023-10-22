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
        gui.add(disparo);
        disparo.setBounds(disparoX, disparoY, 20, 20);
        disparo.setText("o");
        disparo.setVisible(false);

    }
    
    @Override
    public void run() {
        disparoX = atacante.getPosX();
        disparoY = atacante.getPosY();
        while (running){
            try {
                if (atacado.getPosX() == disparoX && atacado.getPosY() == disparoY){
                    // gif de ataque
                    atacado.setVida(atacado.getVida()-atacante.getGolpe());
                    disparo.setVisible(false);
                    detener();
                }
                else{
                    if (Math.sqrt((Math.abs(atacante.getPosX() - atacado.getPosX())^2) +(Math.abs(atacante.getPosY() - atacado.getPosY())^2)) <= 10){
                        sleep(50);
                        disparo.setVisible(true);
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
