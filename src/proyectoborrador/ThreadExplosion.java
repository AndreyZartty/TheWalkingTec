/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoborrador;

/**
 *
 * @author XPC
 */
public class ThreadExplosion extends Thread{
    private boolean running = true;
    private boolean paused = false;
    private Char atacante;
    private Char atacado;
    private int disparoX;
    private int disparoY;

    public ThreadExplosion(Char atacante, Char atacado) {
        this.atacante = atacante;
        this.atacado = atacado;
    }
    
    @Override
    public void run() {
        while (running){
            if (atacado.getPosX() == atacante.getPosX() && atacado.getPosY() == atacante.getPosY()){
                // gif de ataque
                atacado.setVida(atacado.getVida()-atacante.getGolpe());
                atacante.setActivo(false);
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
