/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoborrador;

import javax.swing.JPanel;

/**
 *
 * @author XPC
 */
public class ThreadExplosion extends Thread{
    private boolean running = true;
    private boolean paused = false;
    private Char atacante;
    private Char atacado;
    private JPanel gui;


    public ThreadExplosion(Char atacante, Char atacado, JPanel gui) {
        this.atacante = atacante;
        this.atacado = atacado;
        this.gui = gui;
    }
    
    @Override
    public void run() {
        while (running){
            if (atacado.getPosX() == atacante.getPosX() && atacado.getPosY() == atacante.getPosY()){
                // gif de ataque
                atacado.setVida(atacado.getVida()-atacante.getGolpe());
                atacante.setVida(0);
                atacante.setActivo(false);
                atacante.getLabel().setVisible(false);
                detener();
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
