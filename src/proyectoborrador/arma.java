/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoborrador;

import java.io.Serializable;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;



/**
 *
 * @author Lenovo
 */
public class Arma extends Char implements Serializable {
    private Zombie objetivo = null;
    private ArrayList<Thread> ataque = new ArrayList<Thread>();
    private JPanel GUI;
    private int fila;
    private int columna;
    private BorradorGUI frame;

    public Arma(String nombre, String tipo, int resistencia, int golpe, int aparicion, String gif, String gif2, int campo) {
        super(nombre, tipo, resistencia, golpe, aparicion, gif, gif2, campo);
        this.setNivel(1);
        setActivo(true);
    }


    @Override
    public String toString() {
        return "Arma: " + getNombre() + "\n De tipo: " + getTipo() + 
               "\n Vida: " + getVida() + "\n Resistencia: " + getResistencia() +
                "\n Capacidad de golpe: " + getGolpe() + "\n Aparicion: " + getAparicion()
                + "\n Campo que ocupa: " + getCampo();
    
    
    
    
    }
    
    public void atacar(){
        if (this.getTipo().equals("AContacto")){
            ThreadAcercamiento thread = new ThreadAcercamiento(this,objetivo, GUI);
            ataque.add(thread);
            thread.start();
        }
        else if (this.getTipo().equals("MedianoA")){
            if(Math.sqrt((Math.abs(getPosX() - objetivo.getPosX())^2) +(Math.abs(getPosY() - objetivo.getPosY())^2)) > 10){
                
            }else{
                ThreadDisparo threadD = new ThreadDisparo(this,objetivo,GUI);
                ataque.add(threadD);
                threadD.start();
            }
        }
        else if (this.getTipo().equals("Aereo")){
            ThreadAcercamiento thread = new ThreadAcercamiento(this,objetivo, GUI);
            ataque.add(thread);
            thread.start();
            while(thread.isAlive()) {
            }
                ThreadDisparo threadD = new ThreadDisparo(this,objetivo, GUI);
                ataque.add(threadD);
                threadD.start();
        }
        else if (this.getTipo().equals("Impacto")){
            ThreadExplosion thread = new ThreadExplosion(this,objetivo, GUI);
            ataque.add(thread);
            thread.start();
        }
        else if (this.getTipo().equals("Multiple")){
            if (Math.sqrt((Math.abs(getPosX() - objetivo.getPosX()) ^ 2) + (Math.abs(getPosY() - objetivo.getPosY()) ^ 2)) > 10) {

            } else {
                ThreadDisparo threadD = new ThreadDisparo(this,objetivo, GUI);
                ThreadDisparo threadD1 = new ThreadDisparo(this,objetivo,GUI);
                ThreadDisparo threadD2 = new ThreadDisparo(this,objetivo, GUI);
                ataque.add(threadD);
                ataque.add(threadD1);
                ataque.add(threadD2);
                threadD.start();
                try {
                    sleep(100);
                } catch (InterruptedException ex) {
                }
                threadD1.start();
                try {
                    sleep(100);
                } catch (InterruptedException ex) {
                }
                threadD2.start();
                try {
                    sleep(100);
                } catch (InterruptedException ex) {
                }
            }
        }
        else if (this.getTipo().equals("Bloque")){
            
        }
    }

    public Zombie getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Zombie objetivo) {
        this.objetivo = objetivo;
    }

    public ArrayList<Thread> getAtaque() {
        return ataque;
    }

    public void setAtaque(ArrayList<Thread> ataque) {
        this.ataque = ataque;
    }

    public JPanel getGUI() {
        return GUI;
    }

    public void setGUI(JPanel GUI) {
        this.GUI = GUI;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public BorradorGUI getFrame() {
        return frame;
    }

    public void setFrame(BorradorGUI frame) {
        this.frame = frame;
    }
    
    
    
    
    
}
    

    
    
    
    

