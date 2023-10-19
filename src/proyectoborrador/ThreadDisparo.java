/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoborrador;

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

    public ThreadDisparo(Char atacante, Char atacado) {
        this.atacante = atacante;
        this.atacado = atacado;
    }
    
    @Override
    public void run() {
        disparoX = atacante.getPosX();
        disparoY = atacante.getPosY();
        while (running){
            
            try {
                sleep(200);
                if (atacado.getPosX() == disparoX && atacado.getPosY() == disparoY){
                    // gif de ataque
                    atacado.setVida(atacado.getVida()-atacante.getGolpe());
                    detener();
                }
                else{
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
