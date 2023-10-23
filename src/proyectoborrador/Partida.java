/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoborrador;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
    private JPanel GUI;
    
    public Partida(JPanel GUI) {
        this.nivel = 1;
        this.GUI = GUI;
    }
    
    public void addArma(Arma arma){
        this.armas.add(arma);
    }
    
    public void addZombie(Zombie zombie){
        this.zombies.add(zombie);
    }
    
    public void eliminarMuertos(JLabel[][] matriz){
        ImageIcon icon;
        for (int i = 0; i < armas.size(); i++) {
            if(armas.get(i).getVida() <= 0){
               armas.get(i).setActivo(false);
               icon = new ImageIcon(new ImageIcon(armas.get(i).getGif2()).getImage().getScaledInstance(45, 30, Image.SCALE_SMOOTH));
               if (armas.get(i).getTipo().equals("Aereo")){
                   GUI.add(armas.get(i).getLabel());
                   armas.get(i).getLabel().setIcon(icon);
                   armas.get(i).getLabel().setLocation(armas.get(i).getPosX(),armas.get(i).getPosY());
               }else{
                   matriz[armas.get(i).getFila()][armas.get(i).getColumna()].setIcon(icon);
               }
            }
        }
        for (int i = 0; i < zombies.size(); i++) {
            if(zombies.get(i).getVida() <= 0){
                GUI.add(zombies.get(i).getLabel());
                zombies.get(i).setActivo(false);
                icon = new ImageIcon(new ImageIcon(zombies.get(i).getGif2()).getImage().getScaledInstance(45, 30, Image.SCALE_SMOOTH));
                zombies.get(i).getLabel().setIcon(icon);
                zombies.get(i).getLabel().setLocation(zombies.get(i).getPosX(), zombies.get(i).getPosY());
            }
        }
    }
    
    public void subirNivel(){
        this.nivel++;
        for (int i = 0; i < armas.size(); i++) {
            Random rand = new Random();
            int chooser = rand.nextInt(2);
            if (chooser == 0){
                armas.get(i).subirNivel();
            }
        }
        for (int i = 0; i < zombies.size(); i++) {
            Random rand = new Random();
            int chooser = rand.nextInt(2);
            if (chooser == 1) {
                zombies.get(i).subirNivel();
            }
        }
        
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
