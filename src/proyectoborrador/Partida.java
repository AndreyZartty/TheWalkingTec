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
    private ArrayList<Arma> armas = new ArrayList<>();
    private ArrayList<Zombie> zombies = new ArrayList<>();
    private String nombre;
    private int ejercitoArmas;
    private int ejercitoZombies;
    
    public Partida() {
        this.nivel = 1;
    }
    
    public void addArma(Arma arma){
        this.armas.add(arma);
    }
    
    public void addZombie(Zombie zombie){
        this.zombies.add(zombie);
    }
    
    public void eliminarMuertos(){
        for (int i = 0; i < armas.size(); i++) {
            if(armas.get(i).getVida() <= 0){
               armas.get(i).setActivo(false);
            }
        }
        for (int i = 0; i < zombies.size(); i++) {
            if(zombies.get(i).getVida() <= 0){
               zombies.get(i).setActivo(false);
            }
        }
    }
    
    public void subirNivel(){
        this.nivel++;
        if (this.nivel == 10){
            // Mensaje de juego completado
        }
        
    }
    
    
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<Arma> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Arma> armas) {
        this.armas = armas;
    }

    public ArrayList<Zombie> getZombies() {
        return zombies;
    }

    public void setZombies(ArrayList<Zombie> zombies) {
        this.zombies = zombies;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEjercitoArmas() {
        return ejercitoArmas;
    }

    public void addEjercitoArmas(int ejercitoArmas) {
        this.ejercitoArmas += ejercitoArmas;
    }

    public int getEjercitoZombies() {
        return ejercitoZombies;
    }

    public void addEjercitoZombies(int ejercitoZombies) {
        this.ejercitoZombies += ejercitoZombies;
    }
    
    
    
}
