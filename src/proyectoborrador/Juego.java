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
public class Juego {
    private int nivel;
    private ArrayList<arma> armas = new ArrayList<>();
    private ArrayList<zombie> zombies = new ArrayList<>();

    public Juego(String path){
        FileManager.readObject(path); // Se lee el archivo de configuracion
        // creacion de armas
        
        // creacion de zombies
        
        // logica
        while (true){
            break;
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
