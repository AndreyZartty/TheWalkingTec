/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoborrador;

import java.io.Serializable;
import java.util.ArrayList;
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
    private JLabel aereo;
    private int fila;
    private int columna;
    

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
            ataque.remove(thread);
        }
        else if (this.getTipo().equals("MedianoA")){
            ThreadDisparo threadD = new ThreadDisparo(this,objetivo,GUI);
            ataque.add(threadD);
            threadD.start();
            ataque.remove(threadD);
        }
        else if (this.getTipo().equals("Aereo")){
            ThreadAcercamiento thread = new ThreadAcercamiento(this,objetivo, GUI);
            ataque.add(thread);
            thread.start();
            ataque.remove(thread);
            ThreadDisparo threadD = new ThreadDisparo(this,objetivo, GUI);
            ataque.add(threadD);
            threadD.start();
            ataque.remove(threadD);
        }
        else if (this.getTipo().equals("Impacto")){
            ThreadExplosion thread = new ThreadExplosion(this,objetivo);
            ataque.add(thread);
            thread.start();
            ataque.remove(thread);
        }
        else if (this.getTipo().equals("Multiple")){
            ThreadDisparo threadD = new ThreadDisparo(this,objetivo, GUI);
            ThreadDisparo threadD1 = new ThreadDisparo(this,objetivo,GUI);
            ThreadDisparo threadD2 = new ThreadDisparo(this,objetivo, GUI);
            ataque.add(threadD);
            ataque.add(threadD1);
            ataque.add(threadD2);
            threadD.start();
            threadD1.start();
            threadD2.start();
            ataque.remove(threadD);
            ataque.remove(threadD1);
            ataque.remove(threadD2);
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

    public JLabel getAereo() {
        return aereo;
    }

    public void setAereo(JLabel aereo) {
        this.aereo = aereo;
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
    
    
    
    
    
}
    

    
    
    
    

