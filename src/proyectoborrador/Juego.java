/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoborrador;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author XPC
 */
public class Juego extends Thread{
    private int nivel;
    private Partida partidaActual;
    private String nombrePartida= "";
    private JPanel GUI;
    private boolean playing;
    private JLabel[][] matriz;
    
    
    public Juego(JPanel gui, JLabel[][] matriz, Partida partidaActual){
        this.playing = true;
        this.GUI = gui;
        this.partidaActual = partidaActual;
        this.nombrePartida = partidaActual.getNombre();
        this.matriz = matriz;
    }
    
    @Override
    public void run(){
        while (playing){
            int muertos = 0;
            partidaActual.eliminarMuertos(matriz);
            for (int i = 0; i < partidaActual.getArmas().size(); i++) {
                if(partidaActual.getArmas().get(i).getObjetivo() == null && partidaActual.getArmas().get(i).isActivo()){
                    Zombie objetivo = null;
                    for (int j = 0; j < partidaActual.getZombies().size(); j++) {
                        if (objetivo == null && compatibles(partidaActual.getArmas().get(i),partidaActual.getZombies().get(j)) && partidaActual.getZombies().get(j).isActivo()){
                            objetivo = partidaActual.getZombies().get(j);
                        }
                        else{
                            if(compatibles(partidaActual.getArmas().get(i),partidaActual.getZombies().get(j)) && partidaActual.getZombies().get(j).isActivo()){
                                int x1 = partidaActual.getArmas().get(i).getPosX();
                                int x2 = partidaActual.getZombies().get(j).getPosX();
                                int y1 = partidaActual.getArmas().get(i).getPosY();
                                int y2 = partidaActual.getZombies().get(j).getPosY();
                                if( Math.sqrt(((x2-x1)^2) +((y2-y1)^2)) < Math.sqrt(((objetivo.getPosX()-x1)^2) +((objetivo.getPosY()-y1)^2)) ){
                                    objetivo = partidaActual.getZombies().get(j);
                                }
                            }
                            
                        }
                        
                        
                    }
                partidaActual.getArmas().get(i).setObjetivo(objetivo);    
                    
                }
                
                
            }
            
            for (int i = 0; i < partidaActual.getZombies().size(); i++) {
                if(partidaActual.getZombies().get(i).getObjetivo() == null && partidaActual.getZombies().get(i).isActivo()){
                    Arma objetivo = null;
                    for (int j = 0; j < partidaActual.getArmas().size(); j++) {
                        if (objetivo == null && compatibles(partidaActual.getZombies().get(i), partidaActual.getArmas().get(j)) && partidaActual.getArmas().get(j).isActivo()){
                            objetivo = partidaActual.getArmas().get(j);
                        }
                        else{
                            if(compatibles(partidaActual.getZombies().get(i), partidaActual.getArmas().get(j)) && partidaActual.getArmas().get(j).isActivo()){
                                int x2 = partidaActual.getArmas().get(j).getPosX();
                                int x1 = partidaActual.getZombies().get(i).getPosX();
                                int y2 = partidaActual.getArmas().get(j).getPosY();
                                int y1 = partidaActual.getZombies().get(i).getPosY();
                                if( Math.sqrt((Math.abs(x2-x1)^2) +(Math.abs(y2-y1)^2)) < Math.sqrt((Math.abs(objetivo.getPosX()-x1)^2) +(Math.abs(objetivo.getPosY()-y1)^2)) ){
                                    objetivo = partidaActual.getArmas().get(j);
                                }
                            }
                            
                        }
                        
                        
                    }
                partidaActual.getZombies().get(i).setObjetivo(objetivo);    
                    
                }
                
                
            }
            
            for (int i = 0; i < partidaActual.getArmas().size(); i++) {
                if(partidaActual.getArmas().get(i).isActivo() && partidaActual.getArmas().get(i).getAtaque().isEmpty()){
                   partidaActual.getArmas().get(i).atacar();
                }
                else if(!partidaActual.getArmas().get(i).isActivo()){
                    muertos++;
                }else if (!partidaActual.getArmas().get(i).getAtaque().isEmpty()){
                    for (int j = 0; j < partidaActual.getArmas().get(i).getAtaque().size(); j++) {
                        if(!partidaActual.getArmas().get(i).getAtaque().get(j).isAlive()){
                            partidaActual.getArmas().get(i).getAtaque().remove(partidaActual.getArmas().get(i).getAtaque().get(j));
                        }
                        
                    }
                    if (partidaActual.getArmas().get(i).getAtaque().isEmpty()){
                        partidaActual.getArmas().get(i).setObjetivo(null);
                    }
                }
            }
            partidaActual.eliminarMuertos(matriz);
            if (muertos == partidaActual.getArmas().size()){
                for (int i = 0; i < partidaActual.getZombies().size(); i++) {
                    if(partidaActual.getZombies().get(i).isActivo()){
                        ThreadMovimientoZombie reliquia = new ThreadMovimientoZombie(partidaActual.getZombies().get(i));
                        reliquia.start();
                    }
                }
                detener();
            }
            
            muertos = 0;
            partidaActual.eliminarMuertos(matriz);
            for (int i = 0; i < partidaActual.getZombies().size(); i++) {
                if(partidaActual.getZombies().get(i).isActivo() && partidaActual.getZombies().get(i).getAtaque().isEmpty()){
                   partidaActual.getZombies().get(i).atacar();
                }
                else if(!partidaActual.getZombies().get(i).isActivo()){
                    muertos++;
                }
                else if (!partidaActual.getZombies().get(i).getAtaque().isEmpty()) {
                    for (int j = 0; j < partidaActual.getZombies().get(i).getAtaque().size(); j++) {
                        if (!partidaActual.getZombies().get(i).getAtaque().get(j).isAlive()) {
                            partidaActual.getZombies().get(i).getAtaque().remove(partidaActual.getZombies().get(i).getAtaque().get(j));
                        }

                    }
                    if (partidaActual.getZombies().get(i).getAtaque().isEmpty()) {
                        partidaActual.getZombies().get(i).setObjetivo(null);
                    }
                }
            }
            partidaActual.eliminarMuertos(matriz);
            if (muertos == partidaActual.getZombies().size()){
                // subir nivel
                detener();
            }
        }
    }
    
