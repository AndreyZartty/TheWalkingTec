/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoborrador;

import java.util.ArrayList;

/**
 *
 * @author XPC
 */
public class Partida {
    private int nivel;
    private ArrayList<arma> armas = new ArrayList<>();
    private ArrayList<zombie> zombies = new ArrayList<>();
    
    public Partida() {
        this.nivel = 1;
    }
    
    public void addArma(arma Arma){
        this.armas.add(Arma);
    }
    
    public void addZombie(zombie Zombie){
        this.zombies.add(Zombie);
    }
    
    public void eliminarMuertos(){
        for (int i = 0; i < armas.size(); i++) {
            if(armas.get(i).getVida() == 0){
               armas.get(i).setActivo(false);
            }
        }
        for (int i = 0; i < zombies.size(); i++) {
            if(zombies.get(i).getVida() == 0){
               zombies.get(i).setActivo(false);
            }
        }
    }
    
    public void ataques(){
        for (int i = 0; i < armas.size(); i++) {
            if(armas.get(i).getVida() == 0){
               armas.get(i).setActivo(false);
            }
        }
        for (int i = 0; i < zombies.size(); i++) {
            if(zombies.get(i).getVida() == 0){
               zombies.get(i).setActivo(false);
            }
        }
    }
    
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<arma> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<arma> armas) {
        this.armas = armas;
    }

    public ArrayList<zombie> getZombies() {
        return zombies;
    }

    public void setZombies(ArrayList<zombie> zombies) {
        this.zombies = zombies;
    }
    
    
}
