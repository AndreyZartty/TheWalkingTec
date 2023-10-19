/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoborrador;

/**
 *
 * @author XPC
 */
public class ThreadAcercamiento extends Thread{
    private boolean running = true;
    private boolean paused = false;
    private Char atacante;
    private Char atacado;

    public ThreadAcercamiento(Char atacante, Char atacado) {
        this.atacante = atacante;
        this.atacado = atacado;
    }
    
    @Override
    public void run() {
        while (running){
            
            try {
                sleep(200);
                if(atacante.getTipo().equals("Contacto")){
                    if (atacante.getPosX() == atacado.getPosX() && atacante.getPosY() == atacado.getPosY()){
                        while (atacante.getVida()> 0 || atacado.getVida()> 0){
                            sleep(200);
                            atacado.setVida(atacado.getVida()-atacante.getGolpe());
                        }
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
                    
                }else if(atacante.getTipo().equals("MedianoA") || atacante.getTipo().equals("Multiple") || atacante.getTipo().equals("Aereo") || atacante.getTipo().equals("Choque")){
                    if (atacante.getPosX() == atacado.getPosX() && atacante.getPosY() == atacado.getPosY()){ // cambiar a rango de alcance
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