    public void guardarPartida(){
        if (this.nombrePartida.equals("")){
            // Pedir un nombre de partida al usuario
        }
        FileManager.writeObject(this.partidaActual, "./src/Partidas/" + this.nombrePartida + ".dat");
    }
    
    public boolean compatibles(Arma arma, Zombie zombie){
        if(zombie.getTipo().equals("Aereo")){
            if (arma.getTipo().equals("AContacto") ){
                return false;
            } else if (arma.getTipo().equals("Impacto")){
                return false;
            }else if (arma.getTipo().equals("MedianoA")){
                return false;
            }
            else if (arma.getTipo().equals("Multiple")){
                return false;
            }
            else {
                return true;
            }
     
        }
        else{
            return true;
        }
        
    }
    
    public boolean compatibles(Zombie zombie, Arma arma){
        if(arma.getTipo().equals("Aereo")){
            if (zombie.getTipo().equals("Contacto")) {
                return false;
            } else if (zombie.getTipo().equals("Choque")) {
                return false;
            } else if (zombie.getTipo().equals("MedianoA")) {
                return false;
            }else {
                return true;
            }
        }
        else{
            return true;
        }
        
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    /**
     * Metodo para verificar el estado del hilo
     *
     * @return boolean
     */
    public boolean isPlaying() {
        return playing;
    }

    /**
     * Metodo para detener el hilo
     */
    public void detener() {
        this.playing = false;
    }

   
    
}
