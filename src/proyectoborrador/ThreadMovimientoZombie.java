/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoborrador;

/**
 *
 * @author XPC
 */
public class ThreadMovimientoZombie extends Thread {
    private boolean running = true;
    private boolean paused = false;
    private Zombie personaje;
    private int reliquiaX;
    private int reliquiaY;

    public ThreadMovimientoZombie(Zombie personaje) {
        this.personaje = personaje;
    }
    
    @Override
    public void run() {
        while (running){
            
            try {
                sleep(200);
                if (personaje.getPosX() == reliquiaX && personaje.getPosY() == reliquiaY){
                    detener();
                }else{
                    if (personaje.getPosX() > reliquiaX && personaje.getPosY() > reliquiaY){
                        personaje.setPosX(personaje.getPosX()+1);
                        personaje.setPosY(personaje.getPosY()+1);
                    }
                    else if (personaje.getPosX() > reliquiaX && personaje.getPosY() < reliquiaY){
                        personaje.setPosX(personaje.getPosX()+1);
                        personaje.setPosY(personaje.getPosY()-1);
                    }
                    else if (personaje.getPosX() < reliquiaX && personaje.getPosY() > reliquiaY){
                        personaje.setPosX(personaje.getPosX()-1);
                        personaje.setPosY(personaje.getPosY()+1);
                    }
                    else if (personaje.getPosX() < reliquiaX && personaje.getPosY() < reliquiaY){
                        personaje.setPosX(personaje.getPosX()-1);
                        personaje.setPosY(personaje.getPosY()-1);
                    }
                    else if (personaje.getPosX() == reliquiaX && personaje.getPosY() > reliquiaY){
                        personaje.setPosY(personaje.getPosY()+1);
                    }
                    else if (personaje.getPosX() == reliquiaX && personaje.getPosY() < reliquiaY){
                        personaje.setPosY(personaje.getPosY()-1);
                    }
                    else if (personaje.getPosX() > reliquiaX && personaje.getPosY() == reliquiaY){
                        personaje.setPosX(personaje.getPosX()+1);
                    }
                    else if (personaje.getPosX() < reliquiaX && personaje.getPosY() == reliquiaY){
                        personaje.setPosX(personaje.getPosX()-1);
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
